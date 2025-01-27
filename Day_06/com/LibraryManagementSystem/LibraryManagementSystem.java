package com.LibraryManagementSystem;
// Main Class
public class LibraryManagementSystem {
    public static void main(String[] args) {

        //library items objects
        LibraryItem book = new Book(1, "Atomic habits", "harry");
        LibraryItem magazine = new Magazine(2, "Times of India", "Indian author");
        LibraryItem dvd = new DVD(3, "Harry Potter", "gosling");

        //print details and loan duration
        System.out.println(book.getItemDetails() + " | Loan Duration: " + book.getLoanDuration() + " days");
        System.out.println(magazine.getItemDetails() + " | Loan Duration: " + magazine.getLoanDuration() + " days");
        System.out.println(dvd.getItemDetails() + " | Loan Duration: " + dvd.getLoanDuration() + " days");

        //reservation functionality
        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem("Subha");
        System.out.println("Book availability: " + reservableBook.isAvailable());

        Reservable reservableMagazine = (Reservable) magazine;
        reservableMagazine.reserveItem("priya");
        System.out.println("Magazine availability: " + reservableMagazine.isAvailable());

        Reservable reservableDVD = (Reservable) dvd;
        reservableDVD.reserveItem("gian");
        System.out.println("DVD availability- " + reservableDVD.isAvailable());
    }
}