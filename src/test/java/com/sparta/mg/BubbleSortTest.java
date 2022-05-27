package com.sparta.mg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    @DisplayName("check that the given number is sorted")
    void checksort(){
        Assertions.assertArrayEquals((new int[]{1, 34}), BubbleSort.bubbleSort(new int[]{ 34, 1}));
    }
    @Test
    @DisplayName("check that the given number is sorted")
    void checkTotal() {
        Assertions.assertArrayEquals((new int[]{2,34,67,89}), BubbleSort.bubbleSort(new int[]{ 67,89,34,2}));
    }

    @Test
    @DisplayName("check that the given number is sorted")
    void checknegative() {
        Assertions.assertArrayEquals((new int[]{-89,-67,-34,-2}), BubbleSort.bubbleSort(new int[]{ -67,-89,-34,-2}));
    }


    @Test
    @DisplayName("check that the given number is sorted")
    void checkbothpossitiveandnegative(){
        Assertions.assertArrayEquals((new int[]{-34,1,56}), BubbleSort.bubbleSort(new int[]{ 56, 1,-34}));
    }

    @Test
    @DisplayName("check that the given number is sorted")
    void checkbothpossitiverange(){
        Assertions.assertArrayEquals((new int[]{0,1}), BubbleSort.bubbleSort(new int[]{ 1,0}));
    }
    @Test
    @DisplayName("check that the given number is sorted")
    void checkwithnullvalues(){
        Assertions.assertArrayEquals((new int[]{}), BubbleSort.bubbleSort(new int[]{ }));
    }
}
