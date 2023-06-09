package org.lessons.java.bonus;

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

        List<Wish> wishlist = new ArrayList<>();

        boolean stop = false;
        int count = 0;

        while(!stop){
            count++;

            System.out.print("name wish? ");
            String nameWish = scan.nextLine();

            System.out.print("wish recipient? ");
            String recipient = scan.nextLine();

            System.out.println();

            Wish wish = new Wish(nameWish, recipient);

            wishlist.add(wish);


            System.out.print("Stop?(y/n): ");
            stop = scan.nextLine().equalsIgnoreCase("y");
            System.out.println();
            System.out.println("you have expressed " + count + " wishes");
            System.out.println();
        }

        /*Collections.sort(wishlist);*/
        System.out.println("your wishlist: " + wishlist);
        System.out.println();

        ChristmasLetter christmasLetter = new ChristmasLetter(name,address,wishlist);

        try {
            christmasLetter.send();
        } catch (ChristmasException e){
            System.out.println(e.getMessage());
        }

        System.out.println();


        //faccio lun HashMap che fa il counter dei regali uguali
        Map<Wish, Integer> counter = new HashMap<>();

        for(Wish wish : wishlist){
            counter.putIfAbsent(wish, 0);
            counter.put(wish, counter.get(wish) +1);
        }

        for (Map.Entry<Wish, Integer> entry : counter.entrySet()) {
            System.out.println(entry.getKey() + ": " +entry.getValue());
        }

        System.out.println();

        //faccio una nuova lista senza doppioni
        List<Wish> wishlistUnique = new ArrayList<>(new HashSet<>(wishlist));
        System.out.println("WishList without clone: " + wishlistUnique);

        System.out.println();
        //creo un HashSet partendo dalla lista dei desideri
        HashSet<Wish> hashWishlist = new HashSet<>(doHashSet(wishlist));
        System.out.println("HashSet: " + hashWishlist);

        System.out.println();

        //faccio un HashMap che fa il counter dei regali per destinatario
        Map<String, Integer> counterRecipient = new HashMap<>();

        for(Wish wish : wishlist){
            if(counterRecipient.containsKey(wish.getRecipient())){
                int wishCount = counterRecipient.get(wish.getRecipient());
                counterRecipient.put(wish.getRecipient(), wishCount + 1);
            }else{
                counterRecipient.put(wish.getRecipient(), 1);
            }
        }

        System.out.println("counterRecipient: " + counterRecipient);

        scan.close();
    }

    private static Set<Wish> doHashSet(List<Wish> list){
        return new HashSet<Wish>(list);
    }
}
