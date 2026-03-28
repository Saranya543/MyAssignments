package org.testleaf.week4.homeassignment4;


import java.util.LinkedHashSet;
import java.util.Set;


//prints only the unique characters from the String using the Set 
public class DemonstratingSetInterfaceInJAva {
    public static void main(String[] args) {
        String input = "google";
        int length = input.length();
        Set<Character> uniqueCharacters = new LinkedHashSet<Character>();
        for(int i=0;i<length;i++){
            char charInput = input.charAt(i);
            uniqueCharacters.add(charInput);
            
        }
        System.out.println("Unique characters in the given String is :"+uniqueCharacters);
            


    }
    
    

}
