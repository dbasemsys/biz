
package bizbuilder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class customer_form extends javax.swing.JFrame {

    /**
     * Creates new form customer_form
     */
    public customer_form() {
        initComponents();
        
        cmb_type.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                visibility();
            }
        });
        
        btn_new_shop_ser.setVisible(false);
        shop_ser_pane.setVisible(false);
        btn_new_order_ser.setVisible(false);
        order_ser_pane.setVisible(false);
        btn_new_order_ser_exp.setVisible(false);
        order_ser_exp_pane.setVisible(false);
        lbl_shop_ser.setVisible(false);
        lbl_order_ser.setVisible(false);
        lbl_order_ser_exp.setVisible(false);
        lbl_price.setVisible(false);
        Price.setVisible(false);
        
    }  
    
    
    public void visibility() {
        String Type = (String) cmb_type.getSelectedItem();
        if(Type.equals("None"))
        {
            btn_new_shop_ser.setVisible(false);
            shop_ser_pane.setVisible(false);
            btn_new_order_ser.setVisible(false);
            order_ser_pane.setVisible(false);
            btn_new_order_ser_exp.setVisible(false);
            order_ser_exp_pane.setVisible(false);
            lbl_shop_ser.setVisible(false);
            lbl_order_ser.setVisible(false);
            lbl_order_ser_exp.setVisible(false);
            lbl_price.setVisible(false);
            Price.setVisible(false);
            
        }
        else 
        {
            if(Type.equals("Ordering"))
            {
                btn_new_shop_ser.setVisible(false);
                shop_ser_pane.setVisible(false);
                lbl_order_ser.setVisible(true);
                lbl_order_ser_exp.setVisible(true); 
                btn_new_order_ser.setVisible(true);
                order_ser_pane.setVisible(true);
                btn_new_order_ser_exp.setVisible(true);
                order_ser_exp_pane.setVisible(true);
                lbl_shop_ser.setVisible(false);
                lbl_price.setVisible(true);
                Price.setVisible(true);            
            }
            else
            {
                lbl_shop_ser.setVisible(true);
                btn_new_shop_ser.setVisible(true);
                shop_ser_pane.setVisible(true);
                btn_new_order_ser.setVisible(false);
                order_ser_pane.setVisible(false);
                btn_new_order_ser_exp.setVisible(false);
                order_ser_exp_pane.setVisible(false);
                lbl_order_ser.setVisible(false);
                lbl_order_ser_exp.setVisible(false);
                lbl_price.setVisible(true);
                Price.setVisible(true);
            }
        }
         
                
    }
    

    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_br = new javax.swing.JLabel();
        txt_br = new javax.swing.JTextField();
        lbl_cid = new javax.swing.JLabel();
        txt_cid = new javax.swing.JTextField();
        lbl_cname = new javax.swing.JLabel();
        txt_cname = new javax.swing.JTextField();
        lbl_phone = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        lbl_type = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        lbl_shop_ser = new javax.swing.JLabel();
        cmb_type = new rojerusan.RSComboMetro();
        btn_new_shop_ser = new javax.swing.JButton();
        shop_ser_pane = new bizbuilder.Scrollpane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_shop_ser = new javax.swing.JTable();
        lbl_order_ser = new javax.swing.JLabel();
        btn_new_order_ser = new javax.swing.JButton();
        order_ser_pane = new bizbuilder.Scrollpane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_order_ser = new javax.swing.JTable();
        lbl_order_ser_exp = new javax.swing.JLabel();
        btn_new_order_ser_exp = new javax.swing.JButton();
        order_ser_exp_pane = new bizbuilder.Scrollpane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_order_ser_exp = new javax.swing.JTable();
        Price = new javax.swing.JTextField();
        lbl_price = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_br.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_br.setText("Branch");

        txt_br.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_br.setForeground(new java.awt.Color(102, 102, 255));
        txt_br.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        lbl_cid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cid.setText("Customer ID");

        txt_cid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cid.setForeground(new java.awt.Color(102, 102, 255));
        txt_cid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        lbl_cname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cname.setText("Customer Name");

        txt_cname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cname.setForeground(new java.awt.Color(102, 102, 255));
        txt_cname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        lbl_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_phone.setText("Phone Number");

        txt_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(102, 102, 255));
        txt_phone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        lbl_type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_type.setText("Service Type");

        lbl_date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_date.setText("Service Date");

        txt_date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_date.setForeground(new java.awt.Color(102, 102, 255));
        txt_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        lbl_shop_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_shop_ser.setText("Offered service");

        cmb_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Shop", "Ordering" }));
        cmb_type.setColorArrow(new java.awt.Color(102, 102, 255));
        cmb_type.setColorBorde(new java.awt.Color(102, 102, 255));
        cmb_type.setColorFondo(new java.awt.Color(102, 102, 255));
        cmb_type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btn_new_shop_ser.setBackground(new java.awt.Color(102, 102, 255));
        btn_new_shop_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_new_shop_ser.setForeground(new java.awt.Color(255, 255, 255));
        btn_new_shop_ser.setText("New");
        btn_new_shop_ser.setBorderPainted(false);

        tbl_shop_ser.setForeground(new java.awt.Color(102, 102, 255));
        tbl_shop_ser.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_shop_ser.setGridColor(new java.awt.Color(102, 102, 255));
        jScrollPane2.setViewportView(tbl_shop_ser);

        shop_ser_pane.setViewportView(jScrollPane2);

        lbl_order_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_order_ser.setText("Ordering Services");

        btn_new_order_ser.setBackground(new java.awt.Color(102, 102, 255));
        btn_new_order_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_new_order_ser.setForeground(new java.awt.Color(255, 255, 255));
        btn_new_order_ser.setText("New");
        btn_new_order_ser.setBorderPainted(false);
        btn_new_order_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_order_serActionPerformed(evt);
            }
        });

        tbl_order_ser.setForeground(new java.awt.Color(102, 102, 255));
        tbl_order_ser.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_order_ser.setGridColor(new java.awt.Color(102, 102, 255));
        jScrollPane3.setViewportView(tbl_order_ser);

        order_ser_pane.setViewportView(jScrollPane3);

        lbl_order_ser_exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_order_ser_exp.setText("Ordering Service Expenses");

        btn_new_order_ser_exp.setBackground(new java.awt.Color(102, 102, 255));
        btn_new_order_ser_exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_new_order_ser_exp.setForeground(new java.awt.Color(255, 255, 255));
        btn_new_order_ser_exp.setText("New");
        btn_new_order_ser_exp.setBorderPainted(false);

        tbl_order_ser_exp.setForeground(new java.awt.Color(102, 102, 255));
        tbl_order_ser_exp.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_order_ser_exp.setGridColor(new java.awt.Color(102, 102, 255));
        jScrollPane4.setViewportView(tbl_order_ser_exp);

        order_ser_exp_pane.setViewportView(jScrollPane4);

        Price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Price.setForeground(new java.awt.Color(102, 102, 255));
        Price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        lbl_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_price.setText("Price");

        btn_cancel.setBackground(new java.awt.Color(102, 102, 255));
        btn_cancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.setBorderPainted(false);

        btn_save.setBackground(new java.awt.Color(102, 102, 255));
        btn_save.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Save");
        btn_save.setBorderPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_order_ser_exp)
                            .addComponent(lbl_price)
                            .addComponent(lbl_order_ser)
                            .addComponent(lbl_shop_ser)
                            .addComponent(lbl_br)
                            .addComponent(lbl_cid)
                            .addComponent(lbl_cname)
                            .addComponent(lbl_phone)
                            .addComponent(lbl_type)
                            .addComponent(lbl_date))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(order_ser_pane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(order_ser_exp_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txt_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(cmb_type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txt_phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txt_cname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txt_cid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txt_br, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(shop_ser_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btn_new_shop_ser, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(btn_new_order_ser_exp, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(btn_new_order_ser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                            .addComponent(Price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_br)
                    .addComponent(txt_br, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cid)
                    .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cname)
                    .addComponent(txt_cname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_phone)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_type)
                    .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_date)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_shop_ser)
                    .addComponent(btn_new_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shop_ser_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_order_ser)
                    .addComponent(btn_new_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(order_ser_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_order_ser_exp)
                    .addComponent(btn_new_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(order_ser_exp_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel)
                    .addComponent(btn_save))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_new_order_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_order_serActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_new_order_serActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Price;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_new_order_ser;
    private javax.swing.JButton btn_new_order_ser_exp;
    private javax.swing.JButton btn_new_shop_ser;
    private javax.swing.JButton btn_save;
    private rojerusan.RSComboMetro cmb_type;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_br;
    private javax.swing.JLabel lbl_cid;
    private javax.swing.JLabel lbl_cname;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_order_ser;
    private javax.swing.JLabel lbl_order_ser_exp;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_shop_ser;
    private javax.swing.JLabel lbl_type;
    private bizbuilder.Scrollpane order_ser_exp_pane;
    private bizbuilder.Scrollpane order_ser_pane;
    private bizbuilder.Scrollpane shop_ser_pane;
    private javax.swing.JTable tbl_order_ser;
    private javax.swing.JTable tbl_order_ser_exp;
    private javax.swing.JTable tbl_shop_ser;
    private javax.swing.JTextField txt_br;
    private javax.swing.JTextField txt_cid;
    private javax.swing.JTextField txt_cname;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
