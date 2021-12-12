package Business;

import Business.Employee.Employee;
import Business.Role.DonationRole;
import Business.Role.SupplierRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author charusingh
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ub = system.getUserAccountDirectory().createUserAccount("supplier", "supplier", employee, new SupplierRole());
        UserAccount uc = system.getUserAccountDirectory().createUserAccount("Food", "Food", employee, new DonationRole());
        return system;
    }
    
}
