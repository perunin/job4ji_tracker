package ru.job4j.arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int aleft = 0;
        int bright = 0;
        int crsl = 0;
        while (aleft < left.length && bright < right.length) {
            if (aleft < bright) {
                rsl[crsl++] = left[aleft++];
            } else {
                rsl[crsl++] = right[bright++];
            }
        }
        while (aleft < left.length) {
            rsl[crsl++] = left[aleft++];
        }
        while (bright < right.length) {
            rsl[crsl++] = right[bright++];
        }
        return rsl;
    }
}
