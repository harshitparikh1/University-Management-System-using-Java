/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantDirectory;
    
    public RestaurantDirectory() {
        restaurantDirectory = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    public Restaurant newRestaurant(String restaurantName, String userName, String address, Boolean isDineInAvailable, int numberOfTables, String phoneNumber) {
        Restaurant restaurant = new Restaurant(restaurantName, userName, address,isDineInAvailable, numberOfTables, phoneNumber);
        restaurantDirectory.add(restaurant);
        System.out.println(restaurantDirectory.size() + "New Res");
        return restaurant;
    }
    
    public void removeRestaurant(Restaurant restaurant){
        restaurantDirectory.remove(restaurant);
    }
    
    public Restaurant getRestaurant(String name) {
        for(Restaurant r : restaurantDirectory) {
            if(r.getRestaurantName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
}
