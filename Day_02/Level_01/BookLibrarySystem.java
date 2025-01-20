class Book3{
    //public member
    public String ISBN;

    //protected member
    protected String title;

    //private member
    private String author;

    // Constructor
    public Book3(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    //getter for author
    public String getAuthor() {
        return author;
    }

    //setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    //using method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

//Subclass to demonstrate access modifiers
class EBook extends Book3 {

    private String fileSize;

    // Constructor
    public EBook(String ISBN, String title, String author, String fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("File Size: " + fileSize);
        // Cannot access author directly as it is private
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        //create a Book object
        Book3 book = new Book3("978-3-16-148410-0", "Java Programming", "John Doe");
        book.displayBookDetails();

        //modify and display author
        book.setAuthor("Jane Doe");
        System.out.println("Updated Author: " + book.getAuthor());

        //create an EBook object
        EBook ebook = new EBook("978-1-23-456789-7", "Advanced Java", "Alice Smith", "5MB");
        ebook.displayEBookDetails();
    }
}
