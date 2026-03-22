package org.testleaf.week3.homeassignment3;

import java.util.Arrays;

//To fetch the duplicate values from the array
public class FindDups {
    
    public static void main(String[] args) {
        
        int[] num={2, 5, 7, 7, 5, 9, 2, 3};
        int lengthOfNum = num.length;
        Arrays.sort(num);
        for(int i=0;i<lengthOfNum;i++){
            for(int j=i+1;j<lengthOfNum;j++){

                if(num[i]==num[j]){
                    System.out.println("Duplicate value is: " +num[i]);
                }

            }
        }


    }

}
