package com.LibraryManagementSystem;
//subclass Book
class Book extends LibraryItem implements Reservable {
    private boolean reserved;
    private String reservedBy;

    //constructor
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
        this.reservedBy = null;
    }
    //get loan
    @Override
    public int getLoanDuration() {
        //loan duration
        return 21;
    }
//reserve item
    @Override
    public boolean reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            reservedBy = borrowerName;
            System.out.println("Book reserved by - " + borrowerName);
            return true;
        }
        System.out.println("Book is already reserved");
        return false;
    }
    //available or not
    @Override
    public boolean isAvailable() {
        return !reserved;
    }
}