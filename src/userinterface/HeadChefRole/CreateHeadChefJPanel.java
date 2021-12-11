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
public class CreateHeadChefJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
    private Restaurant restaurant;
    private ServerDirectory serverDirectory;
    private HeadChefDirectory headChefDirectory;
    private static int count = 1;
    /**
     * Creates new form CreateHeadChefJPanel
     */
    public CreateHeadChefJPanel() {
        
    }

    public CreateHeadChefJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory, HeadChefDirectory headChefDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.headChefDirectory = ecoSystem.getHeadChefDirectory();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createHeadChefButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        headChefUserName = new javax.swing.JTextField();
        headChefPhoneNumber = new javax.swing.JTextField();
        headChefFirstName = new javax.swing.JTextField();
        headChefPassword = new javax.swing.JPasswordField();
        headChefLastName = new javax.swing.JTextField();
        headChefAge = new javax.swing.JTextField();
        headChefEmailId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        headChefHomeAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        headChefYearsOfExperience = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createHeadChefButton.setText("Create Head Chef");
        createHeadChefButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createHeadChefButtonActionPerformed(evt);
            }
        });
        add(createHeadChefButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        jLabel6.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Home Address*:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Password*:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 132, -1));

        jLabel7.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Phone Number*:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 132, -1));
        add(headChefUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 165, -1));
        add(headChefPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 165, -1));
        add(headChefFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 165, -1));
        add(headChefPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 165, -1));
        add(headChefLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 165, -1));
        add(headChefAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 165, -1));
        add(headChefEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 165, -1));

        jLabel2.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("First Name*:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 95, -1));
        add(headChefHomeAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 165, -1));

        jLabel3.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Last Name*:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 95, -1));

        jLabel4.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email Address*:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 110, -1));

        jLabel5.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Age*:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 95, -1));

        jLabel8.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Username*:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 132, -1));

        jLabel10.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Years Of Experience:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, -1, -1));
        add(headChefYearsOfExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 165, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void createHeadChefButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createHeadChefButtonActionPerformed
        
        if(headChefFirstName.getText().isEmpty() || headChefLastName.getText().isEmpty() || headChefEmailId.getText().isEmpty() || headChefAge.getText().isEmpty() || headChefHomeAddress.getText().isEmpty() || headChefUserName.getText().isEmpty() || headChefPassword.getText().isEmpty() || headChefPhoneNumber.getText().isEmpty() || headChefYearsOfExperience.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }

        String firstName = headChefFirstName.getText();
        String lastName = headChefLastName.getText();

        boolean flag ;

        flag = firstName.matches("^[a-zA-Z -']+$");

        if(flag == false) {
            JOptionPane.showMessageDialog(null, "Invalid First Name. Use only alphabets and (-') special characters");
            return;
        }

        flag = lastName.matches("^[a-zA-Z -']+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Invalid Last Name. Use only alphabets and (-') special characters");
            return;
        }

        String name = firstName + " " + lastName;

        String email = headChefEmailId.getText();

        flag = email.matches("^[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format: example@mail.com");
            return;
        }
        
        
        try {
            for(HeadChef headChef : headChefDirectory.getHeadChefDirectory()) {
                System.out.println(headChef);
                if(headChef.getEmail().equals(email)) {
                    JOptionPane.showMessageDialog(null, "Email Address already exists");
                }
            }
        } catch (Exception e) {
            System.out.println("No headchef exists.");
        }
        
        

        String phoneNumber = headChefPhoneNumber.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "Phone Number must be of 10 digits");
            return;
        }
        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have 0-9 digits only");
            return;
        }
        
        try {
            for(HeadChef headChef : headChefDirectory.getHeadChefDirectory()) {
                if(headChef.getPhoneNumber().equals(phoneNumber)) {
                    JOptionPane.showMessageDialog(null, "Phone Number already exists");
                }
            }
        } catch (Exception e) {
            System.out.println("No headchef phone number exists.");
            
        }
        
        

        int age = 0;
        int experience = Integer.parseInt(headChefYearsOfExperience.getText());

        try {

            age = Integer.parseInt(headChefAge.getText());

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have 0-9 integers only");
            return;
        }

        String homeAddress = headChefHomeAddress.getText();
        String userName = headChefUserName.getText();
        String password = headChefPassword.getText();

        for(UserAccount account : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                return;
            }
        }


        String headChefName = (account.getEmployee().getName());
        if(count<=1){
        ecoSystem.getHeadChefDirectory().addHeadChef(count++, name, email, phoneNumber, age, homeAddress, userName, experience);
        
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee(name);
        UserAccount usserAccount = ecoSystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new HeadChefRole());

        JOptionPane.showMessageDialog(null, "New Head Chef added successfully");

        // Empty All Fields
        headChefAge.setText("");
        headChefFirstName.setText("");
        headChefHomeAddress.setText("");
        headChefLastName.setText("");
        headChefPassword.setText("");
        headChefPhoneNumber.setText("");
        headChefUserName.setText("");
        headChefEmailId.setText("");
        headChefYearsOfExperience.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Only one HeadChef can be added.");
        }
    }//GEN-LAST:event_createHeadChefButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton createHeadChefButton;
    private javax.swing.JTextField headChefAge;
    private javax.swing.JTextField headChefEmailId;
    private javax.swing.JTextField headChefFirstName;
    private javax.swing.JTextField headChefHomeAddress;
    private javax.swing.JTextField headChefLastName;
    private javax.swing.JPasswordField headChefPassword;
    private javax.swing.JTextField headChefPhoneNumber;
    private javax.swing.JTextField headChefUserName;
    private javax.swing.JTextField headChefYearsOfExperience;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
