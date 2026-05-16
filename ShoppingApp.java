import java.util.*;

class ShoppingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ShoppingService service = new ShoppingService();
        Cart cart = new Cart();

        while (true) {

            System.out.println("\n1 View Products\n2 Add to Cart\n3 Checkout\n4 Exit");
            String choice = sc.nextLine();

            if (choice.equals("1")) {

                service.showProducts();
            }

            else if (choice.equals("2")) {

                System.out.println("Enter index:");
                int index = Integer.parseInt(sc.nextLine());

                Product p = service.getProduct(index);

                if (p != null) {
                    cart.addProduct(p);
                    System.out.println("Added to cart");
                } else {
                    System.out.println("Invalid index");
                }
            }

            else if (choice.equals("3")) {

                cart.showCart();

                int total = cart.getTotal();

                System.out.println("Total = " + total);

                cart.clearCart();
            }

            else if (choice.equals("4")) {
                break;
            }

            else {
                System.out.println("Invalid option");
            }
        }

        sc.close();
    }
}