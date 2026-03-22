package org.testleaf.week3.homeassignment3.Inheritance;

//Subclass inheriting from the Button class
public class Elements extends Button{
    public static void main(String[] args) {
        Elements eleOptions = new Elements();
        eleOptions.submit();
        eleOptions.click();
        eleOptions.setText("text");
    }

}
