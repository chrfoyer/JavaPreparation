public class OrderTest {
    public static void main(String[] args) {
        Product product1 = new Product("Banana", 12);
        Product product2 = new Product("Apple", 10);

        OrderLine orderLine1 = new OrderLine(13, product1);
        OrderLine orderLine2 = new OrderLine(10, product2);

        Order order = new Order();

        order.addProduct(orderLine1.getAmount(), orderLine2.getProduct());
        order.addProduct(orderLine2.getAmount(), orderLine2.getProduct());

        System.out.println(order.toString());
        System.out.println(order.getNumberOfOrderLines());
        System.out.println(order.getOrderLine(0));
        System.out.println(order.getTotalPrice());
    }
}
