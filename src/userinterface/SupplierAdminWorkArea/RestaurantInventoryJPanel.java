/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplierAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Supplier.Supplier;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author talre
 */
public class RestaurantInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantInventoryJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem ecoSystem;
    
    public RestaurantInventoryJPanel() {
       
    }

    public RestaurantInventoryJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        populateTable();
        boxSupplier.removeAllItems();
        boxSupplier.addItem("  ");
        for(Supplier supplier : ecoSystem.getSupplierDirectory().getSupplierDirectory()){
            
            boxSupplier.addItem(supplier.getSupplierName());
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        boxSupplier = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        txtItemQuantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Inventory Item", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupplierMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSupplier);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 584, 110));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel1.setText("Inventory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        boxSupplier.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        boxSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSupplierActionPerformed(evt);
            }
        });
        add(boxSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 140, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Supplier Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Item");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Quantity");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });
        add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 100, -1));
        add(txtItemQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 100, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton1.setText("Place Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 160, 50));

        btnBack1.setBackground(new java.awt.Color(255, 255, 255));
        btnBack1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack1.setText("<<Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void tblSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplierMouseClicked
        // TODO add your handling code here:

        int selectedRowIndex = tblSupplier.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblSupplier.getModel();
        String selectedItem = (String)model.getValueAt(selectedRowIndex, 0);
        
        txtItemName.setText(selectedItem);

        //        Menu selectedItem = (Menu)model.getValueAt(selectedRowIndex, 0);
    }//GEN-LAST:event_tblSupplierMouseClicked

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void boxSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxSupplierActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int itemQuantity = 0;
        try {
            itemQuantity = Integer.parseInt(txtItemQuantity.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Quantity must have 0-9 integers only");
            return;
        }
        
        String itemName = txtItemName.getText();
        
        if(itemName.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please select a item to donate. :) ");
            return;
        }
        else if(itemQuantity <= 0){
            JOptionPane.showMessageDialog(null, "Please donate atleast 1 item :) ");
            return;
        }
        else if(boxSupplier.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Please select a supplier.");
        }
        else{
            String supplierName = boxSupplier.getSelectedItem().toString();
            String restaurantName = account.getEmployee().getName();

            String status = "Open";
            ecoSystem.getSupplierOrderDirectory().newSupplierOrders(restaurantName, supplierName, itemName, itemQuantity, status);
            JOptionPane.showMessageDialog(null, "Sent the order to supplier.");
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNameActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSupplier;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemQuantity;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblSupplier.getModel();
        model.setRowCount(0);
        
        for(Restaurant restaurant : ecoSystem.getRestaurantDirectory().getRestaurantDirectory()){
            if(restaurant.getRestaurantName().equals(account.getEmployee().getName())){
                HashMap<String, Integer> restaurantInventory = restaurant.getInventory();
                Iterator<Map.Entry<String, Integer>> itrInventory = restaurantInventory.entrySet().iterator();
                
                while(itrInventory.hasNext()){
                    Map.Entry<String, Integer> entry = itrInventory.next();
                       Object [] row = new Object[2];
                        row[0] = entry.getKey();
                        row[1] = entry.getValue();
                        model.addRow(row); 
                    }
                }
               
            }
        }
    
    
    


    
    
    
    

}
