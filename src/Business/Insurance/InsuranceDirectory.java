/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

import Business.Donation.DonatedItem;
import Business.Donation.Donation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harshit
 */
public class InsuranceDirectory {
    
        private ArrayList<Insurance> insuranceDirectory;
        
        public InsuranceDirectory() {
            insuranceDirectory = new ArrayList();
        }

        public ArrayList<Insurance> getInsuranceDirectory() {
            return insuranceDirectory;
        }

        public void setInsuranceDirectory(ArrayList<Insurance> insuranceDirectory) {
            this.insuranceDirectory = insuranceDirectory;
        }
        
        public Insurance newInsurance(String insuranceName, String userName, String address, String phoneNumber) {
            Insurance insurance= null;
            insurance = new Insurance(insuranceName, userName, address, phoneNumber);
            insuranceDirectory.add(insurance);
            System.out.println(insuranceDirectory.size() + "New Insurance");
            return insurance;
        }
    
    public void removeInsurance(Insurance insurance){
        insuranceDirectory.remove(insurance);
    }
    
    public Insurance getInsurance(String name) {
        for(Insurance i : insuranceDirectory) {
            if(i.getInsuranceName().equals(name)) {
                return i;
            }
        }
        return null;
    }


    
}
