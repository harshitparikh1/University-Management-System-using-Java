/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HeadChef;

/**
 *
 * @author talre
 */
public class HeadChef {
    private int headChefId;
    private String name;
    private String email;
    private String phoneNumber;
    private int age;
    private String homeAddress;
    private String userName;
    private int yearsOfExperience;
    private String restaurantName;
    

    HeadChef(int headChefId, String name, String email, String phoneNumber, int age, String homeAddress, String userName, int yearsOfExperience, String restaurantName) {
        this.headChefId = headChefId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.homeAddress = homeAddress;
        this.userName = userName;
        this.yearsOfExperience = yearsOfExperience;
        this.restaurantName = restaurantName;
    }

    
  
    public int getHeadChefId() {
        return headChefId;
    }

    public void setHeadChefId(int headChefId) {
        this.headChefId = headChefId;
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
    
}
