import java.util.*;

class OrderService {

    private ArrayList<Order> orders = new ArrayList<>();

    public void placeOrder(int total) {

        Order order = new Order(total);
        orders.add(order);

        System.out.println("Order Placed! ID: " + order.getOrderId());
    }

    public void showOrders() {

        if (orders.isEmpty()) {
            System.out.println("No orders yet");
            return;
        }

        for (Order o : orders) {
            System.out.println("Order ID: " + o.getOrderId());
            System.out.println("Amount: " + o.getTotalAmount());
            System.out.println("Status: " + o.getStatus());
            System.out.println("-------------------------");
        }
    }
}