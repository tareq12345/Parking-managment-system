/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.user_panels;

/**
 *
 * @author Ramy
 */
public class spots_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form spots_JPanel
     */
    public spots_JPanel() {
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

        admin_dinamic_Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        empty_parck_picture = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin_dinamic_Panel.setBackground(new java.awt.Color(255, 255, 255));
        admin_dinamic_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Aldhabi", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("hour cost is 5 $ from 12 pm to4 am");
        admin_dinamic_Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 280, 60));

        jLabel2.setFont(new java.awt.Font("Aldhabi", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("hour cost is 5 $ from 12 pm to4 am");
        admin_dinamic_Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 280, 40));

        jButton1.setText("print ticket");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        admin_dinamic_Panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 90, -1));
        admin_dinamic_Panel.add(empty_parck_picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 350, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ramy\\Downloads\\Parking.jpg")); // NOI18N
        admin_dinamic_Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 430));

        add(admin_dinamic_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admin_dinamic_Panel;
    private javax.swing.JLabel empty_parck_picture;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
