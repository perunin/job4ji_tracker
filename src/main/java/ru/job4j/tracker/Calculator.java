package ru.job4j.tracker;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int multiply(int a) {
        return x * a;

    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return (sum(a) + minus(a) + multiply(a) + divide(a));
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("sum = " + result);

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(10);
        System.out.println("multiply = " + rsl);

        int minus = minus(10);
        System.out.println("minus = " + minus);

        Calculator divide = new Calculator();
        int rsldivide = divide.divide(10);
        System.out.println("divide = " + rsldivide);

        Calculator allresult = new Calculator();
        int rslallresult = allresult.sumAllOperation(10);
        System.out.println(rslallresult);
    }
}
