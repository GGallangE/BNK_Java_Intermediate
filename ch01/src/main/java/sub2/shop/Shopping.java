package sub2.shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Shopping {

    private List<Customer> customers;
    private List<Order> orders;
    private HashMap<String, List<Order>> customerOrders;

    public Shopping() {
        customers = new ArrayList<>();
        orders = new ArrayList<>();
        customerOrders = new HashMap<>();
    }

    public void addCustomerOrders(String custId, List<Order> orders) {
        customerOrders.put(custId, orders);
    }

    public HashMap<String, List<Order>> getCustomerOrders() {
        return customerOrders;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}