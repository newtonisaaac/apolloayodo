/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import logins.login;
import login.courses;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class courses extends javax.swing.JFrame {

    /**
     * Creates new form courses
     */
    public courses() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBLcourses = new javax.swing.JTable();
        jLabelcoursename = new javax.swing.JLabel();
        jLabelcoursecode = new javax.swing.JLabel();
        jLabelcourseunits = new javax.swing.JLabel();
        jTfcourseName = new javax.swing.JTextField();
        jTfcourseCode = new javax.swing.JTextField();
        jTfcourseUnits = new javax.swing.JTextField();
        jMessage = new javax.swing.JLabel();
        jBtnADD = new javax.swing.JButton();
        jBtnEDIT = new javax.swing.JButton();
        jBtnDELETE = new javax.swing.JButton();
        jBtnBACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTBLcourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "course name", "course code", "course units"
            }
        ));
        jScrollPane1.setViewportView(jTBLcourses);
        if (jTBLcourses.getColumnModel().getColumnCount() > 0) {
            jTBLcourses.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 390, 380));

        jLabelcoursename.setText("course name");
        jPanel1.add(jLabelcoursename, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, -1));

        jLabelcoursecode.setText("course code");
        jPanel1.add(jLabelcoursecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 100, -1));

        jLabelcourseunits.setText("course units");
        jPanel1.add(jLabelcourseunits, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 90, -1));
        jPanel1.add(jTfcourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, -1));
        jPanel1.add(jTfcourseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, -1));
        jPanel1.add(jTfcourseUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 130, -1));
        jPanel1.add(jMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 244, 250, 30));

        jBtnADD.setText("ADD");
        jBtnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnADDActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jBtnEDIT.setText("EDIT");
        jBtnEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEDITActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnEDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jBtnDELETE.setText("DELETE");
        jBtnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDELETEActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnDELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jBtnBACK.setText("BACK");
        jBtnBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBACKActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnBACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 730, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnADDActionPerformed
         DefaultTableModel model = (DefaultTableModel) jTBLcourses.getModel();
         model.addRow(new Object[]{jTfcourseName.getText(),jTfcourseCode.getText(),jTfcourseUnits.getText()});
    }//GEN-LAST:event_jBtnADDActionPerformed

    private void jBtnEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEDITActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTBLcourses.getModel();
        if(jTBLcourses.getSelectedRow()==-1){
            if(jTBLcourses.getRowCount()==0){
                jMessage.setText("empty");
            }
        }else{
            model.setValueAt(jTfcourseName.getText(),jTBLcourses.getSelectedRow(),0);
            model.setValueAt(jTfcourseCode.getText(),jTBLcourses.getSelectedRow(),1);
            model.setValueAt(jTfcourseUnits.getText(),jTBLcourses.getSelectedRow(),2);
        }
    }//GEN-LAST:event_jBtnEDITActionPerformed

    private void jBtnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDELETEActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTBLcourses.getModel();
        model.removeRow(jTBLcourses.getSelectedRow());
        if(jTBLcourses.getSelectedRow()==-1){
            if(jTBLcourses.getRowCount()==0){
                jMessage.setText(" ");
            }
        }else{
            model.removeRow(jTBLcourses.getSelectedRow());
        }
    }//GEN-LAST:event_jBtnDELETEActionPerformed

    private void jBtnBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBACKActionPerformed
         setVisible(false);
        login info = new login();
        info.setVisible(true);
    }//GEN-LAST:event_jBtnBACKActionPerformed

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
            java.util.logging.Logger.getLogger(courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnADD;
    private javax.swing.JButton jBtnBACK;
    private javax.swing.JButton jBtnDELETE;
    private javax.swing.JButton jBtnEDIT;
    private javax.swing.JLabel jLabelcoursecode;
    private javax.swing.JLabel jLabelcoursename;
    private javax.swing.JLabel jLabelcourseunits;
    private javax.swing.JLabel jMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTBLcourses;
    private javax.swing.JTextField jTfcourseCode;
    private javax.swing.JTextField jTfcourseName;
    private javax.swing.JTextField jTfcourseUnits;
    // End of variables declaration//GEN-END:variables
}
