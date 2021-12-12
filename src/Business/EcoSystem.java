/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Chef.ChefDirectory;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Donation.DonationDirectory;
import Business.HeadChef.HeadChefDirectory;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.RestaurantTable.RestaurantTableDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Server.ServerDirectory;
import Business.Supplier.SupplierDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private OrderDirectory orderDirectory;
    private MenuDirectory menuDirectory;
    private ChefDirectory chefDirectory;
    private ServerDirectory serverDirectory;
    private HeadChefDirectory headChefDirectory;
    private RestaurantTableDirectory restaurantTableDirectory; 
    private DonationDirectory donationDirectory;
    private SupplierDirectory supplierDirectory;
    

    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory, ChefDirectory chefDirectory, ServerDirectory serverDirectory,HeadChefDirectory headChefDirectory, RestaurantTableDirectory restaurantTableDirectory, DonationDirectory donationDirectory, SupplierDirectory supplierDirectory ) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.chefDirectory = chefDirectory;
        this.serverDirectory = serverDirectory;
        this.headChefDirectory = headChefDirectory;
        this.restaurantTableDirectory = restaurantTableDirectory;
        this.donationDirectory = donationDirectory;
        this.supplierDirectory = supplierDirectory;
        
        
    }



    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public MenuDirectory getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(MenuDirectory menuDirectory) {
        this.menuDirectory = menuDirectory;
    }
    
    

    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public ChefDirectory getChefDirectory() {
        return chefDirectory;
    }

    public void setChefDirectory(ChefDirectory chefDirectory) {
        this.chefDirectory = chefDirectory;
    }

    public ServerDirectory getServerDirectory() {
        return serverDirectory;
    }

    public void setServerDirectory(ServerDirectory serverDirectory) {
        this.serverDirectory = serverDirectory;
    }

    public HeadChefDirectory getHeadChefDirectory() {
        return headChefDirectory;
    }

    public void setHeadChefDirectory(HeadChefDirectory headChefDirectory) {
        this.headChefDirectory = headChefDirectory;
    }

    public RestaurantTableDirectory getRestaurantTableDirectory() {
        return restaurantTableDirectory;
    }

    public void setRestaurantTableDirectory(RestaurantTableDirectory restaurantTableDirectory) {
        this.restaurantTableDirectory = restaurantTableDirectory;
    }
    
    public DonationDirectory getDonationDirectory() {
        return donationDirectory;
    }

    public void setDonationDirectory(DonationDirectory donationDirectory) {
        this.donationDirectory = donationDirectory;
    }
    
    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }


    
    
    
    
    
    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        customerDirectory = new CustomerDirectory();
        restaurantDirectory = new RestaurantDirectory();
        deliveryManDirectory = new DeliveryManDirectory();
        menuDirectory = new MenuDirectory();
        orderDirectory = new OrderDirectory();
        chefDirectory = new ChefDirectory();
        serverDirectory = new ServerDirectory();
        headChefDirectory = new HeadChefDirectory();
        restaurantTableDirectory = new RestaurantTableDirectory();
        donationDirectory = new DonationDirectory();
        
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
        //
       return false;
    }

    
}
