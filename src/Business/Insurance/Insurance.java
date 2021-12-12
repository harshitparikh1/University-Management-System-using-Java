/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

import Business.Donation.DonatedItem;
import java.util.List;

/**
 *
 * @author Harshit
 */
public class Insurance {    
    
    private String insuranceName;
    private String address;
    private String userName;
    private String phoneNumber;
    
    Insurance (String insuranceName, String userName, String address, String phoneNumber) {
        this.insuranceName = insuranceName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
    }

    
    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
}
