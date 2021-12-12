/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Chef;

/**
 *
 * @author talre
 */
public class Chef {
    
    private String name;
    private String email;
    private String phoneNumber;
    private int age;
    private String homeAddress;
    private String userName;
    
    private String restaurantName;


    public Chef(String name, String email, String phoneNumber, int age, String homeAddress, String userName) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.homeAddress = homeAddress;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
    
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    
    @Override
    public String toString() {
        return userName;
    }
    
}
