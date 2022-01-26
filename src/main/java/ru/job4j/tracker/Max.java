package ru.job4j.tracker;

public class Max {
    public static int max(int one, int second) {
        return one > second ? one : second;
    }

    public static int max(int one, int second, int third) {
        return max(one, max(second, third));
    }

    public static int max(int one, int second, int third, int four) {
        return max(one, max(second, third, four));
    }

}
