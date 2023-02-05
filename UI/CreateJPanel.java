/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Application;
import Model.VitalSignHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author divya
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private Application application;
    public CreateJPanel() {
        initComponents();
    }

    CreateJPanel(Application application) {
        initComponents();
        this.application = application;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        fTemperature = new javax.swing.JTextField();
        fBloodpressure = new javax.swing.JTextField();
        ObservationBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Create Vital Sign");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel2.setText("id");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setText("Temperature");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setText("Blood Pressure");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        fid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fidActionPerformed(evt);
            }
        });
        add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 110, -1));
        add(fTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 120, -1));
        add(fBloodpressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 120, -1));

        ObservationBtn.setText("Add Observation");
        ObservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObservationBtnActionPerformed(evt);
            }
        });
        add(ObservationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ObservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObservationBtnActionPerformed
        // TODO add your handling code here:
        
       VitalSignHistory history = this.application.getHistory();
        
    
        
        String id = fid.getText();
        String temperature = fTemperature.getText();
        String bloodPressure = fBloodpressure.getText();
        
       
        
        history.createObservation(Integer.valueOf(id), Double.valueOf(bloodPressure), Double.valueOf(temperature));
        
        JOptionPane.showMessageDialog(null, "Added observation");
    }//GEN-LAST:event_ObservationBtnActionPerformed

    private void fidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ObservationBtn;
    private javax.swing.JTextField fBloodpressure;
    private javax.swing.JTextField fTemperature;
    private javax.swing.JTextField fid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
