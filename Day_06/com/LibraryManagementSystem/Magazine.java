package com.LibraryManagementSystem;
//subclass Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean reserved;

    //constructor
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
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
            System.out.println("Magazine reserved by-" + borrowerName);
            return true;
        }
        System.out.println("Magazine is already reserved.");
        return false;
    }

    // available or not
    @Override
    public boolean isAvailable() {
        return !reserved;
    }
}
