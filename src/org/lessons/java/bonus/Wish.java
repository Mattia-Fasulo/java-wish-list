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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wish wish = (Wish) o;

        if (numWish != wish.numWish) return false;
        if (!getName().equals(wish.getName())) return false;
        return getRecipient().equals(wish.getRecipient());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getRecipient().hashCode();
        result = 31 * result + numWish;
        return result;
    }

    @Override
    public String toString() {
        return  "{" +
                "name='" + name + '\'' +
                ", recipient='" + recipient + '\'' +
                '}';
    }
}
