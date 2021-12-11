/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.Menu.Menu;
import java.util.ArrayList;


/**
 *
 * @author Harshit
 */
public class InventoryDirectory {
    private ArrayList<Inventory> inventoryDirectory;
    
    public InventoryDirectory() {
        inventoryDirectory = new ArrayList();
    }
    
    public ArrayList<Inventory> getInventoryDirectory() {
        return inventoryDirectory;
    }
    
    public void setInventoryDirectory(ArrayList<Inventory> inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }
    
    public Inventory newItem(String ingredientName, int quantity, String res) {
        Inventory inventory = new Inventory(ingredientName, quantity, res);
        inventoryDirectory.add(inventory);
        return inventory;
    }
    
    public void removeInventory(Inventory inventory) {
        inventoryDirectory.remove(inventory);
    }



    
}
