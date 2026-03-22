package org.testleaf.week3.homeassignment3;

//To compare two arrays and print matching items
public class FindIntersection {
    public static void main(String[] args) {
        int[] a = { 3, 2, 11, 4, 6, 7 };
        int[] b = { 1, 2, 8, 4, 9, 7 };
        int lengthOfa = a.length;
        int lengthOfb = b.length;

        for (int i = 0; i < lengthOfa; i++) {
            for (int j = 0; j < lengthOfb; j++) {
                if (a[i] == b[j]) {
                    System.out.println("Matching values between 2 arrays are: " + a[i]);
                }
            }
        }

    }

}
