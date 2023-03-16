package org.lessons.java.bonus;

import java.util.List;
import java.util.Random;

public class ChristmasLetter {
    //attributes
    private String name;
    private String address;
    private List<String> wishlist;

    //constructor
    public ChristmasLetter(String name, String address, List<String> wishlist) throws ChristmasException {
        this.name = name;
        this.address = address;
        this.wishlist = wishlist;

    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getWishlist() {
        return wishlist;
    }

    public void setWishlist(List<String> wishlist) {
        this.wishlist = wishlist;
    }

    //methods
    public void send() throws ChristmasException {
        if (wishlist.size() > 5) {
            throw new ChristmasException("Wishlist cannot contain more than 5 wishes");
        }

        Random random = new Random();
        boolean good = random.nextBoolean();

        if (!good) {
            throw new ChristmasException("You're a bad person");
        }


        System.out.println("you Christmas letter");
        System.out.println("*************");
        System.out.println("name: " + getName());
        System.out.println("address: " + getAddress());
        System.out.println("wishlist: " + getWishlist());
        System.out.println("*************");


    }
}
