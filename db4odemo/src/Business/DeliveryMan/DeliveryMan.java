/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;
import Business.Order.Order;
import Business.Restaurant.Dishes;
import java.util.ArrayList;
/**
 *
 * @author ajay09
 */
public class DeliveryMan {
    private String name;
    private String userName;
    private String address;
    private String number;
     private ArrayList<Order> orderList;
     public void addOrder(String restaurentName, String customerName, String deliveryGuy, ArrayList<Dishes> Order, String cost, String deliveryAddress) {
        Order order=new Order();
        //order.setOrder_id(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurentName(restaurentName);
        order.setDeliverMan(deliveryGuy);
        order.setOrder(Order);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    

    public DeliveryMan(String userName){
        this.userName=userName;
        orderList=new ArrayList<Order>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> order) {
        this.orderList = order;
    }
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    @Override
    public String toString() {
        return userName;
    }
    
}
    

