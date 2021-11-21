package com.algorithms.and.structures.data;

public class Main {

    public static void main(String[] args) {

        int[] arrayInt = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = arrayInt.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestElement = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arrayInt[i] > arrayInt[largestElement]) {
                    largestElement = i;
                }
            }

            swap(arrayInt, largestElement, lastUnsortedIndex);
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
