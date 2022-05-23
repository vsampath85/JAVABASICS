package com.sparta.mg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Apptest {
    @Test
    @DisplayName("check that 5 == 5")
    void simpleTest() {
        Assertions.assertEquals(true, 5 == 5);
    }

    @Test
    @DisplayName("check that we can return Good Afternoon")
    void checkWeCanReturnGoodAfternoon(){
        Assertions.assertEquals("Good Afternoon",App.greeting(13));
    }

    @Test
    @DisplayName("check that we can return Good Evening")
    void checkWeCanReturnGoodEvening(){
        Assertions.assertEquals("Good Evening",App.greeting(19));
    }

    @Test
    @DisplayName("check that we can return Good Night")
    void checkWeCanReturnGoodNight(){
        Assertions.assertEquals("Good Night",App.greeting(21));
    }
    @Test
    @DisplayName("check that we can return Invalid Time")
    void checkWeCanReturnInvalidTime(){
        Assertions.assertEquals("Not a valid time",App.greeting(26));
    }
    @Test
    @DisplayName("check that we can return Invalid Time")
    void checkWeCanReturnInvalidTimeNegative() {
        Assertions.assertEquals("Not a valid time", App.greeting(-1));
    }
    @Test
    @DisplayName("check that we can return Boundary values")
    void checkWeCanReturnBoundaryMorning(){
        Assertions.assertEquals("Good Morning",App.greeting(12));
    }

    @Test
    @DisplayName("check that we can return Boundary values")
    void checkWeCanReturnBoundaryEvening(){
        Assertions.assertEquals("Good Evening",App.greeting(20));
    }
    @Test
    @DisplayName("check that we can return Boundary values")
    void checkWeCanReturnBoundaryNight(){
        Assertions.assertEquals("Good Night",App.greeting(23));
    }
}
