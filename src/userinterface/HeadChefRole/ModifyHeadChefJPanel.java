/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HeadChefRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.HeadChef.HeadChef;
import Business.HeadChef.HeadChefDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.HeadChefRole;
import Business.Server.ServerDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author talre
 */
public class ModifyHeadChefJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
    private Restaurant restaurant;
    private ServerDirectory serverDirectory;
    private HeadChefDirectory headChefDirectory;
    private static int count = 1;
    private HeadChef headchef;
    /**
     * Creates new form CreateHeadChefJPanel
     */
    public ModifyHeadChefJPanel() {
        
    }

    public ModifyHeadChefJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, HeadChefDirectory headChefDirectory, HeadChef headchef) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.headchef = headchef;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.headChefDirectory = ecoSystem.getHeadChefDirectory();
        txtName.setText(headchef.getName());
        txtEmailAddress.setText(headchef.getEmail());
        txtAge.setText(String.valueOf(headchef.getAge()));
        txtHomeAddress.setText(headchef.getHomeAddress());
        txtPhoneNumber.setText(headchef.getPhoneNumber());
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
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtHomeAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Optima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Head Chef");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 50));

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 83, 22));

        jLabel2.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name*:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 130, -1));

        txtName.setEditable(false);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 165, -1));

        txtEmailAddress.setEditable(false);
        add(txtEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 165, -1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 165, -1));
        add(txtHomeAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 165, -1));
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 165, -1));

        jLabel7.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Phone Number*:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 111, -1));

        jLabel6.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Home Address*:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 130, -1));

        jLabel5.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Age*:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 130, -1));

        jLabel4.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email Address*:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 130, -1));

        btnCreate.setText("Submit");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 124, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if(txtName.getText().isEmpty() || txtEmailAddress.getText().isEmpty() || txtAge.getText().isEmpty() ||
            txtPhoneNumber.getText().isEmpty() || txtHomeAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }

        boolean flag ;

        String phoneNumber = txtPhoneNumber.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "Phone Number must be of 10 digits");
            return;
        }
        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }
        for(HeadChef headchef : headChefDirectory.getHeadChefDirectory() ) {
            if(headchef.getPhoneNumber().equals(phoneNumber) && this.headchef != headchef) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists");
            }
        }

        int age = 0;

        try {

            age = Integer.parseInt(txtAge.getText());

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have 0-9 numbers only");
            return;
        }

        String homeAddress = txtHomeAddress.getText();

        String email = txtEmailAddress.getText();

        flag = email.matches("^[a-zA-Z0-9_-]+@[a-zA-Z]+.[a-zA-Z]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format: example@mail.com");
            return;
        }

        headchef.setEmail(email);
        headchef.setAge(age);
        headchef.setPhoneNumber(phoneNumber);
        headchef.setHomeAddress(homeAddress);

        JOptionPane.showMessageDialog(null, "Customer has been updated successfully.");

        // Empty all fields
        txtAge.setText("");
        txtEmailAddress.setText("");
        txtHomeAddress.setText("");
        txtName.setText("");
        txtPhoneNumber.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtHomeAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}