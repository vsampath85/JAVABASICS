package com.sparta.mg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TTDtest {

    @Test
    @DisplayName("check that {1} returns 1")
    void checkSingleReturn() {
        Assertions.assertEquals(1, TTD.getTotal(new int[]{1}));
    }

    @Test
    @DisplayName("check that {1, 2} returns 3")
    void checkTotal() {
        Assertions.assertEquals(3, TTD.getTotal(new int[]{1, 2}));
    }

    @Test
    @DisplayName("check that null returns zero")
    void checkZero() {
        Assertions.assertEquals(0, TTD.getTotal(null));
    }

    @Test
    @DisplayName("check that {-3, 2} returns negative")
    void checkNegative() {
        Assertions.assertEquals(-1, TTD.getTotal(new int[]{-3, 2}));
    }

    @Test
    @DisplayName("check that {-3, -4} returns negative")
    void checkDoubleNegative() {
        Assertions.assertEquals(-7, TTD.getTotal(new int[]{-3, -4}));
    }


    @Test
    @DisplayName("check that {MAX, MAX, 1} returns -1")
    void checkMAX() {
        Assertions.assertEquals(-1, TTD.getTotal(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 1}));
    }

}
