package ru.job4j.arrays;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] rigth) {
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < rigth.length; j++) {
                if (left[i] == rigth[j]) {
                    System.out.println(left[i]);
            }
            }
        }
    }
}
