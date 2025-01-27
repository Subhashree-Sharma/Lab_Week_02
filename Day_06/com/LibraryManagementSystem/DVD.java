package com.LibraryManagementSystem;
    // Subclass DVD
    class DVD extends LibraryItem implements Reservable {
        private boolean reserved;

        //constructor
        public DVD(int itemId, String title, String author) {
            super(itemId, title, author);
            this.reserved = false;
        }

        //get loan
        @Override
        public int getLoanDuration() {
            return 11;
        }
        //reserve item
        @Override
        public boolean reserveItem(String borrowerName) {
            if (!reserved) {
                reserved = true;
                System.out.println("DVD reserved by: " + borrowerName);
                return true;
            }
            System.out.println("DVD is already reserved.");
            return false;
        }
    //available or not
        @Override
        public boolean isAvailable() {
            return !reserved;
        }
    }

