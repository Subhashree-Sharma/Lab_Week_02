import java.util.ArrayList;

//Book class
class Book{

   private final String title;
   private String author;

   //constructor
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    //get title of book
    public String getTitle(){
        return title;
    }

    //get author name
    public String getAuthor(){
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

//define lib class
class Library{
    private String name;
    private ArrayList<Book> books;

    //constructor
   Library(String name){
       this.name = name;
       this.books = new ArrayList<>();
   }

   //using method for adding books into the arraylist
   public void addBook(Book book){
       books.add(book);
   }

   //using method for displaying details
   public void displayDetails(){
       System.out.println("Library name - " + name);
       if(books.isEmpty()){
           System.out.println("There is no book in the library");
       }else{
           for (Book book : books) {
               System.out.println(book);
           }
       }
   }
}

//main class is showing aggregation
public class LibraryAndBooks {
    public static void main(String[] args) {

        //individual book objects
        Book book1 = new Book("Arihant" , "Subhashree");
        Book book2 = new Book("RD Sharma", "Sharmaji");

        //individual library object
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("Tit Library");

        //adding books to library1
         lib1.addBook(book1);
        lib1.addBook(book2);

        //adding books to library2
        lib2.addBook(book1);
        lib2.addBook(book2);

        //display books in each library
        lib1.displayDetails();
        lib2.displayDetails();
    }
}











