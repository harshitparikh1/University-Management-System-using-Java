/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import Business.Restaurant.RestaurantDirectory;
import Business.RestaurantTable.RestaurantTableDirectory;
import Business.Server.ServerDirectory;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ChefRole.ChefWorkAreaJPanel;
import userinterface.CustomerRole.CustomerWorkAreaJPanel;

/**
 *
 * @author Harshit
 */
public class ChefRole extends Role {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory, ChefDirectory chefDirectory, ServerDirectory serverDirectory, HeadChefDirectory headChefDirectory, RestaurantTableDirectory restaurantTableDirectory, DonationDirectory donationDirectory, SupplierDirectory supplierDirectory) {
        return new ChefWorkAreaJPanel(userProcessContainer, account, business, customerDirectory, restaurantDirectory, deliveryManDirectory, menuDirectory, orderDirectory, restaurantTableDirectory, donationDirectory, supplierDirectory);
    }

    @Override
    public JPanel createWorkArea1(JPanel userProcessContainer) {
        return null;
    }


    
}
