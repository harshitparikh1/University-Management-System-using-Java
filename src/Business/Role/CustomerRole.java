/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Chef.ChefDirectory;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Donation.DonationDirectory;
import Business.EcoSystem;
import Business.HeadChef.HeadChefDirectory;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;

import Business.Organization;
import Business.Restaurant.RestaurantDirectory;
import Business.RestaurantTable.RestaurantTableDirectory;
import Business.Server.ServerDirectory;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerDeliveryJPanel;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory, ChefDirectory chefDirectory, ServerDirectory serverDirectory, HeadChefDirectory headChefDirectory, RestaurantTableDirectory restaurantTableDirectory, DonationDirectory donationDirectory) {
        return new CustomerWorkAreaJPanel(userProcessContainer, account, business, customerDirectory, restaurantDirectory, deliveryManDirectory, menuDirectory, orderDirectory, restaurantTableDirectory, donationDirectory);
    }

    @Override
    public JPanel createWorkArea1(JPanel userProcessContainer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
