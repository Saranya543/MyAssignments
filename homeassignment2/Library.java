package org.testleaf.week2.day2.homeassignment;

public class Library {
    public String addBook(String bookTitle){
        System.out.println("Book added successfully");
        return bookTitle;
    }

    public void issueBook(){
        System.out.println("Book issued successfully");
    }
    public static void main(String[] args) {
        Library lib = new Library();
        String titleOfBook = lib.addBook("Wings of Fire");
        System.out.println(titleOfBook);
        lib.issueBook();
    }

}
