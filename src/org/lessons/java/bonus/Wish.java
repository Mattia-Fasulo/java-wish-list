package org.lessons.java.bonus;

public class Wish {
    private static int count = 0;

    private String name;
    private String recipient;
    private int numWish;

    //constructor
    public Wish(String name, String recipient) {
        this.name = name;
        this.recipient = recipient;
        count++;
        numWish = count;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    //methods


    @Override
    public String toString() {
        return "Wish " + numWish + "{" +
                "name='" + name + '\'' +
                ", recipient='" + recipient + '\'' +
                '}';
    }
}
