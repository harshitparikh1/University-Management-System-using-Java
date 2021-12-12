/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Chef.ChefDirectory;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.HeadChef.HeadChefDirectory;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.RestaurantTable.RestaurantTableDirectory;
import Business.Server.ServerDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ServerRole.ServerAreaJPanel;

/**
 *
 * @author talre
 */
public class ServerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory oderDirectory, ChefDirectory chefDirectory, ServerDirectory serverDirectory, HeadChefDirectory headChefDirectory, RestaurantTableDirectory restaurantTableDirectory) {
        return new ServerAreaJPanel(userProcessContainer,account,business,restaurantDirectory, serverDirectory);
    }

    @Override
    public JPanel createWorkArea1(JPanel userProcessContainer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
