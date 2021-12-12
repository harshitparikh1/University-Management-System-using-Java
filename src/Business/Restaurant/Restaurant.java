/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Menu.MenuDirectory;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String restaurantName;
    private String address;
    private String userName;
    private String phoneNumber;
    private Boolean isDineInAvailable;
    private int numberOfTables;
    private MenuDirectory MenuDirectory;
    private HashMap<String, Integer> inventory;
    
    
    
     public Restaurant(String restaurantName, String userName, String address, Boolean isDineInAvailable, int numberOfTables, String phoneNumber, HashMap<String, Integer> inventory) 
     {
        this.restaurantName = restaurantName;
        this.address = address;
        this.isDineInAvailable = isDineInAvailable;
        this.numberOfTables = numberOfTables;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.inventory = inventory;
    }

    public HashMap<String, Integer> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<String, Integer> inventory) {
        this.inventory = inventory;
    }

   
     

    public Boolean getIsDineInAvailable() {
        return isDineInAvailable;
    }

    public void setIsDineInAvailable(Boolean isDineInAvailable) {
        this.isDineInAvailable = isDineInAvailable;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }

    public void setNumberOfTables(int numberOfTables) {
        this.numberOfTables = numberOfTables;
    }

    public MenuDirectory getMenuDirectory() {
        return MenuDirectory;
    }

    public void setMenuDirectory(MenuDirectory MenuDirectory) {
        this.MenuDirectory = MenuDirectory;
    }
    
    

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
    @Override
    public String toString() {
        return restaurantName;
    }

    
}
