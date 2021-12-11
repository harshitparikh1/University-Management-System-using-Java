/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RestaurantTable;

/**
 *
 * @author talre
 */
public class Table {
    private String tableNumber;
    private boolean isAvailable;
    private String restaurantName;
    private int capacity;
    
    
    public Table(String tableNumber, boolean isAvailable, String restaurantName, int capacity){
        this.tableNumber = tableNumber;
        this.isAvailable = isAvailable;
        this.capacity = capacity;
        this.restaurantName = restaurantName;
        
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    

   

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public String toString() {
        return tableNumber;
    }
    
}
