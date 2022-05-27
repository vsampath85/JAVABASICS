package com.sparta.mg;

import com.sparta.mg.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    @DisplayName("check that the given word is palindrome or not")
    void checkpalindromeword(){
        Assertions.assertEquals(true, Palindrome.ispalindrome("radar"));
    }

    @Test
    @DisplayName("check that the given string of word is palindrome or not")
    void checkpalindromenumber(){
        Assertions.assertEquals(true, Palindrome.ispalindrome("123321"));
    }

    @Test
    @DisplayName("check that the casesensitive word is palindrome or not")
    void checkpalindromecasesensitive(){
        Assertions.assertEquals(true, Palindrome.ispalindrome("RaDAr"));
    }

    @Test
    @DisplayName("check that the given sentence is palindrome or not")
    void checkpalindromesentence(){
        Assertions.assertEquals(true, Palindrome.ispalindrome("Step on no pets"));
           }

    @Test
    @DisplayName("check that the given String arrya is palindrome or not")
    void checkpalindromestringarray(){
        String sentence = "kayak deified rotator repaper deed peep wow noon civic racecar level";
        Assertions.assertEquals(true, Palindrome.ispalindrome(sentence.split(" ")));
    }

    @Test
    @DisplayName("check that the given null is palindrome or not")
    void checkpalindromeempty(){
        Assertions.assertEquals(true, Palindrome.ispalindrome(""));
    }

    @Test
    @DisplayName("check that the given word is palindrome or not")
    void checkpalindromewrong(){
        Assertions.assertEquals(false, Palindrome.ispalindrome("blue"));
    }

    @Test
    @DisplayName("check that the given word is palindrome or not")
    void checkpalindromenegativenumbers(){
        Assertions.assertEquals(false, Palindrome.ispalindrome("-12345"));
    }


}
