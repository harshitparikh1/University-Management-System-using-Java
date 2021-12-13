
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Talre
 */
public class CreateDeliveryManJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private DeliveryManDirectory deliveryManDirectory;
    /**
     * Creates new form CreateDeliveryManJPanel
     */
    public CreateDeliveryManJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, DeliveryManDirectory deliveryManDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.deliveryManDirectory = ecoSystem.getDeliveryManDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHomeAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnAutofill = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Optima", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Username*:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 422, 121, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 422, 165, -1));

        jLabel9.setFont(new java.awt.Font("Optima", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Password*:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 469, 121, -1));

        jLabel1.setFont(new java.awt.Font("Optima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Add New Delivery Man");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 39, 435, -1));

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 47, -1, -1));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("First Name*:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 151, 160, -1));
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 148, 165, -1));

        jLabel3.setFont(new java.awt.Font("Optima", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Last Name*:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 192, 163, -1));
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 188, 165, -1));

        jLabel4.setFont(new java.awt.Font("Optima", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email Address*:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 234, 121, -1));
        add(txtEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 234, 165, -1));

        jLabel5.setFont(new java.awt.Font("Optima", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Age*:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 281, 121, -1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 281, 165, -1));

        jLabel6.setFont(new java.awt.Font("Optima", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Home Address*:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 328, 121, -1));
        add(txtHomeAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 328, 165, -1));

        jLabel7.setFont(new java.awt.Font("Optima", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Phone Number*:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 375, -1, -1));
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 375, 165, -1));

        btnCreate.setText("Submit");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 553, 115, -1));

        jLabel10.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("*Mandatory fields");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 516, 133, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 469, 165, -1));

        btnAutofill.setText("Autofill");
        btnAutofill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutofillActionPerformed(evt);
            }
        });
        add(btnAutofill, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 187, 115, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDeliveryManJPanel mcjp = (ManageDeliveryManJPanel) component;
        mcjp.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if(txtFirstName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtEmailAddress.getText().isEmpty() ||
            txtPhoneNumber.getText().isEmpty() || txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty() ||
            txtHomeAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }

        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();

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

        String email = txtEmailAddress.getText();

        flag = email.matches("^[a-zA-Z0-9_-]+@[a-zA-Z]+.[a-zA-Z]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format: example@mail.com");
            return;
        }

        for(DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManDirectory()) {
            if(deliveryMan.getEmail().equals(email)) {
                JOptionPane.showMessageDialog(null, "Email Address already exists");
                return;
            }
        }

        String phoneNumber = txtPhoneNumber.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "Phone Number must be of 10 digits");
            return;
        }
        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have 0-9 digits only");
            return;
        }
        for(DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManDirectory()) {
            if(deliveryMan.getPhoneNumber().equals(phoneNumber)) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists");
                return;
            }
        }

        int age = 0;

        try {

            age = Integer.parseInt(txtAge.getText());

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have 0-9 numbers only");
            return;
        }

        String address = txtHomeAddress.getText();
        String userName = txtUsername.getText();
        String password = txtPassword.getText();

        for(UserAccount account : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                return;
            }
        }

        ecoSystem.getDeliveryManDirectory().newDeliveryMan(name, address, email, phoneNumber, age);
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee(email);
        ecoSystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new DeliverManRole());

        JOptionPane.showMessageDialog(null, "New delivery man added successfully!");
        
        // Empty All Fields
        txtAge.setText("");
        txtFirstName.setText("");
        txtHomeAddress.setText("");
        txtLastName.setText("");
        txtPassword.setText("");
        txtPhoneNumber.setText("");
        txtUsername.setText("");
        txtEmailAddress.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnAutofillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutofillActionPerformed
        // TODO add your handling code here:
        
        ArrayList<String> autofillName = new ArrayList<>();
        Collections.addAll(autofillName, "Peter David", "Shane Michael", "Mark Johnson");
        
        ArrayList<String> autofillAddress = new ArrayList<>();
        Collections.addAll(autofillAddress, "star street", "broksbury street", "appartment 2");
        
        ArrayList<String> autofillEmail = new ArrayList<>();
        Collections.addAll(autofillEmail, "d.peter@gmail.com", "m.shane@gmail.com", "j.mark@gmail.com");
        
        ArrayList<String> autofillPhoneNumber = new ArrayList<>();
        Collections.addAll(autofillPhoneNumber, "9988776655", "9876577889", "9283748349");
        
        ArrayList<Integer> autofillAge = new ArrayList<>();
        Collections.addAll(autofillAge, 36, 34, 52);
        
        ArrayList<String> autofillUsername = new ArrayList<>();
        Collections.addAll(autofillUsername, "dv1", "dv2", "dv3");
        
        ArrayList<String> autofillPassword = new ArrayList<>();
        Collections.addAll(autofillPassword, "dv1", "dv2", "dv3");
        
        for (int i = 0; i<autofillName.size(); i++){
            
            for(UserAccount account : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
                if(account.getUsername().equals(autofillUsername.get(i))) {
                    JOptionPane.showMessageDialog(null, "Cannot use autofill more than 1 time.");
                    return;
                }
            }

            
            ecoSystem.getDeliveryManDirectory().newDeliveryMan(autofillName.get(i), autofillAddress.get(i), autofillEmail.get(i), autofillPhoneNumber.get(i), autofillAge.get(i));
            Employee employee = ecoSystem.getEmployeeDirectory().createEmployee(autofillEmail.get(i));
            ecoSystem.getUserAccountDirectory().createUserAccount(autofillUsername.get(i), autofillPassword.get(i), employee, new DeliverManRole());

        }
        
        JOptionPane.showMessageDialog(null, "Added 3 delivery man.");


        
        // Empty All Fields
        txtAge.setText("");
        txtFirstName.setText("");
        txtHomeAddress.setText("");
        txtLastName.setText("");
        txtPassword.setText("");
        txtPhoneNumber.setText("");
        txtUsername.setText("");
        txtEmailAddress.setText("");
    }//GEN-LAST:event_btnAutofillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutofill;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
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
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHomeAddress;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
