/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RestaurantTable;

import Business.HeadChef.HeadChef;
import java.util.ArrayList;

/**
 *
 * @author talre
 */
public class RestaurantTableDirectory {
    private ArrayList<Table> restaurantTableDirectory;

    public RestaurantTableDirectory(){
        restaurantTableDirectory = new ArrayList();
      
    }

    public ArrayList<Table> getRestaurantTableDirectory() {
        return restaurantTableDirectory;
    }

    public void setRestaurantTableDirectory(ArrayList<Table> restaurantTableDirectory) {
        this.restaurantTableDirectory = restaurantTableDirectory;
    }
    
    public Table addTable(String tableNumber, boolean isAvailable, String restaurantName, int capacity){
      Table  table = new Table(tableNumber, isAvailable, restaurantName, capacity);
      restaurantTableDirectory.add(table);
     return table;
    }
    
    public void removeTable(Table table){
        restaurantTableDirectory.remove(table);
    }
    
  
}


