package org.testleaf.week3.homeassignment3;

//Reverse the odd position words in a String
public class ReverseOddWordsInAString {
    public static void main(String[] args) {
        String test = "I am a software tester";
        String[] words = test.split(" ");
        String output = "";
        int lengthOfArrayString = words.length;
        for (int i = 0; i < lengthOfArrayString; i++) {
            if (i % 2 != 0) {
                char[] charArray = words[i].toCharArray();
                for (int j = charArray.length - 1; j >= 0; j--) {
                    output = output + charArray[j];
                    // System.out.println(output);
                }

            } else
                output = output + words[i];
            // System.out.println(output);
            if (i != lengthOfArrayString - 1) {
                output = output + " ";
            }

        }
        System.out.println(output);

    }

}
