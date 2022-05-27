package com.sparta.mg;

public class BubbleSort {

    public static void main(String[] args) {
        int numbers[] = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        bubbleSort(numbers);

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

    public static int[] bubbleSort(int[] bubblenumbers) {
        int n = bubblenumbers.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (bubblenumbers[j - 1] > bubblenumbers[j]) {
                    temp = bubblenumbers[j - 1];
                    bubblenumbers[j - 1] = bubblenumbers[j];
                    bubblenumbers[j] = temp;
                }
            }


        }return bubblenumbers;

    }
}