package com.sparta.mg;

import com.sparta.mg.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    @DisplayName("Check the 1st value is 1")
    void Checkthe1stvalueis1() {
        Assertions.assertEquals(Fibonacci.getFibonacci(1), 1);
    }

    @Test
    @DisplayName("Check the 3rd value is 2")
    void checkthrid() {
        Assertions.assertEquals(Fibonacci.getFibonacci(3), 2);
    }

    @Test
    @DisplayName("Check the 10th value is 55")
    void checktenth() {
        Assertions.assertEquals(Fibonacci.getFibonacci(10), 55);
    }

    @Test
    @DisplayName("Check the 0 value is 0")
    void checkzero() {
        Assertions.assertEquals(Fibonacci.getFibonacci(0), 0);
    }

    @Test
    @DisplayName("Check the -1 value is 0")
    void checknegative() {
        Assertions.assertEquals(Fibonacci.getFibonacci(-10), 0);
    }


}