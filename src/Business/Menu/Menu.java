/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author jshar
 */
public class Menu {
    private String itemName;
    private double price;
    private String restaurantName;
    
    private HashMap<String, Integer> ingredients;
    
    public Menu(String itemName, double price, String restaurantName,HashMap<String, Integer> ingredients) {
        this.itemName = itemName;
        this.price = price;
        this.restaurantName = restaurantName;
        this.ingredients = ingredients;
        
    }

    public HashMap<String, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashMap<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    

   

    

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    
    @Override
    public String toString() {
        return itemName;
    }
    
    
    
}
