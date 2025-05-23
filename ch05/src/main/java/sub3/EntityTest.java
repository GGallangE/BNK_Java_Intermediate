package sub3;


import entity.shop.Product;
import repository.CustomerRepository;
import repository.OrderItemRepository;
import repository.OrderRepository;
import repository.ProductRepository;

public class EntityTest {
    public static void main(String[] args) {

        CustomerRepository customerRepository = new CustomerRepository();
        OrderRepository orderRepository = new OrderRepository();
        OrderItemRepository orderItemRepository = new OrderItemRepository();
        ProductRepository productRepository = new ProductRepository();

        //customerRepository.findAll().forEach(System.out::println);
        orderRepository.findAll().forEach(System.out::println);
        orderItemRepository.findAll().forEach(System.out::println);
        //productRepository.findAll().forEach(System.out::println);
    }
}