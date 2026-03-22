package org.testleaf.week3.homeassignment3;

//To change the odd index values of the given string to uppercase
public class ChangeOddIndexToUpperCase {
    public static void main(String[] args) {
        String test= "changeme";
        char[] test1 = test.toCharArray();
        for(int i=test1.length-1;i>=0;i--){
            if(i%2!=0){
                test1[i]=Character.toUpperCase(test1[i]);
            }
            
        }
        
        String result = new String(test1);
        System.out.println(result);
    }

}
