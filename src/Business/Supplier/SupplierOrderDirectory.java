/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author talre
 */
public class SupplierOrderDirectory {
    private ArrayList<SupplierOrders> supplierOrderDirectory;
    
    public SupplierOrderDirectory(){
        supplierOrderDirectory = new ArrayList();
    }

    public ArrayList<SupplierOrders> getSupplierOrderDirectory() {
        return supplierOrderDirectory;
    }

    public void setSupplierOrderDirectory(ArrayList<SupplierOrders> supplierOrderDirectory) {
        this.supplierOrderDirectory = supplierOrderDirectory;
    }
    
    
    public SupplierOrders newSupplierOrders(String restaurantName, String supplierName, String itemName, int itemQuantity, String status) {
        SupplierOrders supplierOrders = null;
         supplierOrders = new SupplierOrders(restaurantName, supplierName, itemName, itemQuantity, status);
        supplierOrderDirectory.add(supplierOrders);
        System.out.println(supplierOrderDirectory.size() + "New Res");
        return supplierOrders;
    }
    
    public void removesupplierOrders(SupplierOrders supplierOrders){
        supplierOrderDirectory.remove(supplierOrders);
    }
    
    public SupplierOrders getSupplierOrder(String name) {
        for(SupplierOrders supplierOrders : supplierOrderDirectory) {
            if(supplierOrders.getSupplierName().equals(name)) {
                return supplierOrders;
            }
        }
        return null;
    }
    
}
