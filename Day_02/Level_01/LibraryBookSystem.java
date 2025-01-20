class Book2 {
   String title;
   String author;
   double price;
   boolean availability;

   //parameterised constructor
    public Book2(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    //method to borrow book
    public boolean borrowBook() {
        if (availability) {
            System.out.println("You have successfully borrowed \"" + title + "\" by " + author);
            availability = false;
            return true;
        } else {
            System.out.println("\"" + title + "\" by " + author + " is currently unavailable.");
            return false;
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (availability ? "Available" : "Unavailable"));
    }
}
public class LibraryBookSystem {

    public static void main(String[] args) {

        Book2 book1 = new Book2("Mathematics", "RD.Sharma", 500.0, true);
        Book2 book2 = new Book2("Arihant", "RS.Agarwal", 600.0, false);

        //display book details
        System.out.println("Book 1 Details - ");
        book1.displayDetails();

        System.out.println("Book 2 Details:");
        book2.displayDetails();

        //for borrowing books
        System.out.println("Borrowing Book 1:");
        book1.borrowBook();

        System.out.println("Borrowing Book 2:");
        book2.borrowBook();

        // Display book details again to reflect the borrowing status
        System.out.println("\nUpdated Book 1 Details:");
        book1.displayDetails();

        System.out.println("\nUpdated Book 2 Details:");
        book2.displayDetails();
    }
}
