package sub3;

import entity.shop.Customer;
import entity.shop.Order;
import entity.shop.OrderItem;
import entity.shop.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.junit.jupiter.api.Test;
import repository.CustomerRepository;
import repository.OrderItemRepository;
import repository.OrderRepository;
import repository.ProductRepository;

import java.util.List;

public class ShopEntityTest {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("test-unit");
    private EntityManager em;

    CustomerRepository customerRepository = new CustomerRepository();
    OrderRepository orderRepository = new OrderRepository();
    OrderItemRepository orderItemRepository = new OrderItemRepository();
    ProductRepository productRepository = new ProductRepository();

    /*
        연관관계 테스트
     */
    @Test
    public void test1(){

        Order order = orderRepository.findById(3);
        System.out.println(order);

        for(OrderItem orderItem : order.getOrderItems()){
            System.out.println(orderItem);
        }
    }

    /*
        영속성 전이 테스트
     */
    @Test
    public void test2(){

        // 고객 생성
        Customer customer = customerRepository.findById("a101");

        // 상품 조회
        Product product1 = productRepository.findById(1);
        Product product2 = productRepository.findById(2);

        // 주문 생성
        Order order = new Order();
        order.setCustomer(customer);
        order.setOrderStatus(0);

        // 주문 아이템 생성
        OrderItem item1 = new OrderItem();
        item1.setProduct(product1);
        item1.setCount(1);
        item1.setOrder(order);

        OrderItem item2 = new OrderItem();
        item2.setProduct(product2);
        item2.setCount(2);
        item2.setOrder(order);

        int totalPrice = item1.getProduct().getPrice() * item1.getCount() +
                item2.getProduct().getPrice() * item2.getCount();

        order.setOrderPrice(totalPrice);

        order.getOrderItems().add(item1);
        order.getOrderItems().add(item2);

        // order 저장
        orderRepository.save(order);
    }

    /*
        N+1 문제 최적화
     */
    @Test
    public void test3(){
        em = emf.createEntityManager();
        em.getTransaction().begin();

        TypedQuery<Order> query = em.createQuery("select o from Order o", Order.class); // 1번의 쿼리 실행
        List<Order> orderList = query.getResultList();
        System.out.println(orderList);

        for(Order order : orderList){
            System.out.println(order.getCustomer());
            System.out.println(order.getOrderItems());
        }

        em.getTransaction().commit();
    }
}