package com.LibraryManagementSystem;
//interface reservable
public interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean isAvailable();
}
