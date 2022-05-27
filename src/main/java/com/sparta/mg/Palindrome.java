package com.sparta.mg;
import java.sql.SQLOutput;
import java.util.Locale;
public class Palindrome {

//        public static void main(String[] args) {
//             String sentence = "kayak deified rotator repaper deed peep wow noon civic racecar level";
//            //System.out.println( new StringBuilder(sentence.toLowerCase()).reverse().toString().equals(sentence.toLowerCase());
//
//        }

       public static Boolean ispalindrome(String[] sentencetoCheck) {
            String palindrome = "";
           String originalString = "";
            for (String curWord : sentencetoCheck) {
                originalString = originalString + "," +  curWord;
                if (ispalindrome(curWord)) {
                    palindrome = palindrome + "," + curWord;
                    }
            }
            return palindrome.equalsIgnoreCase(originalString);
       }

        public static boolean ispalindrome( String wordToCheck ) {
            String lowerCasewordToCheck = wordToCheck.toLowerCase();
            String reversedWord = reverse(lowerCasewordToCheck);
            return reversedWord.equalsIgnoreCase((lowerCasewordToCheck));
        }

        public static String reverse(String lowerCasewordToCheck){
            String reversedWord ="";
            for (int i =lowerCasewordToCheck.length() - 1;i>=0; i--){
                reversedWord = reversedWord + lowerCasewordToCheck.charAt(i);
            }
            return reversedWord.toLowerCase();
        }



}
