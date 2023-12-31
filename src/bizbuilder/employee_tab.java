/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bizbuilder;

import java.awt.Color;
import static java.awt.Color.gray;

/**
 *
 * @author THANATOS
 */
public class employee_tab extends javax.swing.JFrame {

    /**
     * Creates new form home_page
     */
    public employee_tab() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Profile = new rojerusan.RSFotoCircle();
        Employee = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        Monthly_Expenses = new javax.swing.JLabel();
        Customer = new javax.swing.JLabel();
        Adding = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tabpane1 = new bizbuilder.Tabpane();
        jPanel2 = new javax.swing.JPanel();
        tabpane2 = new bizbuilder.Tabpane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tabpane3 = new bizbuilder.Tabpane();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setPreferredSize(new java.awt.Dimension(1300, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        Employee.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Employee.setForeground(new java.awt.Color(255, 255, 255));
        Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/employee.png"))); // NOI18N
        Employee.setText("Employee");
        Employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmployeeMouseExited(evt);
            }
        });

        Dashboard.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dashboard.png"))); // NOI18N
        Dashboard.setText("Dashboard");
        Dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DashboardMouseExited(evt);
            }
        });

        Monthly_Expenses.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Monthly_Expenses.setForeground(new java.awt.Color(255, 255, 255));
        Monthly_Expenses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/expense.png"))); // NOI18N
        Monthly_Expenses.setText("Monthly Expenses");
        Monthly_Expenses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Monthly_Expenses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Monthly_ExpensesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Monthly_ExpensesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Monthly_ExpensesMouseExited(evt);
            }
        });

        Customer.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Customer.setForeground(new java.awt.Color(255, 255, 255));
        Customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user (1).png"))); // NOI18N
        Customer.setText("Customer");
        Customer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CustomerMouseExited(evt);
            }
        });

        Adding.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Adding.setForeground(new java.awt.Color(255, 255, 255));
        Adding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add.png"))); // NOI18N
        Adding.setText("Adding");
        Adding.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Adding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddingMouseExited(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(102, 102, 255));
        Logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Adding, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(Customer, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(Employee, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(Monthly_Expenses, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Logout)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Customer)
                .addGap(18, 18, 18)
                .addComponent(Employee)
                .addGap(18, 18, 18)
                .addComponent(Dashboard)
                .addGap(18, 18, 18)
                .addComponent(Monthly_Expenses)
                .addGap(18, 18, 18)
                .addComponent(Adding)
                .addGap(64, 64, 64)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 900));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tabpane1.setForeground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabpane2.setForeground(new java.awt.Color(102, 102, 255));
        tabpane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 881, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        tabpane2.addTab("Employee Form", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 881, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        tabpane2.addTab("Employee Details", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabpane1.addTab("Employee", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tabpane3.setForeground(new java.awt.Color(102, 102, 255));
        tabpane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 897, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        tabpane3.addTab("Salary Form", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 897, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        tabpane3.addTab("Salary Details", jPanel8);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabpane1.addTab("Salary", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1000, 650));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseEntered
        // TODO add your handling code here:
        Customer.setBackground(new Color(204,204,255));
        Customer.setOpaque(true);
    }//GEN-LAST:event_CustomerMouseEntered

    private void CustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseExited
        // TODO add your handling code here:
        Customer.setBackground(new Color(102,102,255));
        
    }//GEN-LAST:event_CustomerMouseExited

    private void EmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseEntered
        // TODO add your handling code here:
        Employee.setBackground(new Color(204,204,255));
        Employee.setOpaque(true);
    }//GEN-LAST:event_EmployeeMouseEntered

    private void EmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseExited
        // TODO add your handling code here:
        Employee.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_EmployeeMouseExited

    private void DashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseEntered
        // TODO add your handling code here:
        Dashboard.setBackground(new Color(204,204,255));
        Dashboard.setOpaque(true);
    }//GEN-LAST:event_DashboardMouseEntered

    private void DashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseExited
        // TODO add your handling code here:
        Dashboard.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_DashboardMouseExited

    private void Monthly_ExpensesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Monthly_ExpensesMouseEntered
        // TODO add your handling code here:
        Monthly_Expenses.setBackground(new Color(204,204,255));
        Monthly_Expenses.setOpaque(true);
    }//GEN-LAST:event_Monthly_ExpensesMouseEntered

    private void Monthly_ExpensesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Monthly_ExpensesMouseExited
        // TODO add your handling code here:
        Monthly_Expenses.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_Monthly_ExpensesMouseExited

    private void AddingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddingMouseEntered
        // TODO add your handling code here:
        Adding.setBackground(new Color(204,204,255));
        Adding.setOpaque(true);
    }//GEN-LAST:event_AddingMouseEntered

    private void AddingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddingMouseExited
        // TODO add your handling code here:
        Adding.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_AddingMouseExited

    private void CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseClicked
        // TODO add your handling code here:
        customer_tab o = new customer_tab();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustomerMouseClicked

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeMouseClicked

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        // TODO add your handling code here:
        /*dashboard_tab o = new dashboard_tab();
        o.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_DashboardMouseClicked

    private void Monthly_ExpensesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Monthly_ExpensesMouseClicked
        // TODO add your handling code here:
        /*Monthly_exp_tab o = new Monthly_exp_tab();
        o.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_Monthly_ExpensesMouseClicked

    private void AddingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddingMouseClicked
        // TODO add your handling code here:
         /*adding_tab o = new adding_tab();
        o.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_AddingMouseClicked

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        signin o = new signin();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(employee_tab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee_tab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee_tab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee_tab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee_tab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adding;
    private javax.swing.JLabel Customer;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Employee;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel Monthly_Expenses;
    private rojerusan.RSFotoCircle Profile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private bizbuilder.Tabpane tabpane1;
    private bizbuilder.Tabpane tabpane2;
    private bizbuilder.Tabpane tabpane3;
    // End of variables declaration//GEN-END:variables
}
