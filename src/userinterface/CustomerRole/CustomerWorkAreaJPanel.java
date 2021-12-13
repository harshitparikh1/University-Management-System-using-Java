/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Donation.DonationDirectory;
import Business.EcoSystem;
import Business.HeadChef.HeadChefDirectory;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.RestaurantTable.RestaurantTableDirectory;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerDineInJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author talre
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private UserAccount account;
    private CustomerDirectory customerDirectory;
    private RestaurantDirectory restaurantDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private MenuDirectory menuDirectory;
    private OrderDirectory orderDirectory;
    private HeadChefDirectory headChefDirectory;
    private RestaurantTableDirectory restaurantTableDirectory;
    private DonationDirectory donationDirectory;
    private SupplierDirectory supplierDirectory;
   
    private static int count = 1;
    
    
    public CustomerWorkAreaJPanel() {
        
    }

    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory, RestaurantTableDirectory restaurantTableDirectory, DonationDirectory donationDirectory, SupplierDirectory supplierDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
       this.account = account;
       this.ecoSystem = ecoSystem;
       this.customerDirectory = ecoSystem.getCustomerDirectory();
       this.deliveryManDirectory = ecoSystem.getDeliveryManDirectory();
       this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
       this.restaurantTableDirectory = ecoSystem.getRestaurantTableDirectory();
       this.donationDirectory = ecoSystem.getDonationDirectory();
       this.supplierDirectory = ecoSystem.getSupplierDirectory();
       
        customerName.setText("Hello " + account.getEmployee().getName());
       
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtDo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customerName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        customerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerName.setText("Hello <value>");
        add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 75));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Dine-in ?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 100, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Delivery?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 110, 50));

        txtDo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDo.setText("What would you like to do today?");
        add(txtDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 80, 570, 75));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null,"Sorry, We are still working on this feature, Please get back to us in future update.");

//        
//        CustomerDineInJPanel cdip = new CustomerDineInJPanel(userProcessContainer,account, ecoSystem, restaurantDirectory, restaurantTableDirectory);
//        userProcessContainer.add("CustomerDineInJPanel",cdip);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //JOptionPane.showMessageDialog(null,"Sorry, We are still working on this feature, Please get back to us in future update.");
        CustomerDeliveryJPanel cdelp = new CustomerDeliveryJPanel(userProcessContainer, account, ecoSystem, customerDirectory, restaurantDirectory, deliveryManDirectory, menuDirectory, orderDirectory);
        userProcessContainer.add("CustomerDeliveryJPanel",cdelp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel txtDo;
    // End of variables declaration//GEN-END:variables
}
