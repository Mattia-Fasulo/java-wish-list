package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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
            System.out.println("you have expressed " + count + " wishes");
            System.out.println();
        }

        System.out.println(wishlist);
    }
}
