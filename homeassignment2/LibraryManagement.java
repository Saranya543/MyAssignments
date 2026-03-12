package org.testleaf.week2.day2.homeassignment;

public class LibraryManagement {

    public static void main(String[] args) {
        Library libMan = new Library();
        String titleOfBook = libMan.addBook("Wings of Fire");
        System.out.println(titleOfBook);
        libMan.issueBook();
    }
}
