/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Menu.MenuDirectory;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String restaurantName;
    private String address;
    private Boolean isDinInAvailable;
    private int numberOfTables;
    private String phoneNumber;
    private MenuDirectory MenuDirectory;
    
    public Restaurant(String restaurantName, String address,Boolean isDineInAvailable, int numberOfTables, String phoneNumber) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.isDinInAvailable = isDineInAvailable;
        this.numberOfTables = numberOfTables;
        
        this.phoneNumber = phoneNumber;
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
    
    public Boolean getIsDinInAvailable() {
        return isDinInAvailable;
    }

    public void setIsDinInAvailable(Boolean isDinInAvailable) {
        this.isDinInAvailable = isDinInAvailable;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }

    public void setNumberOfTables(int numberOfTables) {
        this.numberOfTables = numberOfTables;
    }
    
    @Override
    public String toString() {
        return restaurantName;
    }

    
}
