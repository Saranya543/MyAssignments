package org.testleaf.week3.homeassignment3;

//Remove the duplicate words from a String
public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String text = "We learn Java basics as part of java sessions in java week1";
        int count = 0;
        String[] arrText = text.split(" ");
        int length = arrText.length;
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arrText[i].equalsIgnoreCase(arrText[j])) {
                    count = count + 1;
                    arrText[j] = "";
                }
            }
        }
        System.out.println(count);
        if (count > 0) {
            for (int i = 0; i < length; i++) {
                System.out.print(arrText[i] + " ");
            }
        } else
            System.out.println("No Duplicates found");

    }

}
