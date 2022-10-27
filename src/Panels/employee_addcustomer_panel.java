/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import myproject.Customer;
import java.*;
import java.io.Serializable;
import myproject.Vehicle;
import myproject.MyException;

/**
 *
 * @author mohamed
 */
public class employee_addcustomer_panel extends javax.swing.JPanel implements Serializable {

    /**
     * Creates new form employee_addcustomer_panel
     */
    public MyException exc=new MyException();
    public employee_addcustomer_panel() {
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

        customergender = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        customername = new javax.swing.JTextField();
        customeraddress = new javax.swing.JTextField();
        customerphonenumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customeriD = new javax.swing.JTextField();
        customerDays = new javax.swing.JTextField();
        customerbookdate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Insertcustomer = new javax.swing.JButton();
        selectG = new javax.swing.JComboBox<>();
        jTextFieldRentedCar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxUseAs = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Name");

        jLabel2.setText("Gender");

        jLabel3.setText("Address");

        jLabel4.setText("PhoneNumber");

        customerbookdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerbookdateActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        jLabel6.setText("NumbersOfRentingDays");

        jLabel7.setText("BookDate");

        Insertcustomer.setText("Add customer");
        Insertcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertcustomerActionPerformed(evt);
            }
        });

        selectG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));
        selectG.setSelectedIndex(-1);
        selectG.setToolTipText("select gender");

        jTextFieldRentedCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRentedCarActionPerformed(evt);
            }
        });

        jLabel8.setText("RentedCar");

        jComboBoxUseAs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taxi", "Individual" }));

        jLabel9.setText("Use As");

        jLabelEmail.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(selectG, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(customeriD, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(customername, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxUseAs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Insertcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldRentedCar)
                                    .addComponent(customerbookdate, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(customerDays)
                                    .addComponent(customeraddress)
                                    .addComponent(customerphonenumber)))
                            .addComponent(jTextFieldEmail))))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(selectG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(customeriD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(customerbookdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRentedCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxUseAs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(Insertcustomer)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void InsertcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertcustomerActionPerformed
        
        if(!jTextFieldRentedCar.getText().equals("") && !customername.getText().equals("")&&!customeraddress.getText().equals("")&&!customerphonenumber.getText().equals("")&&!customeriD.getText().equals("")&&selectG.getSelectedIndex()!= -1 &&!customerDays.getText().equals("")&&!customerbookdate.getText().equals("")&&!jTextFieldEmail.getText().equals(""))
        {
            Customer x = new Customer();
            Vehicle y=new Vehicle();
            
            Vehicle returned =y.SearchVehicle(Integer.parseInt(jTextFieldRentedCar.getText()));
            if(returned.getNumber()>0 && returned.getStatus().equals("Unrented"))
            {
            if(jComboBoxUseAs.getSelectedIndex()== 0)
            returned.setUseAs("Taxi");
            if(jComboBoxUseAs.getSelectedIndex() == 1)
            returned.setUseAs("Individual");
            
            returned.setStatus("Rented");
            x.setRentedCar(returned);
            
            if(exc.checkPositive(customeriD.getText()))
            x.setID(Integer.parseInt(customeriD.getText()));
            x.setAddress(customeraddress.getText());
            x.setName(customername.getText());
            x.setPhoneNumber(customerphonenumber.getText());
            x.setNumbersOfRentingDays(Integer.parseInt(customerDays.getText()));
            
            x.setCustomerMail(jTextFieldEmail.getText() ) ;
           
            Date d;
            try {
                d = new SimpleDateFormat("dd/MM/yyyy").parse(customerbookdate.getText());
                x.setBookDate(d);
            } 
            catch (ParseException ex) {
                Logger.getLogger(employee_addcustomer_panel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //            Date d;
            //            d = (Date)customerbookdate.getText();
            //x.setBookDate((Date)customerbookdate.getText());
            if(selectG.getSelectedIndex() == 0)
            {
                x.setGender("male");
            } else if (selectG.getSelectedIndex() == 1)
            {
                x.setGender("female");
            }
            if(x.AddCustomer())
            {
                JOptionPane.showMessageDialog(null,"Added Succefully....");
                resetform();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Failed to add....");
            }
            
        }
            else
                JOptionPane.showMessageDialog(null,"Vehicle Not Found or Rented Already....");
        }
    }//GEN-LAST:event_InsertcustomerActionPerformed

    private void customerbookdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerbookdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerbookdateActionPerformed

    private void jTextFieldRentedCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRentedCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRentedCarActionPerformed
    
    protected void resetform()
    {
        customeriD.setText("");
        customeraddress.setText("");
        customername.setText("");
        customerphonenumber.setText("");
        customerDays.setText("");
        customerbookdate.setText("");
        selectG.setSelectedIndex(-1);
        jTextFieldEmail.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Insertcustomer;
    private javax.swing.JTextField customerDays;
    private javax.swing.JTextField customeraddress;
    private javax.swing.JTextField customerbookdate;
    private javax.swing.JTextField customergender;
    private javax.swing.JTextField customeriD;
    private javax.swing.JTextField customername;
    private javax.swing.JTextField customerphonenumber;
    private javax.swing.JComboBox<String> jComboBoxUseAs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldRentedCar;
    private javax.swing.JComboBox<String> selectG;
    // End of variables declaration//GEN-END:variables
}
