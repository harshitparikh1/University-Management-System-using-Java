/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donation;

/**
 *
 * @author Harshit
 */
public class Donation {
    private String donationName;
    private String address;
    private String userName;
    private String phoneNumber;

    Donation(String donationName, String userName, String address, String phoneNumber) {
        this.donationName = donationName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
    }

    public String getDonationName() {
        return donationName;
    }

    public void setDonationName(String donationName) {
        this.donationName = donationName;
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
    
    @Override
    public String toString() {
        return donationName;
    }

    
}
