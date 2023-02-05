/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Application;
import Model.Medicine;
import Model.Observation;
import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class AssignPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignPanel
     */
    private Application application;
    public AssignPanel() {
        initComponents();
    }

    AssignPanel(Application application) {
        this.application=application;
        initComponents();
         populate();
    }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
public void populate()
{
     ArrayList<Medicine> medicines = this.application.getCatalog().getMedicineList();
        
        ArrayList<Observation> observations = this.application.getHistory().getVitalSignHistory();
        
        for(Observation o: observations) {
            observationBox.addItem(o);
        }
        
        for(Medicine med: medicines) {
            medicineBox.addItem(med);
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicineBox = new javax.swing.JComboBox();
        observationBox = new javax.swing.JComboBox();
        assignBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add(medicineBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 190, -1));

        observationBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                observationBoxItemStateChanged(evt);
            }
        });
        add(observationBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 180, -1));

        assignBtn.setText("Assign");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void observationBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_observationBoxItemStateChanged
        // TODO add your handling code here:
        
        
        Observation o = (Observation) observationBox.getSelectedItem();
        
        if(o.getMedication() != null) {
            jLabel1.setText(o.getMedication().getMedicineName());
    }//GEN-LAST:event_observationBoxItemStateChanged
    }
    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
         Observation o = (Observation) observationBox.getSelectedItem();
        Medicine m = (Medicine) medicineBox.getSelectedItem();
        
        o.setMedication(m);
        
    }//GEN-LAST:event_assignBtnActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox medicineBox;
    private javax.swing.JComboBox observationBox;
    // End of variables declaration//GEN-END:variables
}
