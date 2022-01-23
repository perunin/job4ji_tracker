package ru.job4j.tracker;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;

    }

    public Error() {

    }

    public void printInfo() {
        System.out.println("Active " + active);
        System.out.println("Status " + status);
        System.out.println("Message " + message);
    }

    public static void main(String[] args) {
        Error first = new Error(true, 32, "неявный конструктор");
        first.printInfo();
        Error second = new Error();
        second.printInfo();
    }
}
