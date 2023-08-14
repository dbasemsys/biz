package bizbuilder;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class customer_details extends javax.swing.JFrame {

    // ... Other components ...

    public customer_details() {
        initComponents();
        setCustomerDetails();
        jPanel1.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        Offered_table.setVisible(false);
        Order_table.setVisible(false);
        Order_exp_table.setVisible(false);
        jTable4.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = jTable4.getSelectedRow();
                    if (selectedRow != -1) {
                        populateDetailView(selectedRow);
                    }
                }
            }
        });
    }
    
    private void populateDetailView(int selectedRow) {
        // Retrieve data from the JTable model for the selected row
        
        if (jTextField1 != null && jTextField2 != null && jTextField3 != null && jTextField4 != null) {
            Object column0 = jTable4.getValueAt(selectedRow, 0);
            Object column1 = jTable4.getValueAt(selectedRow, 1);
            Object column2 = jTable4.getValueAt(selectedRow, 2);
            Object column3 = jTable4.getValueAt(selectedRow, 3);
            Object column4 = jTable4.getValueAt(selectedRow, 4);
            Object column5 = jTable4.getValueAt(selectedRow, 5);
            Object column6 = jTable4.getValueAt(selectedRow, 6);
            String Type = (String) jTable4.getValueAt(selectedRow, 3);
            jTextField1.setText(column5.toString());
            jTextField2.setText(column0.toString());
            jTextField3.setText(column1.toString());
            jTextField4.setText(column2.toString());
            jTextField6.setText(column4.toString()); 
            jTextField7.setText(column6.toString()); 
            Service_Type.setText(column3.toString());
            
            int c_id =Integer.parseInt(jTextField2.getText());      // Customer Id value to use as parameteers           
            
            if(Service_Type.getText().equals("Shop")){
                jLabel7.setVisible(true);
                jLabel8.setVisible(false);
                jLabel9.setVisible(false);
                Offered_table.setVisible(true);
                Order_table.setVisible(false);
                Order_exp_table.setVisible(false);
                jPanel1.setVisible(true);
                setShopServiceDetails(c_id);            //  Calling Shop Service Deatils Method with Parameter
    
            }else{
                jLabel7.setVisible(false);
                jLabel8.setVisible(true);
                jLabel9.setVisible(true);
                Offered_table.setVisible(false);
                Order_table.setVisible(true);
                Order_exp_table.setVisible(true);
                jPanel1.setVisible(true);
                setOrderServiceDetails(c_id);           //  Calling Ordering Service Details Method with Parameter
                setOrderServiceExpenseDetails(c_id);    //  Calling Ordering Service Expense Method with Parameter
            }
        }
    }

   //Set Customer Details into Table   
    public void setCustomerDetails()
    {     
        DefaultTableModel model;
        try
        {         

            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from customer ";            
            ResultSet rs = st.executeQuery(sql);
                        
            while(rs.next())
            {
                String customer_id,customer_name,phone,service_type,serviced_date,branch,discount,total_price;
                
                customer_id = rs.getString("customer_id");
                customer_name = rs.getString("customer_name");
                phone = rs.getString("phone");
                service_type = rs.getString("service_type");
                serviced_date = rs.getString("serviced_date");
                branch = rs.getString("branch");
                discount = rs.getString("discount");                 
                total_price = rs.getString("total_price");                 
                 
                Object[] obj = {customer_id,customer_name,phone,service_type,serviced_date,branch,discount,total_price};
                model = (DefaultTableModel) jTable4.getModel();
                model.addRow(obj);

            }                       
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
    }    
    
    //Set Shop Service Details into Table    
    public void setShopServiceDetails(int x)
    {         
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        try
        {            
            int c_id = x;
            Connection con = DBConnection.getConnection();
            String sql = "select * from shop_services where customer_id=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1,c_id);                   
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                String service_id,customer_id ,service,price;
                
                service_id = rs.getString("service_id");
                customer_id = rs.getString("customer_id");                
                service = rs.getString("service");
                price = rs.getString("price");
                                                
                Object[] obj2 = {service_id,customer_id ,service,price};                
                model.addRow(obj2);
            }               
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }        
    }
    
    //Set Order Service Details into Table
    public void setOrderServiceDetails(int x)
    {  
        DefaultTableModel model;
        model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        
        try
        {            
            int c_id = x;
            Connection con = DBConnection.getConnection();
            String sql = "select * from ordering_services where customer_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1,c_id);                   
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                String service_id,customer_id ,service,price;
                
                service_id = rs.getString("service_id");
                customer_id = rs.getString("customer_id");                
                service = rs.getString("service");
                price = rs.getString("price");
                                                
                Object[] obj2 = {service_id,customer_id ,service,price};                
                model.addRow(obj2);
            }            
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
    }
    
    //Set Order Service Expenses Details into Table
    public void setOrderServiceExpenseDetails(int x)
    {  
        DefaultTableModel model;
        model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);
        
        try
        {            
            int c_id = x;
            Connection con = DBConnection.getConnection();
            String sql = "select * from ordering_service_expenses where customer_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1,c_id);                   
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                String expense_id,customer_id ,expense,price;
                
                expense_id = rs.getString("expense_id");
                customer_id = rs.getString("customer_id");                
                expense = rs.getString("expense");
                price = rs.getString("price");
                                                
                Object[] obj2 = {expense_id,customer_id ,expense,price};                
                model.addRow(obj2);
            }            
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollpane2 = new bizbuilder.Scrollpane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Offered_table = new bizbuilder.Scrollpane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Order_exp_table = new bizbuilder.Scrollpane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Service_Type = new javax.swing.JTextField();
        Order_table = new bizbuilder.Scrollpane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        scrollpane1 = new bizbuilder.Scrollpane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable4 = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Branch");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 255));
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Customer ID");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 255));
        jTextField2.setToolTipText("");
        jTextField2.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Customer Name");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 102, 255));
        jTextField3.setToolTipText("");
        jTextField3.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Phone Number");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(102, 102, 255));
        jTextField4.setToolTipText("");
        jTextField4.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Service Type");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Service Date");

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(102, 102, 255));
        jTextField6.setToolTipText("");
        jTextField6.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Offered service");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "service_id", "customer_id", "service", "price"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(30);
            jTable1.getColumnModel().getColumn(1).setMinWidth(30);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(3).setMinWidth(50);
        }

        Offered_table.setViewportView(jScrollPane2);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Ordering Services");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Ordering Service Expenses");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        Order_exp_table.setViewportView(jScrollPane4);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(102, 102, 255));
        jTextField7.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Price");

        Service_Type.setEditable(false);
        Service_Type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Service_Type.setForeground(new java.awt.Color(102, 102, 255));
        Service_Type.setToolTipText("");
        Service_Type.setBorder(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        Order_table.setViewportView(jScrollPane3);

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit 16px.png"))); // NOI18N
        jButton1.setText("Edit");
        jButton1.setBorderPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Service_Type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Order_table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Offered_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Order_exp_table, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Service_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Offered_table, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Order_table, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Order_exp_table, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        scrollpane2.setViewportView(jPanel1);

        getContentPane().add(scrollpane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 500, 500));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Id", "Customet Name", "Phone", "Service Type", "Serviced Date", "Branch", "Total Price"
            }
        ));
        jTable4.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        jTable4.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        jTable4.setColorBordeHead(new java.awt.Color(255, 255, 255));
        jTable4.setColorFilasForeground1(new java.awt.Color(102, 102, 255));
        jTable4.setColorFilasForeground2(new java.awt.Color(102, 102, 255));
        jTable4.setRowHeight(25);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setMinWidth(150);
            jTable4.getColumnModel().getColumn(1).setMinWidth(250);
        }

        scrollpane1.setViewportView(jScrollPane1);

        getContentPane().add(scrollpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable4MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(customer_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private bizbuilder.Scrollpane Offered_table;
    private bizbuilder.Scrollpane Order_exp_table;
    private bizbuilder.Scrollpane Order_table;
    private javax.swing.JTextField Service_Type;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private rojeru_san.complementos.RSTableMetro jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private bizbuilder.Scrollpane scrollpane1;
    private bizbuilder.Scrollpane scrollpane2;
    // End of variables declaration//GEN-END:variables
}
