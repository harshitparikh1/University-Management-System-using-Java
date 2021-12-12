/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Chef;

import Business.Customer.Customer;
import java.util.ArrayList;
/**
 *
 * @author talre
 */
public class ChefDirectory {
    
    private ArrayList<Chef> chefDirectory;
    
    public ChefDirectory(){
        chefDirectory = new ArrayList();
    }
    
    public ArrayList<Chef> getChefDirectory() {
        return chefDirectory;
    }

    public void setChefDirectory(ArrayList<Chef> chefDirectory) {
        this.chefDirectory = chefDirectory;
    }
    
    public Chef newChef(String name, String email, String phoneNumber, int age, String homeAddress, String userName){
        Chef chef = new Chef(name, email, phoneNumber, age, homeAddress, userName);
        chefDirectory.add(chef);
        return chef;
    }
    
    public void removeChef(Chef chef){
        chefDirectory.remove(chef);
    }
    
    public Chef getChef(String name){
        for(Chef chef: chefDirectory){
            if(chef.getName().equalsIgnoreCase(name)){
                return chef;
            }
        }
        return null;
    }
    
    
}
