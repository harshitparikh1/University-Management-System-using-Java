/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Donation.DonatedItem;
import Business.Donation.Donation;
import Business.Donation.DonationDirectory;
import Business.EcoSystem;
import Business.Menu.Menu;
import Business.Menu.MenuDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.RestaurantTable.RestaurantTableDirectory;
import Business.Server.ServerDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harshit
 */
public class ManageDonationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
    private Restaurant restaurant;
    private MenuDirectory menuDirectory;
    private RestaurantTableDirectory restaurantTableDirectory;
    private DonationDirectory donationDirectory;

    /**
     * Creates new form ManageDonationJPanel
     */
    public ManageDonationJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory, MenuDirectory menuDirectory, RestaurantTableDirectory restaurantTableDirectory, DonationDirectory donationDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.menuDirectory = ecoSystem.getMenuDirectory();
        this.restaurantTableDirectory = ecoSystem.getRestaurantTableDirectory();
        this.donationDirectory = ecoSystem.getDonationDirectory();
        valueLabel.setText(account.getEmployee().getName());
        populateTable();
        populateRestaurantCombo();
        
    
        
    }
        public void populateRestaurantCombo() {
        boxNgo.removeAllItems();
        boxNgo.addItem("  ");
        for(Donation donation : ecoSystem.getDonationDirectory().getDonationDirectory()) {
            //System.out.println("res" + res);
            boxNgo.addItem(donation.getDonationName());
        }
        }
    public void populateTable() {
        DefaultTableModel dTableModel = (DefaultTableModel) tblItem.getModel();
        dTableModel.setRowCount(0);
//        String restaurantName = boxRestaurant.getSelectedItem().toString();
        
        String restaurantName = account.getEmployee().getName();
        Restaurant restaurant = ecoSystem.getRestaurantDirectory().getRestaurant(restaurantName);
        for(Menu menu : ecoSystem.getMenuDirectory().getMenuDirectory()){
            if(restaurantName.equals(menu.getRestaurantName())) {
                Object [] row = new Object[1];
                row[0] = menu;
                dTableModel.addRow(row);
            }
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

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        boxNgo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        lblModelName = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        lblManufacturer = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        btnMenuShow1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        enterpriseLabel.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(204, 204, 204));
        enterpriseLabel.setText("Restaurant Name:");

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(204, 204, 204));
        valueLabel.setText("<value>");

        jLabel1.setFont(new java.awt.Font("Optima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Donation");

        enterpriseLabel1.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(204, 204, 204));
        enterpriseLabel1.setText("Select who to donate: ");

        boxNgo.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        boxNgo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxNgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNgoActionPerformed(evt);
            }
        });

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Item Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblItem);

        lblModelName.setBackground(new java.awt.Color(255, 255, 255));
        lblModelName.setForeground(new java.awt.Color(255, 255, 255));
        lblModelName.setText("Item Name");

        txtItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemNameKeyReleased(evt);
            }
        });

        lblManufacturer.setBackground(new java.awt.Color(255, 255, 255));
        lblManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        lblManufacturer.setText("Quantity");

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });

        btnMenuShow1.setText("Donate");
        btnMenuShow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuShow1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblModelName, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addComponent(btnMenuShow1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxNgo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxNgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItemName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModelName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQty)
                            .addComponent(lblManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnMenuShow1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boxNgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNgoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxNgoActionPerformed

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked
        // TODO add your handling code here:
        
        int selectedRowIndex = tblItem.getSelectedRow();
        
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }
        
        
        
        DefaultTableModel model = (DefaultTableModel) tblItem.getModel();
        Menu selectedItem = (Menu)model.getValueAt(selectedRowIndex, 0);
        
        txtItemName.setText(selectedItem.getItemName());
        txtQty.setText("0");
        
        
        
    }//GEN-LAST:event_tblItemMouseClicked

    private void txtItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNameKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtItemNameKeyReleased

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtQtyKeyReleased

    private void btnMenuShow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuShow1ActionPerformed

        int quantity = 0;
        try {
            quantity = Integer.parseInt(txtQty.getText());
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Quantity must have 0-9 integers only");
            return;
        }
        
        String itemName = txtItemName.getText();
        
        String restaurantName = account.getEmployee().getName();
        
        
        if(itemName.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please select a item to donate. :) ");
            return;
        }
        else if(quantity <= 0){
            JOptionPane.showMessageDialog(null, "Please donate atleast 1 item :) ");
            return;
        }
        else if(boxNgo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a NGO.");
            return;
        }
        else{
            for (Menu menu: ecoSystem.getMenuDirectory().getMenuDirectory()){
                if(menu.getRestaurantName().equals(restaurantName)){
                    if(menu.getItemName() == itemName){
                        for(Donation donation : ecoSystem.getDonationDirectory().getDonationDirectory()){
                            if(donation.getDonationName().equals(boxNgo.getSelectedItem().toString())){
                                DonatedItem ditem = new DonatedItem(itemName, account.getEmployee().getName(), quantity);
                                donation.getDonationList().add(ditem);
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Thanks for the donation. We appreciate your consideration.");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Item name does not exist in the menu. Please select an appropriate item.");
                    }
                }
            }

        }
        
    }//GEN-LAST:event_btnMenuShow1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxNgo;
    private javax.swing.JButton btnMenuShow1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblModelName;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtQty;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
