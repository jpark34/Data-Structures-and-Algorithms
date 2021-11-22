package com.algorithms.and.structures.data;

public class Main {

    public static void main(String[] args) {

        int[] arrayInt = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arrayInt.length; firstUnsortedIndex++) {
            int newElement = arrayInt[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && arrayInt[i - 1] > newElement; i--) {
                arrayInt[i] = arrayInt[i - 1];
            }

            arrayInt[i] = newElement;
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }
}
