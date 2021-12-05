/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Server;

/**
 *
 * @author talre
 */
public class Server {
    private int ServerId;
    private String name;
    private int age;
    private long phoneNumber;
    private int yearsOfExperience;

    Server(int ServerId, String name, int age, long phoneNumber, int yearsOfExperience) {
        this.ServerId = ServerId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.yearsOfExperience = yearsOfExperience;
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
    
    
}
