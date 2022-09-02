/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    public static Customer getCustomerTypeUser(String customerType){
        Customer user = null;
        if(customerType.equals("Delinquent")){
            user = new DelinquentCustomer();
        }else if(customerType.equals("Mountain")){
            user = new MountainCustomer();
        }else if(customerType.equals("Regular")){
            user = new RegularCustomer();
        }
        return user;
    }

    public static void main(String[] args) {
        Customer obj1 = new getCustomerTypeUser("Delinquent");
        System.out.print(obj1);
    
    }
}
