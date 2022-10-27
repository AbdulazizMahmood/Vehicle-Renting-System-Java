/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalFrames;
import java.*;
import Panels.*;
import Panels.AddNewVehicle;
import Panels.Admin_ListVehicles;
import Panels.Admin_VehicleUpdate;
import Panels.Admin_ViewVehicle;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author Abdelaziz
 */
public class Admin_Vehicle extends javax.swing.JInternalFrame {

    /**
     * Creates new form Admin_Vehicle
     */
       AddNewVehicle p1  ;
    Admin_ListVehicles p2  ;
    Admin_VehicleUpdate p3 ; 
    Admin_ViewVehicle p4     ;
    GridBagLayout layout = new GridBagLayout();
    
    
    public Admin_Vehicle() {
        initComponents();
        
          p1     =  new AddNewVehicle();
         p2      = new Admin_ListVehicles();
         p3       = new Admin_VehicleUpdate();
        p4       =  new Admin_ViewVehicle();
         
         Dynamic_Admin_Vehicle.setLayout(layout);
         
         GridBagConstraints c = new GridBagConstraints();
         
         c.gridx=0;
         c.gridy=0;
         Dynamic_Admin_Vehicle.add(p1 , c);
         Dynamic_Admin_Vehicle.add(p2, c);
         Dynamic_Admin_Vehicle.add(p3, c);
         Dynamic_Admin_Vehicle.add(p4, c);
         
         p1.setVisible(true);
         p2.setVisible(false);
         p3.setVisible(false);
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

        jPanel1Vehicle = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Dynamic_Admin_Vehicle = new javax.swing.JPanel();

        setClosable(true);

        jPanel1Vehicle.setBackground(new java.awt.Color(102, 102, 255));

        jButton1.setText("Add NewVehicle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("List All Vehicle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update/Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("View Vehicle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1VehicleLayout = new javax.swing.GroupLayout(jPanel1Vehicle);
        jPanel1Vehicle.setLayout(jPanel1VehicleLayout);
        jPanel1VehicleLayout.setHorizontalGroup(
            jPanel1VehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1VehicleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1VehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1VehicleLayout.setVerticalGroup(
            jPanel1VehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1VehicleLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );

        getContentPane().add(jPanel1Vehicle, java.awt.BorderLayout.LINE_START);

        Dynamic_Admin_Vehicle.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout Dynamic_Admin_VehicleLayout = new javax.swing.GroupLayout(Dynamic_Admin_Vehicle);
        Dynamic_Admin_Vehicle.setLayout(Dynamic_Admin_VehicleLayout);
        Dynamic_Admin_VehicleLayout.setHorizontalGroup(
            Dynamic_Admin_VehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        Dynamic_Admin_VehicleLayout.setVerticalGroup(
            Dynamic_Admin_VehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        getContentPane().add(Dynamic_Admin_Vehicle, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          p1.setVisible(true);
         p2.setVisible(false);
         p3.setVisible(false);
         p4.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          p2.setVisible(true);
         p1.setVisible(false);
         p3.setVisible(false);
         p4.setVisible(false);
         p2.AddTableRows();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          p3.setVisible(true);
         p2.setVisible(false);
         p1.setVisible(false);
        p4.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
             p4.setVisible(true);
         p1.setVisible(false);
         p2.setVisible(false);
        p3.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dynamic_Admin_Vehicle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1Vehicle;
    // End of variables declaration//GEN-END:variables
}