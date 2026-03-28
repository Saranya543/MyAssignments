package org.testleaf.week4.homeassignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Find the second largest number from the given array using List
public class FindSecondLargestInTheList {
    public static void main(String[] args) {
        // Declare an array
        Integer[] arr = { 3, 2, 11, 4, 6, 7 };

        // Convert the array to List
        List<Integer> arrList = new ArrayList<>(Arrays.asList(arr));

        // Sort the List
        Collections.sort(arrList);
        System.out.println("List after sorting: " + arrList);

        // Find the second largest number in the list by iterating through the list
        int size = arrList.size();
        int secondLargest = arrList.get(size - 2);
        System.out.println("Second Largest number in the list is : " + secondLargest);

    }

}
