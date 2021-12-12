/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.Donation.Donation;
import java.util.ArrayList;

/**
 *
 * @author Harshit
 */
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierDirectory;
    
    public SupplierDirectory() {
        supplierDirectory = new ArrayList();
    }
    
    public ArrayList<Supplier> getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(ArrayList<Supplier> supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public Supplier newSupplier(String supplierName, String userName, String address, String phoneNumber) {
        
       Supplier supplier = new Supplier(supplierName, userName, address, phoneNumber);
        supplierDirectory.add(supplier);
        System.out.println(supplierDirectory.size() + "New Donation");
        return supplier;
    }
    
    public void removeSupplier(Supplier supplier){
        supplierDirectory.remove(supplier);
    }
    
    public Supplier getSupplier(String name) {
        for(Supplier s : supplierDirectory) {
            if(s.getSupplierName().equals(name)) {
                return s;
            }
        }
        return null;
    }


    
}
