package com.sparta.mg;

public class Practice {
    public static void main(String[] args) {
        Practice vobject = new Practice();

        String sentence = "kayak deified rotator repaper deed peep wow noon civic racecar level";
        String palindromewords = "";
        int maxWordSize = 0;

        vobject.arraytoint();
        vobject.remoteUppervowels("AeIoUcdf");
        vobject.sequence(new int[]{1,2,3,4,5,6,7,8,9});
        vobject.removeduplicates("aadhavan");
        maxWordSize = vobject.findMaxWordSize(palindromewords.split(","));
        vobject.printMaxWord(palindromewords.split(","), maxWordSize);
    }
public  void arraytoint(){
    int[] i ={5,2,3,4};
    String d = "";

    for(int r=0;r<i.length ;r++){
        d = d+i[r];
    }
    System.out.println(Integer.parseInt(d));
}

public void remoteUppervowels(String pString) {
        String vVowels = "AEIOU";
        String newstring = "";
//        for (char c : pString.toCharArray()) {
//            String curchar = ""+c;
//            if (!vVowels.contains(curchar))
//                newstring  = newstring + c;
//        }
        System.out.println("The new string is : "+ pString.replaceAll("[AEIOU]", ""));

}
public int sequence(int[] seq) {
        int result = 0;
    for (int i = 0; i < seq.length; i++) {

        if(seq[i] % 2 == 0 || seq[i] % 3 == 0) {
            result += seq[i];}



    }
    System.out.println(result);
    return result;

    }

    public char[] removeduplicates(String name){
        String a = "";
        char[] b = name.toCharArray();
        for(char c : b){
            String d = ""+c;
            if(!a.contains(d))
                a+=c;
        }
        System.out.println("The new string after removing duplicates : " + a);
        return a.toCharArray();

    }


    public static int findMaxWordSize(String[] wordListtoFindMax) {
        int maxWordSize = 0;
        for(String curPolindrome : wordListtoFindMax) {
            if (curPolindrome.length() > maxWordSize)
                maxWordSize = curPolindrome.length();
        }
        return maxWordSize;
    }

    public static void printMaxWord(String [] palindromeList, int maxWordSize) {
        for (String curPolindrome : palindromeList) {
            if (curPolindrome.length() >= maxWordSize)
                System.out.println("The palindrome with max size of "+maxWordSize+" is : "+curPolindrome);
        }
    }




}

