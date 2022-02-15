package ru.job4j.arrays;

public class Board {
    public static int getCountRow(int[][] array) {
        return array.length;
    }

    public static int getCountCellInRow(int[][] array, int row) {
        int rsl = 0;
        for (int i = row; i < array.length; i++) {
            rsl = array.length;
        }
        return rsl;
    }
}
