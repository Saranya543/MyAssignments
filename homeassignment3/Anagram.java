package org.testleaf.week3.homeassignment3;

import java.util.Arrays;

//To determine whether two given strings are anagrams
public class Anagram {
    public static void main(String[] args) {
        String text1 = "stops";
        String text2 = "potss";

        if(text1.length() == text2.length()){
            char[] a= text1.toCharArray();
            char[] b= text2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a, b)){
                System.out.println("The given strings are Anagram");
            }
            else
                System.out.println("The given strings are not an Anagram");

        }
        else
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram");


    }

}
