import java.util.*;

class Payment {

    public void processPayment(int amount, Scanner sc) {

        System.out.println("\nSelect Payment Method:");
        System.out.println("1 Cash on Delivery");
        System.out.println("2 Credit/Debit Card");
        System.out.println("3 EasyPaisa / JazzCash");

        String choice = sc.nextLine();

        if (choice.equals("1")) {
            System.out.println("Order placed with Cash on Delivery ✅");
        }

        else if (choice.equals("2")) {

            try {
                System.out.println("Enter Card Number:");
                String card = sc.nextLine();

                System.out.println("Enter CVV:");
                int cvv = Integer.parseInt(sc.nextLine());

                System.out.println("Payment Successful via Card ✅");

            } catch (NumberFormatException e) {
                System.out.println("Invalid CVV!");
            }
        }

        else if (choice.equals("3")) {

            System.out.println("Enter Mobile Number:");
            String num = sc.nextLine();

            System.out.println("Payment Successful via Mobile Wallet ✅");
        }

        else {
            System.out.println("Invalid payment option!");
        }
    }
}