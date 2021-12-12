/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Server;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author talre
 */
public class ServerDirectory {
    private ArrayList<Server> serverDirectory;
    
    public ServerDirectory(){
        serverDirectory = new ArrayList();
      
    }

    public ArrayList<Server> getServerDirectory() {
        return serverDirectory;
    }

    public void setServerDirectory(ArrayList<Server> serverDirectory) {
        this.serverDirectory = serverDirectory;
    }
    
    public Server addServer(int ServerId, String name,String email, String phoneNumber, int age, String homeAddress, String userName, int yearsOfExperience, String restaurantName, boolean isAvailable){
      Server server = new Server(ServerId, name, email, phoneNumber, age, homeAddress, userName, yearsOfExperience, restaurantName, isAvailable);
      serverDirectory.add(server);
     return server;
    }
    
    public void removeServer(Server server){
        serverDirectory.remove(server);
    }
    
    public Server getServer(String name){
        for(Server server: serverDirectory){
            if(server.getName().equals(name)){
                return server;
            }
        }
        return null;
    }
}
