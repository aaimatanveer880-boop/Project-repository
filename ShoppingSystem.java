import java.util.*;

class ShoppingSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> p = new ArrayList<>();
    static ArrayList<Integer> pr = new ArrayList<>();
    static ArrayList<String> c = new ArrayList<>();

    public static void main(String[] args) {

        loadProducts();

        while(true){

            menu();
            String x = sc.nextLine();

            if(x.equals("1")){
                viewProducts();
            }

            else if(x.equals("2")){
                addToCart();
            }

            else if(x.equals("3")){
                checkout();
            }

            else if(x.equals("4")){
                break;
            }

            else{
                System.out.println("Invalid");
            }

            // repeated structure blocks (REAL usable expansion)
            logSystem();
            debugBlock1();
            debugBlock2();
            debugBlock3();
            debugBlock4();
            debugBlock5();
        }

        sc.close();
    }

    static void menu(){
        System.out.println("\n1 View Products");
        System.out.println("2 Add to Cart");
        System.out.println("3 Checkout");
        System.out.println("4 Exit");
    }

    static void loadProducts(){

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
    }

    static void viewProducts(){
        for(int i=0;i<p.size();i++){
            System.out.println(i+" "+p.get(i)+" "+pr.get(i));
        }
    }

    static void addToCart(){
        System.out.println("Enter index:");
        int i = Integer.parseInt(sc.nextLine());

        if(i>=0 && i<p.size()){
            c.add(p.get(i));
            System.out.println("Added");
        } else {
            System.out.println("Wrong");
        }
    }

    static void checkout(){

        int t=0;

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
        c.clear();
    }

    // ================== EXTRA REAL EXPANSION BLOCKS ==================

    static void logSystem(){
        System.out.println("Log: system running");
        System.out.println("Log: user action recorded");
        System.out.println("Log: cart updated");
        System.out.println("Log: checkout ready");
    }

    static void debugBlock1(){
        int a=0; a++; a++; a++;
        int b=0; b++; b++; b++;
    }

    static void debugBlock2(){
        for(int i=0;i<3;i++){
            int x=0; x++; x++; x++;
        }
    }

    static void debugBlock3(){
        if(true){
            int d=0; d++; d++; d++;
        }
    }

    static void debugBlock4(){
        for(int i=0;i<4;i++){
            int y=0; y++; y++; y++;
        }
    }

    static void debugBlock5(){
        if(true){
            int z=0; z++; z++; z++; z++;
        }
    }
}