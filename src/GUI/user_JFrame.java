/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.user_panels.account_JPanel;
import GUI.user_panels.pre_bill_JPanel;
import GUI.user_panels.spots_JPanel;
import java.awt.GridBagConstraints;

/**
 *
 * @author Ramy
 */
public class user_JFrame extends javax.swing.JFrame {
    account_JPanel p1 ;
    pre_bill_JPanel p4 ;
    spots_JPanel p2 ;
    
    
    
    
    public user_JFrame() {
        initComponents();
        setTitle("user");
        setLocation(430,130);
        setSize(515,585);
        
        p1 = new account_JPanel();
        p2 = new spots_JPanel();
        p4 = new pre_bill_JPanel() ;
        
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0 ;
        c.gridy = 0 ;
        user_dinamic_Panel.add(p1,c);
        user_dinamic_Panel.add(p2,c);
       
        user_dinamic_Panel.add(p4,c);
        
        p1.setVisible(true);
        p2.setVisible(false);
       
        p4.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_dinamic_Panel = new javax.swing.JPanel();
        user_blue_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user_static_Panel1 = new javax.swing.JPanel();
        account_Button1 = new javax.swing.JButton();
        spots_Button2 = new javax.swing.JButton();
        bill_Button3 = new javax.swing.JButton();
        logout_Button4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_dinamic_Panel.setBackground(new java.awt.Color(51, 51, 51));
        user_dinamic_Panel.setEnabled(false);
        user_dinamic_Panel.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(user_dinamic_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 360, 450));

        user_blue_panel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("welcome si");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/parked-car.png"))); // NOI18N

        javax.swing.GroupLayout user_blue_panelLayout = new javax.swing.GroupLayout(user_blue_panel);
        user_blue_panel.setLayout(user_blue_panelLayout);
        user_blue_panelLayout.setHorizontalGroup(
            user_blue_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_blue_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(36, 36, 36))
        );
        user_blue_panelLayout.setVerticalGroup(
            user_blue_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_blue_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(user_blue_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(user_blue_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 100));

        user_static_Panel1.setBackground(new java.awt.Color(204, 204, 204));

        account_Button1.setBackground(new java.awt.Color(51, 153, 255));
        account_Button1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        account_Button1.setForeground(new java.awt.Color(255, 255, 255));
        account_Button1.setText("my account");
        account_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_Button1ActionPerformed(evt);
            }
        });

        spots_Button2.setBackground(new java.awt.Color(51, 153, 255));
        spots_Button2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spots_Button2.setForeground(new java.awt.Color(255, 255, 255));
        spots_Button2.setText("free spots");
        spots_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spots_Button2ActionPerformed(evt);
            }
        });

        bill_Button3.setBackground(new java.awt.Color(51, 153, 255));
        bill_Button3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bill_Button3.setForeground(new java.awt.Color(255, 255, 255));
        bill_Button3.setText("create bill");
        bill_Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_Button3ActionPerformed(evt);
            }
        });

        logout_Button4.setBackground(new java.awt.Color(51, 153, 255));
        logout_Button4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logout_Button4.setForeground(new java.awt.Color(255, 255, 255));
        logout_Button4.setText("log out");
        logout_Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_Button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout user_static_Panel1Layout = new javax.swing.GroupLayout(user_static_Panel1);
        user_static_Panel1.setLayout(user_static_Panel1Layout);
        user_static_Panel1Layout.setHorizontalGroup(
            user_static_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_static_Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(user_static_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(account_Button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spots_Button2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(bill_Button3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(logout_Button4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        user_static_Panel1Layout.setVerticalGroup(
            user_static_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_static_Panel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(account_Button1)
                .addGap(35, 35, 35)
                .addComponent(spots_Button2)
                .addGap(49, 49, 49)
                .addComponent(bill_Button3)
                .addGap(39, 39, 39)
                .addComponent(logout_Button4)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        getContentPane().add(user_static_Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void account_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_Button1ActionPerformed
        // TODO add your handling code here:
        p1.setVisible(true);
        p2.setVisible(false);
        p4.setVisible(false);
    }//GEN-LAST:event_account_Button1ActionPerformed

    private void spots_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spots_Button2ActionPerformed
        // TODO add your handling code here:
        p1.setVisible(false);
        p2.setVisible(true);
        p4.setVisible(false);
    }//GEN-LAST:event_spots_Button2ActionPerformed

    private void bill_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_Button3ActionPerformed
        // TODO add your handling code here:
        p1.setVisible(false);
        p2.setVisible(false);
        p4.setVisible(true);
        
    }//GEN-LAST:event_bill_Button3ActionPerformed

    private void logout_Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_Button4ActionPerformed
        // TODO add your handling code here:
        Home return1 = new Home();
        return1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout_Button4ActionPerformed

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
            java.util.logging.Logger.getLogger(user_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account_Button1;
    private javax.swing.JButton bill_Button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logout_Button4;
    private javax.swing.JButton spots_Button2;
    private javax.swing.JPanel user_blue_panel;
    private javax.swing.JPanel user_dinamic_Panel;
    private javax.swing.JPanel user_static_Panel1;
    // End of variables declaration//GEN-END:variables
}
