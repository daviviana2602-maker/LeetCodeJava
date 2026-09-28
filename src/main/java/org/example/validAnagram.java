package org.example;


import java.util.Arrays;

public class validAnagram {


    public static void main(String[] args) {

        Boolean result = leetCodeThree();
        System.out.println(result);

    }


    private static boolean leetCodeThree(){

        String s = "anagram";
        String t = "nagaram";

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        Arrays.sort(arrayS);
        Arrays.sort(arrayT);

        return Arrays.equals(arrayS, arrayT);

    }

}