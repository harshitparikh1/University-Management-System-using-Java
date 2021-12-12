/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donation;

import java.util.List;

/**
 *
 * @author Harshit
 */
public class Donation {
    private String donationName;
    private String address;
    private String userName;
    private String phoneNumber;
    private List<DonatedItem> donationList;

    Donation(String donationName, String userName, String address, String phoneNumber, List<DonatedItem> donationList) {
        this.donationName = donationName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.donationList = donationList;
    }

    public List<DonatedItem> getDonationList() {
        return donationList;
    }

    public void setDonationList(List<DonatedItem> donationList) {
        this.donationList = donationList;
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
