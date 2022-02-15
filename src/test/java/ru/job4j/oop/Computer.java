package ru.job4j.oop;

public class Computer {

    private boolean multiMonitor;

    private int ssd;

    private String cpu;

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(boolean multiMonitor, double ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = (int) ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd);
        System.out.println("Model CPU: " + cpu);
    }

    public static void main(String[] args) {
        Computer second = new Computer(true, 500, "Intel Core i7");
        second.printInfo();
        Computer third = new Computer(600, "Intel Core i5");
        third.printInfo();
        Computer fourth = new Computer(true, 512.0, "Intel Core i3");
        fourth.printInfo();
    }
}
