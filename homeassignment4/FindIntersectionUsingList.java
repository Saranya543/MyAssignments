package org.testleaf.week4.homeassignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionUsingList {
    public static void main(String[] args) {

        // Declare Arrays
        Integer[] a = { 3, 2, 11, 4, 6, 7 };
        Integer[] b = { 1, 2, 8, 4, 9, 7 };

        // Convert the arrays to list
        List<Integer> listOfA = new ArrayList<>(Arrays.asList(a));
        List<Integer> listOfB = new ArrayList<>(Arrays.asList(b));

        System.out.println(listOfA);
        System.out.println(listOfB);

        // Find the size of list
        int sizeofA = listOfA.size();
        int sizeofB = listOfB.size();

        // Declare another list to add the result of intersection
        List<Integer> result = new ArrayList<>();

        // Iterate through two list values and compare them

        for (int i = 0; i < sizeofA; i++) {
            for (int j = 0; j < sizeofB; j++) {
                if (listOfA.get(i).equals((listOfB.get(j)))) {
                    result.add(listOfA.get(i));

                }

            }
        }
        // Print result
        System.out.println("Intersection between two list is :" + result);

    }

}
