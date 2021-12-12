/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donation;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author Harshit
 */
public class DonationDirectory {
    
    private ArrayList<Donation> donationDirectory;
 
    public DonationDirectory() {
        donationDirectory = new ArrayList();
    }

    public ArrayList<Donation> getDonationDirectory() {
        return donationDirectory;
    }

    public void setDonationDirectory(ArrayList<Donation> donationDirectory) {
        this.donationDirectory = donationDirectory;
    }

    public Donation newDonation(String donationName, String userName, String address, String phoneNumber) {
        Donation donation = null;
        donation = new Donation(donationName, userName, address, phoneNumber);
        donationDirectory.add(donation);
        System.out.println(donationDirectory.size() + "New Donation");
        return donation;
    }
    
    public void removeDonation(Donation donation){
        donationDirectory.remove(donation);
    }
    
    public Donation getDonation(String name) {
        for(Donation d : donationDirectory) {
            if(d.getDonationName().equals(name)) {
                return d;
            }
        }
        return null;
    }

    
}
