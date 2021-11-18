/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.Dishes;
import java.util.ArrayList;

/**
 *
 * @author ajay09
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;
   
    private Customer customer;
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    
    
    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    
    public CustomerDirectory(){
        this.customerList=new ArrayList<Customer>();
    }
    
    
    
    public Customer createCustomer(String name){
        customer= new Customer(name);
        customerList.add(customer);
        return customer;
    }
    
    public void deleteCustomer(String username){
        for(int i=0;i<customerList.size();i++){
            if(customerList.get(i).getUserName().equals(username)){
                customerList.remove(i);
            }
        }
    }
    
}

