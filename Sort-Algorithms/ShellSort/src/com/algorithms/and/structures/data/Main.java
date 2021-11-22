package com.algorithms.and.structures.data;

public class Main {

    public static void main(String[] args) {

        int[] arrayInt = { 20, 35, -15, 7, 55, 1, -22};

        for (int gap = arrayInt.length / 2; gap > 0; gap /=2) {


            for (int i = gap; i < arrayInt.length; i++) {
                int newElement = arrayInt[i];
                int j = i;

                while(j >= gap && arrayInt[j - gap] > newElement) {
                    arrayInt[j] = arrayInt[j - gap];
                    j -= gap;
                }

                arrayInt[j] = newElement;
            }
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }
}
