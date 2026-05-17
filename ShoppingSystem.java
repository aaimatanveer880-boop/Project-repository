import java.util.*;

class ShoppingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔐 AUTH
        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> pass = new ArrayList<>();

        // 👤 CURRENT USER
        String currentUser = "";

        // PRODUCTS
        ArrayList<String> p = new ArrayList<>();
        ArrayList<Integer> pr = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();

        // ⭐ REVIEWS
        ArrayList<String> reviewUser = new ArrayList<>();
        ArrayList<String> reviewComment = new ArrayList<>();
        ArrayList<Integer> reviewRating = new ArrayList<>();

        // 📦 ORDERS
        ArrayList<String> orderUser = new ArrayList<>();
        ArrayList<Integer> orderTotal = new ArrayList<>();

        // 🔥 20 PRODUCTS
        p.add("Shoes"); pr.add(2000);
        p.add("Shirt"); pr.add(1500);
        p.add("Watch"); pr.add(3000);
        p.add("Bag"); pr.add(2500);
        p.add("Phone"); pr.add(50000);
        p.add("Laptop"); pr.add(120000);
        p.add("Headphones"); pr.add(4000);
        p.add("Charger"); pr.add(1000);
        p.add("Keyboard"); pr.add(3500);
        p.add("Mouse"); pr.add(1500);
        p.add("Tablet"); pr.add(30000);
        p.add("Speaker"); pr.add(6000);
        p.add("Camera"); pr.add(45000);
        p.add("Watch Ultra"); pr.add(55000);
        p.add("Power Bank"); pr.add(2500);
        p.add("USB Cable"); pr.add(500);
        p.add("Monitor"); pr.add(20000);
        p.add("Printer"); pr.add(18000);
        p.add("Router"); pr.add(4000);
        p.add("Smart TV"); pr.add(90000);

        // 🔐 LOGIN / SIGNUP
        boolean login = false;

        while(!login){

            System.out.println("\n1 Signup\n2 Login");
            String ch = sc.nextLine();

            if(ch.equals("1")){
                System.out.println("Enter username:");
                String u = sc.nextLine();

                System.out.println("Enter password:");
                String pw = sc.nextLine();

                users.add(u);
                pass.add(pw);

                System.out.println("Signup successful");
            }

            else if(ch.equals("2")){
                System.out.println("Enter username:");
                String u = sc.nextLine();

                System.out.println("Enter password:");
                String pw = sc.nextLine();

                for(int i=0;i<users.size();i++){
                    if(users.get(i).equals(u) && pass.get(i).equals(pw)){
                        login = true;
                        currentUser = u;
                        System.out.println("Login successful");
                    }
                }

                if(!login){
                    System.out.println("Wrong credentials");
                }
            }
        }

        // 🔥 MAIN SYSTEM
        while(true){

            System.out.println("\n1 View\n2 Add\n3 Checkout\n4 Orders\n5 Reviews\n6 Add Review\n7 Exit");
            String x = sc.nextLine();

            // VIEW PRODUCTS
            if(x.equals("1")){
                for(int i=0;i<p.size();i++){
                    System.out.println(i+" "+p.get(i)+" "+pr.get(i));
                }
            }

            // ADD TO CART
            else if(x.equals("2")){
                System.out.println("Enter index:");
                int i = Integer.parseInt(sc.nextLine());

                if(i>=0 && i<p.size()){
                    c.add(p.get(i));
                    System.out.println("Added");
                } else {
                    System.out.println("Wrong index");
                }
            }

            // CHECKOUT + DISCOUNT + ORDER
            else if(x.equals("3")){

                int t = 0;

                for(String it:c){

                    if(it.equals("Shoes")) t+=2000;
                    if(it.equals("Shirt")) t+=1500;
                    if(it.equals("Watch")) t+=3000;
                    if(it.equals("Bag")) t+=2500;
                    if(it.equals("Phone")) t+=50000;
                    if(it.equals("Laptop")) t+=120000;

                    if(it.equals("Headphones")) t+=4000;
                    if(it.equals("Charger")) t+=1000;
                    if(it.equals("Keyboard")) t+=3500;
                    if(it.equals("Mouse")) t+=1500;

                    if(it.equals("Tablet")) t+=30000;
                    if(it.equals("Speaker")) t+=6000;
                    if(it.equals("Camera")) t+=45000;
                    if(it.equals("Watch Ultra")) t+=55000;

                    if(it.equals("Power Bank")) t+=2500;
                    if(it.equals("USB Cable")) t+=500;
                    if(it.equals("Monitor")) t+=20000;
                    if(it.equals("Printer")) t+=18000;

                    if(it.equals("Router")) t+=4000;
                    if(it.equals("Smart TV")) t+=90000;
                }

                System.out.println("Items:");
                for(String it:c){
                    System.out.println(it);
                }

                System.out.println("Total = " + t);

                // 💸 DISCOUNT
                System.out.println("Enter coupon:");
                String code = sc.nextLine();

                if(code.equals("SAVE10")){
                    t = t - (t*10/100);
                    System.out.println("10% applied");
                }
                else if(code.equals("SAVE20")){
                    t = t - (t*20/100);
                    System.out.println("20% applied");
                }

                System.out.println("Final = " + t);

                // 📦 SAVE ORDER
                orderUser.add(currentUser);
                orderTotal.add(t);

                System.out.println("Order placed!");

                c.clear();
            }

            // 📦 VIEW ORDERS
            else if(x.equals("4")){
                for(int i=0;i<orderUser.size();i++){
                    if(orderUser.get(i).equals(currentUser)){
                        System.out.println("Order: " + orderTotal.get(i));
                    }
                }
            }

            // ⭐ SHOW REVIEWS
            else if(x.equals("5")){
                if(reviewUser.size()==0){
                    System.out.println("No reviews yet");
                }
                for(int i=0;i<reviewUser.size();i++){
                    System.out.println(reviewUser.get(i)+" "+reviewRating.get(i)+"/5 "+reviewComment.get(i));
                }
            }

            // ⭐ ADD REVIEW
            else if(x.equals("6")){

                System.out.println("Comment:");
                String cm = sc.nextLine();

                System.out.println("Rating (1-5):");
                int r = Integer.parseInt(sc.nextLine());

                if(r>=1 && r<=5){
                    reviewUser.add(currentUser);
                    reviewComment.add(cm);
                    reviewRating.add(r);
                    System.out.println("Review added");
                } else {
                    System.out.println("Invalid rating");
                }
            }

            else if(x.equals("7")){
                break;
            }

            else{
                System.out.println("Invalid");
            }

            // 🔥 KEEP MESSY LINES
            for(int a=0;a<5;a++){ int b=0; b++; b++; b++; b++; b++; }
            if(true){ int d=0; d++; d++; d++; d++; d++; }
        }

        sc.close();
    }
}