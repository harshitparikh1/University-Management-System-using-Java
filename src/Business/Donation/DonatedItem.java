/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donation;

/**
 *
 * @author talre
 */
public class DonatedItem {
    private String itemName;
    private String restaurantName;
    private int itemQuantity;
    
    public DonatedItem(String itemName, String restaurantName, int itemQuantity){
        this.itemName = itemName;
        this.restaurantName = restaurantName;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    
    
    
    
}
