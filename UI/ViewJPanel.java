/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Application;
import Model.Observation;
import Model.VitalSignHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author divya
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private Application application;
    DefaultTableModel viewtableModel;
    Observation selectedObservation;
    
   

    ViewJPanel(Application application) {
        initComponents();
        this.application = application;
        this.viewtableModel = (DefaultTableModel) observationTable.getModel();

     
        displayObservations();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        fTemperature = new javax.swing.JTextField();
        fBloodpressure = new javax.swing.JTextField();
        updateObservationBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        observationTable = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Create Vital Sign");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel2.setText("id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setText("Temperature");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setText("Blood Pressure");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        fid.setEnabled(false);
        jPanel1.add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 100, -1));
        jPanel1.add(fTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 100, -1));
        jPanel1.add(fBloodpressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 100, -1));

        updateObservationBtn.setText("Update Observations");
        updateObservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateObservationBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateObservationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        observationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "temperature", "bloodPressure"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(observationTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 400, 420));

        viewBtn.setText("View Details");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 51, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateObservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateObservationBtnActionPerformed
          // TODO add your handling code here:
          if (!fid.getText().isEmpty()) {

       
            Observation o = this.application.getHistory().findObservation(Integer.valueOf(fid.getText()));
            o.setBloodPressure(Double.valueOf(fBloodpressure.getText()));
            o.setTemperature(Double.valueOf(fTemperature.getText()));

       
            
        } 
          else 
          {
            JOptionPane.showMessageDialog(null, "You have not made any selection");
        }
        
        displayObservations();
       
                
    
    }//GEN-LAST:event_updateObservationBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
         int selectedRow = observationTable.getSelectedRow();

        if (selectedRow >= 0) {

           
            this.selectedObservation = (Observation) observationTable.getValueAt(selectedRow, 0);

            fid.setText(String.valueOf(this.selectedObservation.getObservationId()));
            fBloodpressure.setText(String.valueOf(this.selectedObservation.getBloodPressure()));
            fTemperature.setText(String.valueOf(this.selectedObservation.getTemperature()));

        } else {

            JOptionPane.showMessageDialog(null, "Please select a row!");
        }
        
        
        
        
    }//GEN-LAST:event_viewBtnActionPerformed
 public void displayObservations() {
        VitalSignHistory history = this.application.getHistory();

        if (history.getVitalSignHistory().size() > 0) {
           

            viewtableModel.setRowCount(0);
            for (Observation o : history.getVitalSignHistory()) {
              
                Object row[] = new Object[3];
                row[0] = o;
                row[1] = o.getTemperature();
                row[2] = o.getBloodPressure();

             
                viewtableModel.addRow(row);

            }

        }
        else
        {
            System.out.print("Empty list");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fBloodpressure;
    private javax.swing.JTextField fTemperature;
    private javax.swing.JTextField fid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable observationTable;
    private javax.swing.JButton updateObservationBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
