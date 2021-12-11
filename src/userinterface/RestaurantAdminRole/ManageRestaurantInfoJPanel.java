
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Talre
 */
public class ManageRestaurantInfoJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
    private Restaurant restaurant;
    /**
     * Creates new form ManageRestaurantInforJPanel
     */
    public ManageRestaurantInfoJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        System.out.println(restaurantDirectory.getRestaurantDirectory().size() + "   ...... ");
        for(Restaurant res : this.restaurantDirectory.getRestaurantDirectory()) {
            System.out.println(res.getRestaurantName() + " " + account.getEmployee().getName());
            if(account.getEmployee().getName().equals(res.getRestaurantName())) {
                this.restaurant = res;
                break;
            }
        }
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblRestaurant.getModel();
        dtm.setRowCount(0);
        Object [] row = new Object[5];
        row[0] = restaurant;
        row[1] = restaurant.getAddress();
        row[2] = restaurant.getNumberOfTables();
        row[3] = restaurant.getPhoneNumber();
        row[4] = restaurant.getIsDineInAvailable();
        
        dtm.addRow(row);
    }
    
    public void refreshTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblRestaurant.getModel();
        dtm.setRowCount(0);
        Object [] row = new Object[5];
        row[0] = restaurant;
        row[1] = restaurant.getAddress();
        row[2] = restaurant.getNumberOfTables();
        row[3] = restaurant.getPhoneNumber();
        row[4] = restaurant.getIsDineInAvailable();
        dtm.addRow(row);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurant = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));

        tblRestaurant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Restaurant Name ", "Address", "Number of Table", "Mobile Number", "Dine in available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRestaurant);

        btnModify.setText("Modify Restaurant");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Optima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText(" Restaurant Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnModify)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestaurant.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Restaurant restaurant = (Restaurant)tblRestaurant.getValueAt(selectedRow,0);
        ModifyRestaurantInfoJPanel modifyManager = new ModifyRestaurantInfoJPanel(userProcessContainer, ecoSystem, restaurantDirectory, restaurant);
        userProcessContainer.add("ModifyRestaurantInfoJPanel",modifyManager);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminWorkAreaJPanel aWAJP = (AdminWorkAreaJPanel) component;
        //aWAJP.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestaurant;
    // End of variables declaration//GEN-END:variables
}
