import java.util.*;

class ShoppingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AuthService auth = new AuthService();
        boolean isLoggedIn = false;

        // LOGIN / SIGNUP
        while (!isLoggedIn) {

            System.out.println("\n1 Signup\n2 Login");
            String choice = sc.nextLine();

            if (choice.equals("1")) {

                System.out.println("Enter username:");
                String u = sc.nextLine();

                System.out.println("Enter password:");
                String p = sc.nextLine();

                auth.signup(u, p);
            }

            else if (choice.equals("2")) {

                System.out.println("Enter username:");
                String u = sc.nextLine();

                System.out.println("Enter password:");
                String p = sc.nextLine();

                isLoggedIn = auth.login(u, p);
            }
        }

        ShoppingService service = new ShoppingService();
        Cart cart = new Cart();
        OrderService orderService = new OrderService();

        while (true) {

            System.out.println("\n1 View Products\n2 Add to Cart\n3 Checkout\n4 View Orders\n5 Exit");
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                service.showProducts();
            }

            else if (choice.equals("2")) {

                try {
                    System.out.println("Enter index:");
                    int index = Integer.parseInt(sc.nextLine());

                    Product p = service.getProduct(index);

                    if (p != null) {
                        cart.addProduct(p);
                        System.out.println("Added to cart");
                    } else {
                        System.out.println("Invalid index");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Enter valid number!");
                }
            }

            else if (choice.equals("3")) {

                cart.showCart();

                int total = cart.getTotal();

                System.out.println("Total = " + total);

                orderService.placeOrder(total);

                cart.clearCart();
            }

            else if (choice.equals("4")) {
                orderService.showOrders();
            }

            else if (choice.equals("5")) {
                System.out.println("Thank you!");
                break;
            }
        }

        sc.close();
    }
}