/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HeadChef;


import java.util.ArrayList;

/**
 *
 * @author talre
 */
public class HeadChefDirectory {
    private ArrayList<HeadChef> headChefDirectory;
    
    public HeadChefDirectory(){
        headChefDirectory = new ArrayList();
    }

    public ArrayList<HeadChef> getHeadChefDirectory() {
        return headChefDirectory;
    }

    public void setHeadChefDirectory(ArrayList<HeadChef> headChefDirectory) {
        this.headChefDirectory = headChefDirectory;
    }
    
    
    
    public HeadChef addHeadChef(int headChefId, String name,String email, String phoneNumber, int age, String homeAddress, String userName, int yearsOfExperience){
      HeadChef  headChef = new HeadChef(headChefId, name, email, phoneNumber, age, homeAddress, userName, yearsOfExperience);
      headChefDirectory.add(headChef);
     return headChef;
    }
    
    public void removeHeadChef(HeadChef headChef){
        headChefDirectory.remove(headChef);
    }
    
    public HeadChef getHeadChef(String name){
        for(HeadChef headChef: headChefDirectory){
            if(headChef.getName().equals(name)){
                return headChef;
            }
        }
        return null;
    }
    
}
