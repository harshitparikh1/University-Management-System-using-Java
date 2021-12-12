/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Chef.ChefDirectory;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Donation.DonationDirectory;
import Business.HeadChef.HeadChefDirectory;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.RestaurantTable.RestaurantTableDirectory;
import Business.Server.ServerDirectory;


public abstract class Role {
    
    public enum RoleType{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin"),
        Server("Server"),
        Chef("Chef"),
        HeadChef("HeadChef"),
        Supplier("Supplier"),
        Food("Food"),
        Donation("Donation");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business
            , CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, 
            DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory oderDirectory, ChefDirectory chefDirectory, ServerDirectory serverDirectory, HeadChefDirectory headChefDirectory, RestaurantTableDirectory restaurantTableDirectory, DonationDirectory donationDirectory);
    
    public abstract JPanel createWorkArea1(JPanel userProcessContainer);
    
    
    
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}