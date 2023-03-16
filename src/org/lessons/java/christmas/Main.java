package org.lessons.java.christmas;

import java.util.*;

public class Main {
    public static void main(String[] args) throws ChristmasException {
        Scanner scan = new Scanner(System.in);

        String name;
        String address;

        System.out.print("your name: ");
        name = scan.nextLine();
        System.out.print("your address: ");
        address = scan.nextLine();

        System.out.println();

        List<String> wishlist = new ArrayList<>();

        boolean stop = false;
        int count = 0;

        while(!stop){
            count++;

            System.out.print("your wish? ");
            String wish = scan.nextLine();

            wishlist.add(wish);


            System.out.print("Stop?(y/n): ");
            stop = scan.nextLine().equalsIgnoreCase("y");
            System.out.println();
            System.out.println("you have expressed " + count + " wishes");
            System.out.println();
        }

        Collections.sort(wishlist);
        System.out.println("you wishlist: " + wishlist);
        System.out.println();

        ChristmasLetter christmasLetter = new ChristmasLetter(name,address,wishlist);

        try {
            christmasLetter.send();
        } catch (ChristmasException e){
            System.out.println(e.getMessage());
        }

        scan.close();
    }
}
