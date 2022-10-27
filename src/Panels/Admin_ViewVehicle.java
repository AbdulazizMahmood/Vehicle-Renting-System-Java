/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;
import java.*;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import myproject.Company;
import myproject.Vehicle;

/**
 *
 * @author Abdelaziz
 */
public class Admin_ViewVehicle extends javax.swing.JPanel implements Serializable {

    /**
     * Creates new form Admin_ViewVehicle
     */
    public Admin_ViewVehicle() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabelBrand = new javax.swing.JLabel();
        jTextFieldBrand = new javax.swing.JTextField();
        jLabelUseAs = new javax.swing.JLabel();
        jLabelStatues = new javax.swing.JLabel();
        jButtonView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelAnswer = new javax.swing.JLabel();
        jComboBoxUse = new javax.swing.JComboBox<>();
        jComboBoxStatus = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabelBrand.setText("Brand");

        jTextFieldBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBrandActionPerformed(evt);
            }
        });

        jLabelUseAs.setText("Use As");

        jLabelStatues.setText("Status");

        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Brand", "Model", "ProductionYear", "SeatCapacity", "EngineCapacity", "Type", "Varient", "Status", "UsedAs", "RentValue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabelAnswer.setText("Fill the Fields to get info...");

        jComboBoxUse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taxi", "Individual" }));

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rented", "Unrented" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBrand)
                            .addComponent(jLabelUseAs)
                            .addComponent(jLabelStatues))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxUse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabelAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBrand))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUseAs)
                            .addComponent(jComboBoxUse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelStatues)
                            .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addComponent(jLabelAnswer)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBrandActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
        
          if( ( !jTextFieldBrand.getText().equals("") ) )
        {
            
            Vehicle x = new Vehicle();
            Company c = new Company();
            String Status;
            String Use ;
            String Brand ;
            if(c.isExist(jTextFieldBrand.getText()))
           
            {
            
            
            ArrayList<Vehicle> Selected = new ArrayList<Vehicle>();
            
          if(jComboBoxStatus.getSelectedIndex() == 0)
          {
               Status = "Rented";
          }else
              Status = "Unrented";
          
          if(jComboBoxUse.getSelectedIndex() == 0)
          {
              Use="Taxi";
          }else
              Use="Individual";
          
          Brand = jTextFieldBrand.getText();
          
             Selected =  x.viewVehicle(Brand, Use, Status);           
             AddTableRows(Selected);
              ResetPanels();
              jLabelAnswer.setText("Your Requirements were Found ..");
               
           
           
            } else
                jLabelAnswer.setText("Brand Doesn't Exist...");
        
                    }
          
          else jLabelAnswer.setText("Missing Required Fields...!");
        
        
        
    }//GEN-LAST:event_jButtonViewActionPerformed

    
    public void AddTableRows(ArrayList<Vehicle> Selected)
{
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    Object RowData [] = new Object[11];
    
 
int rowCount = model.getRowCount();
for (int i = rowCount - 1; i >= 0; i--) {
    model.removeRow(i);
}
    
    
    
    for(Vehicle x : Selected )
    {
        RowData[0] = x.getNumber();
        RowData[1] =x.getBrand().getBrand();
        RowData[2] =x.getCarModel();
        RowData[3] =x.getProductionYear();
        RowData[4] = x.getSeatCapacity();
        RowData[5] =x.getEngineCapacity();
        RowData[6] =x.getType();
        RowData[7] =x.getVarient();
        RowData[8] = x.getStatus();
        RowData[9] =x.getUseAs();
        RowData[10] =x.getRentValue();
       
        model.addRow(RowData);
    }
    
}
    
    
    
       private void ResetPanels() {
           
           jTextFieldBrand.setText("");
           jComboBoxStatus.setSelectedIndex(0);
           jComboBoxUse.setSelectedIndex(0);
       
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JComboBox<String> jComboBoxUse;
    private javax.swing.JLabel jLabelAnswer;
    private javax.swing.JLabel jLabelBrand;
    private javax.swing.JLabel jLabelStatues;
    private javax.swing.JLabel jLabelUseAs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBrand;
    // End of variables declaration//GEN-END:variables

 
}