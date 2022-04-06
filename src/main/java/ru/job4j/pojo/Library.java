package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Clean code", 1000);
        Book second = new Book("War and peace", 10000);
        Book third = new Book("Numbers", 253);
        Book fourth = new Book("The Wither", 999);
        Book[] books = new Book[4];
        books[0] = one;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int i = 0; i < books.length; i++) {
            Book display = books[i];
            System.out.println("Name: " + display.getName() + "|| pages: " + display.getCount());
        }
        System.out.println();
        books[0] = fourth;
        books[3] = one;
        for (int i = 0; i < books.length; i++) {
            Book display = books[i];
            System.out.println("Name: " + display.getName() + "|| pages: " + display.getCount());

        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book display = books[i];
            if (books[i].equals(one.getName())) {
                System.out.println("Name: " + display.getName());
            }
        }
    }
}
