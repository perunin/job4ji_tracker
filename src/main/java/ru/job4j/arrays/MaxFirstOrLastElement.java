package ru.job4j.arrays;

public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        if (array[0] > array[array.length - 1]) {
            return array[0];
        } else {
            return array[array.length - 1];
        }
    }
}
