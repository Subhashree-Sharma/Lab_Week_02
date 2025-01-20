class Book {
    // Static variable
    static String libraryName;

    // Final variable
    final int isbn;
    private String title;
    private String author;

    //constructor
    Book(String libraryName, String title, String author, int isbn) {
        Book.libraryName = libraryName;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library name - " + libraryName);
    }

    //instance method to display book details
    public void displayBookDetails() {
        System.out.println("Title of book - " + title);
        System.out.println("Author of book - " + author);
        System.out.println("ISBN - " + isbn);
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {
        //new Book object
        Book obj = new Book("TIT Library", "Arihant", "Subhashree", 324);

        //call static method to display library name
        Book.displayLibraryName();

        // Call instance method to display book details
        obj.displayBookDetails();
    }
}
