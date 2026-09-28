package org.example;


public class validPalindrome {

    public static void main(String[] args) {

        boolean result = isPalindrome("radar");
        System.out.println(result);

    }


    private static boolean isPalindrome(String word) {

        String reversedWord = new StringBuilder(word).reverse().toString();

        return word.equals(reversedWord);

    }

}