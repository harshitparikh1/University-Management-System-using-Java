/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Server;

import Business.Restaurant.Restaurant;

/**
 *
 * @author talre
 */
public class Server {
    private int ServerId;
    private String name;
    private String email;
    private String phoneNumber;
    private int age;
    private String homeAddress;
    private String userName;
    private int yearsOfExperience;
    private String restaurantName;
    private boolean isAvailable = false;

    Server(int ServerId, String name, String email, String phoneNumber, int age, String homeAddress, String userName, int yearsOfExperience, String restaurantName, boolean isAvailable) {
        this.ServerId = ServerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.homeAddress = homeAddress;
        this.userName = userName;
        this.yearsOfExperience = yearsOfExperience;
        this.restaurantName = restaurantName;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServerId() {
        return ServerId;
    }

    public void setServerId(int ServerId) {
        this.ServerId = ServerId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

   

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public String toString() {
        return name;
    }
    
    
}
