/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

/**
 *
 * @author talre
 */
public class SupplierOrders{
    private String restaurantName;
    private String supplierName;
    private String itemName;
    private int itemQuantity;
    private String status;
    
    
    public SupplierOrders(String restaurantName, String supplierName, String itemName, int itemQuantity, String status){
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.restaurantName = restaurantName;
        this.status = status;
        this.supplierName = supplierName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
