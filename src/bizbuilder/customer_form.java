
package bizbuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class customer_form extends javax.swing.JFrame {


    public customer_form() {
        initComponents();
        shop_ser_panel.setVisible(false);
        order_panel.setVisible(false);
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        common_panel1 = new javax.swing.JPanel();
        lbl_br = new javax.swing.JLabel();
        lbl_cid = new javax.swing.JLabel();
        lbl_cname = new javax.swing.JLabel();
        lbl_phone = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        cmb_type = new rojerusan.RSComboMetro();
        txt_phone = new javax.swing.JTextField();
        txt_cname = new javax.swing.JTextField();
        txt_cid = new javax.swing.JTextField();
        lbl_order_ser7 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        cmb_br = new rojerusan.RSComboMetro();
        lbl_order_ser8 = new javax.swing.JLabel();
        txt_dis = new javax.swing.JTextField();
        order_panel = new javax.swing.JPanel();
        order_ser_panel = new javax.swing.JPanel();
        txt_order_ser_price = new javax.swing.JTextField();
        lbl_shop_ser1 = new javax.swing.JLabel();
        lbl_order_ser3 = new javax.swing.JLabel();
        lbl_order_ser4 = new javax.swing.JLabel();
        btn_add_order_ser = new javax.swing.JButton();
        cmb_order_ser = new javax.swing.JComboBox<>();
        scrollpane_order_ser = new bizbuilder.Scrollpane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_order_ser = new javax.swing.JTable();
        btn_dl_order_ser = new javax.swing.JButton();
        order_ser_exp_panel = new javax.swing.JPanel();
        txt_order_ser_exp_price = new javax.swing.JTextField();
        lbl_shop_ser2 = new javax.swing.JLabel();
        lbl_order_ser5 = new javax.swing.JLabel();
        lbl_order_ser6 = new javax.swing.JLabel();
        btn_add_order_ser_exp = new javax.swing.JButton();
        cmb_order_ser_exp = new javax.swing.JComboBox<>();
        scrollpane_order_ser_exp = new bizbuilder.Scrollpane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_order_ser_exp = new javax.swing.JTable();
        btn_dl_order_ser_exp = new javax.swing.JButton();
        shop_ser_panel = new javax.swing.JPanel();
        txt_shop_ser_price = new javax.swing.JTextField();
        lbl_shop_ser = new javax.swing.JLabel();
        lbl_order_ser1 = new javax.swing.JLabel();
        lbl_order_ser2 = new javax.swing.JLabel();
        btn_dl_shop_ser = new javax.swing.JButton();
        cmb_shop_ser = new javax.swing.JComboBox<>();
        scrollpane_shop_ser = new bizbuilder.Scrollpane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_shop_ser = new javax.swing.JTable();
        btn_add_shop_ser = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_cance = new javax.swing.JButton();
        btn_cance1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        common_panel1.setBackground(new java.awt.Color(204, 204, 255));

        lbl_br.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_br.setText("Branch");

        lbl_cid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cid.setText("Customer ID");

        lbl_cname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cname.setText("Customer Name");

        lbl_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_phone.setText("Phone Number");

        lbl_type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_type.setText("Service Type");

        lbl_date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_date.setText("Service Date");

        txt_date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_date.setForeground(new java.awt.Color(102, 102, 255));
        txt_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cmb_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Shop", "Ordering" }));
        cmb_type.setColorArrow(new java.awt.Color(102, 102, 255));
        cmb_type.setColorBorde(new java.awt.Color(102, 102, 255));
        cmb_type.setColorFondo(new java.awt.Color(102, 102, 255));
        cmb_type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmb_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_typeActionPerformed(evt);
            }
        });

        txt_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(102, 102, 255));
        txt_phone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        txt_cname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cname.setForeground(new java.awt.Color(102, 102, 255));
        txt_cname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        txt_cid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cid.setForeground(new java.awt.Color(102, 102, 255));
        txt_cid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        lbl_order_ser7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_order_ser7.setText("Discount");

        txt_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_price.setForeground(new java.awt.Color(102, 102, 255));
        txt_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cmb_br.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ...", "Branch1", "Branch2" }));
        cmb_br.setColorArrow(new java.awt.Color(102, 102, 255));
        cmb_br.setColorBorde(new java.awt.Color(102, 102, 255));
        cmb_br.setColorFondo(new java.awt.Color(102, 102, 255));
        cmb_br.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmb_br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_brActionPerformed(evt);
            }
        });

        lbl_order_ser8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_order_ser8.setText("Price");

        txt_dis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_dis.setForeground(new java.awt.Color(102, 102, 255));
        txt_dis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        javax.swing.GroupLayout common_panel1Layout = new javax.swing.GroupLayout(common_panel1);
        common_panel1.setLayout(common_panel1Layout);
        common_panel1Layout.setHorizontalGroup(
            common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(common_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(common_panel1Layout.createSequentialGroup()
                        .addComponent(lbl_br)
                        .addGap(139, 139, 139)
                        .addComponent(cmb_br, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, common_panel1Layout.createSequentialGroup()
                        .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cid)
                            .addComponent(lbl_cname)
                            .addComponent(lbl_phone)
                            .addComponent(lbl_type)
                            .addComponent(lbl_date)
                            .addComponent(lbl_order_ser7)
                            .addComponent(lbl_order_ser8))
                        .addGap(90, 90, 90)
                        .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_price)
                            .addComponent(txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(txt_phone)
                            .addComponent(txt_cname)
                            .addComponent(txt_cid)
                            .addComponent(txt_dis))
                        .addGap(76, 76, 76))))
        );
        common_panel1Layout.setVerticalGroup(
            common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(common_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_br)
                    .addComponent(cmb_br, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cid)
                    .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cname)
                    .addComponent(txt_cname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_phone)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_type)
                    .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_date)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_order_ser7)
                    .addComponent(txt_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_order_ser8)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        order_panel.setBackground(new java.awt.Color(204, 255, 204));

        order_ser_panel.setBackground(new java.awt.Color(255, 204, 204));

        txt_order_ser_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_order_ser_price.setForeground(new java.awt.Color(102, 102, 255));
        txt_order_ser_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        lbl_shop_ser1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_shop_ser1.setText("Order Service");

        lbl_order_ser3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_order_ser3.setText("Service");

        lbl_order_ser4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_order_ser4.setText("Price");

        btn_add_order_ser.setBackground(new java.awt.Color(102, 102, 255));
        btn_add_order_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_add_order_ser.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_order_ser.setText("Add");
        btn_add_order_ser.setBorderPainted(false);
        btn_add_order_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_order_serActionPerformed(evt);
            }
        });

        cmb_order_ser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Bridal Makeup", "Reception Makeup", "Muslim Bridal Makeup", "Muslim Reception Makeup", "Party Makeup" }));
        cmb_order_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_order_serActionPerformed(evt);
            }
        });

        tbl_order_ser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service", "Price"
            }
        ));
        jScrollPane2.setViewportView(tbl_order_ser);
        if (tbl_order_ser.getColumnModel().getColumnCount() > 0) {
            tbl_order_ser.getColumnModel().getColumn(0).setMinWidth(150);
            tbl_order_ser.getColumnModel().getColumn(1).setMinWidth(80);
        }

        scrollpane_order_ser.setViewportView(jScrollPane2);

        btn_dl_order_ser.setBackground(new java.awt.Color(102, 102, 255));
        btn_dl_order_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_dl_order_ser.setForeground(new java.awt.Color(255, 255, 255));
        btn_dl_order_ser.setText("Delete");
        btn_dl_order_ser.setBorderPainted(false);
        btn_dl_order_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dl_order_serActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout order_ser_panelLayout = new javax.swing.GroupLayout(order_ser_panel);
        order_ser_panel.setLayout(order_ser_panelLayout);
        order_ser_panelLayout.setHorizontalGroup(
            order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_ser_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(order_ser_panelLayout.createSequentialGroup()
                        .addComponent(scrollpane_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(order_ser_panelLayout.createSequentialGroup()
                        .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_shop_ser1)
                            .addComponent(lbl_order_ser3)
                            .addComponent(cmb_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(order_ser_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_order_ser4)
                                    .addComponent(txt_order_ser_price, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 99, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, order_ser_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_add_order_ser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_dl_order_ser)
                                .addGap(26, 26, 26))))))
        );
        order_ser_panelLayout.setVerticalGroup(
            order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_ser_panelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_shop_ser1)
                    .addComponent(btn_add_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dl_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_order_ser3)
                    .addComponent(lbl_order_ser4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_order_ser_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        order_ser_exp_panel.setBackground(new java.awt.Color(255, 204, 204));

        txt_order_ser_exp_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_order_ser_exp_price.setForeground(new java.awt.Color(102, 102, 255));
        txt_order_ser_exp_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        lbl_shop_ser2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_shop_ser2.setText("Order Service Expense");

        lbl_order_ser5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_order_ser5.setText("Service");

        lbl_order_ser6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_order_ser6.setText("Price");

        btn_add_order_ser_exp.setBackground(new java.awt.Color(102, 102, 255));
        btn_add_order_ser_exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_add_order_ser_exp.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_order_ser_exp.setText("Add");
        btn_add_order_ser_exp.setBorderPainted(false);
        btn_add_order_ser_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_order_ser_expActionPerformed(evt);
            }
        });

        cmb_order_ser_exp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Jewells", "Boquet", "Head Dress", "Travel", "Beverage" }));
        cmb_order_ser_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_order_ser_expActionPerformed(evt);
            }
        });

        tbl_order_ser_exp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Expense", "Cost"
            }
        ));
        jScrollPane3.setViewportView(tbl_order_ser_exp);
        if (tbl_order_ser_exp.getColumnModel().getColumnCount() > 0) {
            tbl_order_ser_exp.getColumnModel().getColumn(0).setMinWidth(150);
            tbl_order_ser_exp.getColumnModel().getColumn(1).setMinWidth(80);
        }

        scrollpane_order_ser_exp.setViewportView(jScrollPane3);

        btn_dl_order_ser_exp.setBackground(new java.awt.Color(102, 102, 255));
        btn_dl_order_ser_exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_dl_order_ser_exp.setForeground(new java.awt.Color(255, 255, 255));
        btn_dl_order_ser_exp.setText("Delete");
        btn_dl_order_ser_exp.setBorderPainted(false);
        btn_dl_order_ser_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dl_order_ser_expActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout order_ser_exp_panelLayout = new javax.swing.GroupLayout(order_ser_exp_panel);
        order_ser_exp_panel.setLayout(order_ser_exp_panelLayout);
        order_ser_exp_panelLayout.setHorizontalGroup(
            order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_ser_exp_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(order_ser_exp_panelLayout.createSequentialGroup()
                        .addComponent(scrollpane_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(order_ser_exp_panelLayout.createSequentialGroup()
                        .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_shop_ser2)
                            .addComponent(lbl_order_ser5)
                            .addComponent(cmb_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(order_ser_exp_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_order_ser6)
                                    .addComponent(txt_order_ser_exp_price, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 99, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, order_ser_exp_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_add_order_ser_exp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_dl_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        order_ser_exp_panelLayout.setVerticalGroup(
            order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_ser_exp_panelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_shop_ser2)
                    .addComponent(btn_add_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dl_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_order_ser5)
                    .addComponent(lbl_order_ser6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_order_ser_exp_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout order_panelLayout = new javax.swing.GroupLayout(order_panel);
        order_panel.setLayout(order_panelLayout);
        order_panelLayout.setHorizontalGroup(
            order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(order_ser_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(order_ser_exp_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        order_panelLayout.setVerticalGroup(
            order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(order_ser_exp_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(order_ser_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        shop_ser_panel.setBackground(new java.awt.Color(255, 204, 204));

        txt_shop_ser_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_shop_ser_price.setForeground(new java.awt.Color(102, 102, 255));
        txt_shop_ser_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        lbl_shop_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_shop_ser.setText("Shop Service");

        lbl_order_ser1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_order_ser1.setText("Service");

        lbl_order_ser2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_order_ser2.setText("Price");

        btn_dl_shop_ser.setBackground(new java.awt.Color(102, 102, 255));
        btn_dl_shop_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_dl_shop_ser.setForeground(new java.awt.Color(255, 255, 255));
        btn_dl_shop_ser.setText("Delete");
        btn_dl_shop_ser.setBorderPainted(false);
        btn_dl_shop_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dl_shop_serActionPerformed(evt);
            }
        });

        cmb_shop_ser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Eyebrow Threading", "Facial threading", "Normal Facial", "Gold facial", "Silver Facial", "Manicure", "Pedicure", "Haor Cut", "Layer Hair Cut", "Hair Starightning" }));
        cmb_shop_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_shop_serActionPerformed(evt);
            }
        });

        tbl_shop_ser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service", "Price"
            }
        ));
        tbl_shop_ser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_shop_serMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_shop_ser);
        if (tbl_shop_ser.getColumnModel().getColumnCount() > 0) {
            tbl_shop_ser.getColumnModel().getColumn(0).setMinWidth(150);
            tbl_shop_ser.getColumnModel().getColumn(1).setMinWidth(80);
        }

        scrollpane_shop_ser.setViewportView(jScrollPane1);

        btn_add_shop_ser.setBackground(new java.awt.Color(102, 102, 255));
        btn_add_shop_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_add_shop_ser.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_shop_ser.setText("Add");
        btn_add_shop_ser.setBorderPainted(false);
        btn_add_shop_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_shop_serActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout shop_ser_panelLayout = new javax.swing.GroupLayout(shop_ser_panel);
        shop_ser_panel.setLayout(shop_ser_panelLayout);
        shop_ser_panelLayout.setHorizontalGroup(
            shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shop_ser_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shop_ser_panelLayout.createSequentialGroup()
                        .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_order_ser1)
                            .addComponent(cmb_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_order_ser2)
                            .addComponent(txt_shop_ser_price, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addGroup(shop_ser_panelLayout.createSequentialGroup()
                        .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollpane_shop_ser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(shop_ser_panelLayout.createSequentialGroup()
                                .addComponent(lbl_shop_ser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_add_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_dl_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        shop_ser_panelLayout.setVerticalGroup(
            shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shop_ser_panelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_shop_ser)
                    .addComponent(btn_dl_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_order_ser1)
                    .addComponent(lbl_order_ser2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_shop_ser_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_save.setBackground(new java.awt.Color(102, 102, 255));
        btn_save.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Save");
        btn_save.setBorderPainted(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_cance.setBackground(new java.awt.Color(102, 102, 255));
        btn_cance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_cance.setForeground(new java.awt.Color(255, 255, 255));
        btn_cance.setText("Clear");
        btn_cance.setBorderPainted(false);
        btn_cance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_canceActionPerformed(evt);
            }
        });

        btn_cance1.setBackground(new java.awt.Color(102, 102, 255));
        btn_cance1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_cance1.setForeground(new java.awt.Color(255, 255, 255));
        btn_cance1.setText("Cancel");
        btn_cance1.setBorderPainted(false);
        btn_cance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cance1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_cance1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_cance, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(order_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(common_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(shop_ser_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(shop_ser_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(common_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(order_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cance1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Shop Service Delete Button
    private void btn_dl_shop_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dl_shop_serActionPerformed
        
        int rowNo = tbl_shop_ser.getSelectedRow();
        
        if(rowNo>=0)
        {
            deleteShopSerTable(rowNo);
        }        
    }//GEN-LAST:event_btn_dl_shop_serActionPerformed

    
    private void cmb_shop_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_shop_serActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_shop_serActionPerformed
    
    //Order Service Add Button
    private void btn_add_order_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_order_serActionPerformed
        addOrderSerTable();
    }//GEN-LAST:event_btn_add_order_serActionPerformed

    
    private void cmb_order_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_order_serActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_order_serActionPerformed

    //Order Service Expense Add Button
    private void btn_add_order_ser_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_order_ser_expActionPerformed
        addOrderSerExpTable();
    }//GEN-LAST:event_btn_add_order_ser_expActionPerformed

    
    private void cmb_order_ser_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_order_ser_expActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_order_ser_expActionPerformed
    
    //Order Service Delete Button
    private void btn_dl_order_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dl_order_serActionPerformed
        int rowNo = tbl_order_ser.getSelectedRow();
        
        if(rowNo>=0)
        {
            deleteOrderSerTable(rowNo);
        } 
    }//GEN-LAST:event_btn_dl_order_serActionPerformed

    //Order Service Expense Delete Button
    private void btn_dl_order_ser_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dl_order_ser_expActionPerformed
        int rowNo = tbl_order_ser_exp.getSelectedRow();
        
        if(rowNo>=0)
        {
            deleteOrderSerExpTable(rowNo);
        } 
    }//GEN-LAST:event_btn_dl_order_ser_expActionPerformed

    //Shop Service Add Button
    private void btn_add_shop_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_shop_serActionPerformed
        
        addShopSerTable();
    }//GEN-LAST:event_btn_add_shop_serActionPerformed

    // Service Type Combo Box (Show, Hide Shop & Order Panel )
    private void cmb_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_typeActionPerformed
        if(cmb_type.getSelectedIndex()==1)
        {
            shop_ser_panel.setVisible(true);
            order_panel.setVisible(false);
        }
        else if(cmb_type.getSelectedIndex()==2)
        {
            shop_ser_panel.setVisible(false);
            order_panel.setVisible(true);
        }
        else
        {
            shop_ser_panel.setVisible(false);
            order_panel.setVisible(false);
        }        
    }//GEN-LAST:event_cmb_typeActionPerformed

    
    private void tbl_shop_serMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_shop_serMouseClicked
        
    }//GEN-LAST:event_tbl_shop_serMouseClicked

    //Save Button
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        
        try
        {
            if(validation()==true)
            {                
                if(cmb_type.getSelectedIndex()==1)
                {
                    insertShopSertoDb();
                }
                else if(cmb_type.getSelectedIndex()==2)
                {
                    insertOrderSertoDb();
                    insertOrderSerExptoDb();
                }
                else if(cmb_type.getSelectedIndex()==0)
                {
                    JOptionPane.showMessageDialog(this, "Select your Service Type [Shop / Order]");                
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_canceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_canceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_canceActionPerformed

    private void btn_cance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cance1ActionPerformed
        deleteCommonRecords();
        deleteAllShopSerRecords();
        deleteAllOrderSerRecords();
        deleteAllOrderSerExpRecords();
    }//GEN-LAST:event_btn_cance1ActionPerformed

    private void cmb_brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_brActionPerformed
        int cid_int = tblRowCount()+1;
        String cid_string = String.valueOf(cid_int);
        txt_cid.setText(cid_string);
    }//GEN-LAST:event_cmb_brActionPerformed

    //Validation
    public boolean validation()
    {        

        String br = cmb_br.getSelectedItem().toString();
        if(cmb_br.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(this, "Select Branch ");
            return false;
        }
        if(txt_cname.getText().equals("") )
        {
            JOptionPane.showMessageDialog(this, "Enter Customer Name");
            return false;
        }
        if(txt_phone.getText().equals("") || txt_phone.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(this, "Enter Phone Valid No");
            return false;
        }
        if(cmb_type.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(this, "Select Service Type");
            return false;
        }
        if(txt_dis.getText().equals("") )
        {
            JOptionPane.showMessageDialog(this, "Enter Discount Price. If no Enter '0' ");
            return false;
        }
        
        //Write Validation Code to Serviced_date ..................................... Write Code to Serviced_date
        // No need to write Validation to Price Textfield. Because it is automated.        
        
        return true;
    }
    
    //Add Records to Shop Service Table
    public void addShopSerTable()
    {
        DefaultTableModel model;
        
        if(cmb_shop_ser.getSelectedIndex()>=1 && !txt_shop_ser_price.getText().equals(""))
        {
            String shop_ser = cmb_shop_ser.getSelectedItem().toString();           
            double price = Double.parseDouble(txt_shop_ser_price.getText());

            try
            {
                Object[] obj = {shop_ser,price};
                model = (DefaultTableModel) tbl_shop_ser.getModel();
                model.addRow(obj);
                
                cmb_shop_ser.setSelectedIndex(0);
                txt_shop_ser_price.setText("");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }                
    }
    
    //Delete Records from Shop Service Table
    public void deleteShopSerTable(int x)
    {
        DefaultTableModel model;        
        int rowNo =x;
        
        try
        {
            model = (DefaultTableModel) tbl_shop_ser.getModel();
            model.removeRow(rowNo);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
 
    //Add Records to Order Service Table
    public void addOrderSerTable()
    {
        DefaultTableModel model;
        
        if(cmb_order_ser.getSelectedIndex()>=1 && !txt_order_ser_price.getText().equals(""))
        {
            String shop_ser = cmb_order_ser.getSelectedItem().toString();
            double price = Double.parseDouble(txt_order_ser_price.getText());

            try
            {
                Object[] obj = {shop_ser,price};
                model = (DefaultTableModel) tbl_order_ser.getModel();
                model.addRow(obj);
                
                cmb_order_ser.setSelectedIndex(0);
                txt_order_ser_price.setText("");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }                
    }
    
    //Delete Records from Order Service Table
    public void deleteOrderSerTable(int x)
    {
        DefaultTableModel model;        
        int rowNo =x;
        
        try
        {
            model = (DefaultTableModel) tbl_order_ser.getModel();
            model.removeRow(rowNo);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //Add Records to Order Service Expense Table
    public void addOrderSerExpTable()
    {
        DefaultTableModel model;
        
        if(cmb_order_ser_exp.getSelectedIndex()>=1 && !txt_order_ser_exp_price.getText().equals(""))
        {
            String shop_ser = cmb_order_ser_exp.getSelectedItem().toString();
            double price = Double.parseDouble(txt_order_ser_exp_price.getText());

            try
            {
                Object[] obj = {shop_ser,price};
                model = (DefaultTableModel) tbl_order_ser_exp.getModel();
                model.addRow(obj);
                
                cmb_order_ser_exp.setSelectedIndex(0);
                txt_order_ser_exp_price.setText("");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }                
    }
    
    //Delete Records from Order Service Expense Table
    public void deleteOrderSerExpTable(int x)
    {
        DefaultTableModel model;        
        int rowNo =x;
        
        try
        {
            model = (DefaultTableModel) tbl_order_ser_exp.getModel();
            model.removeRow(rowNo);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }    
    
    //Find Table Row Count
    public int tblRowCount()
    {                
        try
        { 
            Connection con = DBConnection.getConnection();

            String sql = "select MAX(customer_id) AS maxCustomerId from customer";
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();

            int maxCustomerId = 0;
            if (rs.next()) {
                maxCustomerId = rs.getInt("maxCustomerId");
            }
            return maxCustomerId;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }    
        return -1;
    }    
    
    //Insert records to customer Table
    public void insertCustomerDetailstoDb()
    {
                
        String br = cmb_br.getSelectedItem().toString();
        int cid = Integer.parseInt(txt_cid.getText());
        String cname = txt_cname.getText();        
        String phone = txt_phone.getText();
        double dis = Double.parseDouble(txt_dis.getText());
        double price = Double.parseDouble(txt_price.getText());
        //Write Code to Serviced_date ..................................... Write Code to Serviced_date
        String type = "";
        if(cmb_type.getSelectedIndex()==1)
        {
            type="Shop";
        }
        else if(cmb_type.getSelectedIndex()==2)
        {
            type="Order";
        }
        
        try
        {
            Connection con = DBConnection.getConnection();
            
            String sql = "insert into customer (customer_id ,customer_name,phone,service_type,branch,discount,total_price) values(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setInt(1,cid);
            pst.setString(2,cname);
            pst.setString(3,phone);  
            pst.setString(4,type); 
            pst.setString(5,br); 
            pst.setDouble(6,dis); 
            pst.setDouble(7,price); 
                    
            int updateRowCount = pst.executeUpdate();
            
            if(updateRowCount>0)
            {
                JOptionPane.showMessageDialog(this, "Customer Details Saved");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Insert records to shop_services Table
    public void insertShopSertoDb()
    {
        DefaultTableModel model;
        
        try
        {
            int cid = Integer.parseInt(txt_cid.getText());

            model = (DefaultTableModel) tbl_shop_ser.getModel();

            if(model.getRowCount()>0)
            {      
                insertCustomerDetailstoDb();
                
                Connection con = DBConnection.getConnection();
                String sql = "insert into shop_services (customer_id,service,price) values(?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

                for(int row=0; row<model.getRowCount();row++)
                {
                    String service = (String) model.getValueAt(row, 0);
                    double price = (Double) model.getValueAt(row, 1);
                    
                    pst.setInt(1,cid);
                    pst.setString(2,service);   
                    pst.setDouble(3, price);

                    pst.executeUpdate();
                }
                JOptionPane.showMessageDialog(this, "Records Are Saved");
            }     
            else
            {
                JOptionPane.showMessageDialog(this, "Please Add Shop Services to the Table");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //Insert records to ordering_services Table
    public void insertOrderSertoDb()
    {
        DefaultTableModel model;
        
        try
        {
            int cid = Integer.parseInt(txt_cid.getText());

            model = (DefaultTableModel) tbl_order_ser.getModel();

            if(model.getRowCount()>0)
            {        
                insertCustomerDetailstoDb();
                
                Connection con = DBConnection.getConnection();
                String sql = "insert into ordering_services (customer_id,service,price) values(?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

                for(int row=0; row<model.getRowCount();row++)
                {
                    String service = (String) model.getValueAt(row, 0);
                    double price = (Double) model.getValueAt(row, 1);
                    
                    pst.setInt(1,cid);
                    pst.setString(2,service);   
                    pst.setDouble(3, price);

                    pst.executeUpdate();
                }
                JOptionPane.showMessageDialog(this, "Records Are Saved");
            }     
            else
            {
                JOptionPane.showMessageDialog(this, "Please Add Shop Services to the Table");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //Insert records to ordering_services_expenses Table
    public void insertOrderSerExptoDb()
    {
        DefaultTableModel model;
        
        try
        {
            int cid = Integer.parseInt(txt_cid.getText());

            model = (DefaultTableModel) tbl_order_ser_exp.getModel();

            if(model.getRowCount()>0)
            {             
                Connection con = DBConnection.getConnection();
                String sql = "insert into ordering_service_expenses (customer_id,expense,cost) values(?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

                for(int row=0; row<model.getRowCount();row++)
                {
                    String service = (String) model.getValueAt(row, 0);
                    double price = (Double) model.getValueAt(row, 1);
                    
                    pst.setInt(1,cid);
                    pst.setString(2,service);   
                    pst.setDouble(3, price);

                    pst.executeUpdate();
                }
                JOptionPane.showMessageDialog(this, "Records Are Saved");
            }     
            else
            {
                JOptionPane.showMessageDialog(this, "No records to Svae in Order Expense Table");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //Delete Records from Common Panel
    public void deleteCommonRecords()
    {
        cmb_br.setSelectedIndex(0);
        txt_cid.setText("");
        txt_cname.setText("");
        txt_phone.setText("");
        cmb_type.setSelectedIndex(0);
        //ServiceDate clear code should be added
        txt_dis.setText("");
        txt_price.setText("");
        
    }
    
    // Delete All Records from Shop Service Table
    public void deleteAllShopSerRecords() {
        DefaultTableModel model;

        try {
            model = (DefaultTableModel) tbl_shop_ser.getModel();
            int rowCount = model.getRowCount();

            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Delete All Records from Order Service Table
    public void deleteAllOrderSerRecords() {
        DefaultTableModel model;

        try {
            model = (DefaultTableModel) tbl_order_ser.getModel();
            int rowCount = model.getRowCount();

            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Delete All Records from Order Service Table
    public void deleteAllOrderSerExpRecords() {
        DefaultTableModel model;

        try {
            model = (DefaultTableModel) tbl_order_ser_exp.getModel();
            int rowCount = model.getRowCount();

            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_order_ser;
    private javax.swing.JButton btn_add_order_ser_exp;
    private javax.swing.JButton btn_add_shop_ser;
    private javax.swing.JButton btn_cance;
    private javax.swing.JButton btn_cance1;
    private javax.swing.JButton btn_dl_order_ser;
    private javax.swing.JButton btn_dl_order_ser_exp;
    private javax.swing.JButton btn_dl_shop_ser;
    private javax.swing.JButton btn_save;
    private rojerusan.RSComboMetro cmb_br;
    private javax.swing.JComboBox<String> cmb_order_ser;
    private javax.swing.JComboBox<String> cmb_order_ser_exp;
    private javax.swing.JComboBox<String> cmb_shop_ser;
    private rojerusan.RSComboMetro cmb_type;
    private javax.swing.JPanel common_panel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_br;
    private javax.swing.JLabel lbl_cid;
    private javax.swing.JLabel lbl_cname;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_order_ser1;
    private javax.swing.JLabel lbl_order_ser2;
    private javax.swing.JLabel lbl_order_ser3;
    private javax.swing.JLabel lbl_order_ser4;
    private javax.swing.JLabel lbl_order_ser5;
    private javax.swing.JLabel lbl_order_ser6;
    private javax.swing.JLabel lbl_order_ser7;
    private javax.swing.JLabel lbl_order_ser8;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_shop_ser;
    private javax.swing.JLabel lbl_shop_ser1;
    private javax.swing.JLabel lbl_shop_ser2;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JPanel order_panel;
    private javax.swing.JPanel order_ser_exp_panel;
    private javax.swing.JPanel order_ser_panel;
    private bizbuilder.Scrollpane scrollpane_order_ser;
    private bizbuilder.Scrollpane scrollpane_order_ser_exp;
    private bizbuilder.Scrollpane scrollpane_shop_ser;
    private javax.swing.JPanel shop_ser_panel;
    private javax.swing.JTable tbl_order_ser;
    private javax.swing.JTable tbl_order_ser_exp;
    private javax.swing.JTable tbl_shop_ser;
    private javax.swing.JTextField txt_cid;
    private javax.swing.JTextField txt_cname;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_dis;
    private javax.swing.JTextField txt_order_ser_exp_price;
    private javax.swing.JTextField txt_order_ser_price;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_shop_ser_price;
    // End of variables declaration//GEN-END:variables
}
