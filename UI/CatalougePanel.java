/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Application;
import Model.Medicine;
import Model.MedicineCatalog;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author divya
 */
public class CatalougePanel extends javax.swing.JPanel {
 
    private Application application;
    DefaultTableModel medTableModel;
    public CatalougePanel() {
        initComponents();
    }

    CatalougePanel(Application application) {
        this.application=application;
        initComponents();
          
        this.application = application;
        this.medTableModel = (DefaultTableModel) medicineCatalogTable.getModel();
        
        displayMedicineCatalog();




//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fName = new javax.swing.JTextField();
        fDosage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicineCatalogTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        fName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fNameFocusLost(evt);
            }
        });

        medicineCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Dosage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(medicineCatalogTable);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fName, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(addBtn)
                    .addComponent(fDosage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteBtn)
                .addGap(282, 282, 282))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(fDosage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(addBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
  private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
    
         int selectedRow = medicineCatalogTable.getSelectedRow();
        
        if(selectedRow >= 0) {
            
          
            
            Medicine med = (Medicine) medicineCatalogTable.getValueAt(selectedRow, 0);
            
            this.application.getCatalog().removeMedicine(med.getMedicineName());
            
            displayMedicineCatalog();
        } 
        else
        {
            
        }




// TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed
 public void displayMedicineCatalog() {
    
        
        ArrayList<Medicine> medicines = this.application.getCatalog().getMedicineList();
        
        if(medicines.size() > 0) {
      
            
            medTableModel.setRowCount(0);
            
            for(Medicine med: medicines) {
                
              
                
                Object row[] = new Object[2];
                row[0] = med;
                row[1] = med.getDosage();
                
                medTableModel.addRow(row);
            }
        }
 }
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
        String name = fName.getText();
        String dosage = fDosage.getText();
      
        
        MedicineCatalog catalog = this.application.getCatalog();
                
        catalog.createMedicine(name, Double.valueOf(dosage));
        
      
        displayMedicineCatalog();
    }//GEN-LAST:event_addBtnActionPerformed

    private void fNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fNameFocusLost
        // TODO add your handling code here:
        
        
        
          String name = fName.getText();
        
        Boolean isUnique = this.application.getCatalog().checkIfMedicineUnique(name);
        
        if(isUnique) {
            
        } else {
            fName.setText("");
            JOptionPane.showMessageDialog(null, "Medicine already exists");
        }
    }//GEN-LAST:event_fNameFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField fDosage;
    private javax.swing.JTextField fName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable medicineCatalogTable;
    // End of variables declaration//GEN-END:variables
}
