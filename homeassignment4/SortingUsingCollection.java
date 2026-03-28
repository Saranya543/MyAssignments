package org.testleaf.week4.homeassignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Reverse the given collection of String elements
public class SortingUsingCollection {
    public static void main(String[] args) {
        //Declara a String Array
        String[] arr= {"HCL", "Wipro", "Aspire Systems", "CTS"};

        //Convert String arays to List
        List<String> arrList = Arrays.asList(arr);

        //Sort the List and print the sorted list
        Collections.sort(arrList);
        System.out.println(arrList);

        //Create a List to store the reversed values in the list
        List<String> result = new ArrayList<String>();

        //Iterate through the loop to reverse the string elements in the list
        for(int j = arrList.size() - 1; j >= 0; j--){
            result.add(arrList.get(j));
        }
        //Printing the result 
        System.out.println(result);

    }


}
