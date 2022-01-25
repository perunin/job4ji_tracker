package ru.job4j.tracker;

public class Max {
    public static int max(int one, int second) {
        int result = one > second ? one : second;
        return result;
    }

    public static int max(int one, int second, int third) {
        int result = max(
                one,
                max(second, third));
        return result;
    }

    public static int max(int one, int second, int third, int four) {
        int result = max(
                one,
                max(second, third, four));
        return result;

    }

}
