import java.util.Scanner;
class Book {
   String title;
   String author;
   Long price;

   //using parameterised constructor
   Book(String title, String author, Long price) {
       this.title = title;
       this.author = author;
       this.price = price;
   }

   //using default constructor
   Book() {
       System.out.println("This a default constructor");
   }

   //method for displaying details
   public void DisplayDetails(){
       System.out.println("Title of book - " + this.title );
       System.out.println("Author of book - " + this.author );
       System.out.println("price of book - " + this.price );
   }
}
    public class BookDetails {

        public static void main(String[] args) {

            //using scanner object for taking inputs
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the title of book - ");
            String title = sc.next();

            System.out.println("Enter the name of author - ");
            String author = sc.next();

            System.out.println("Enter the price of book - ");
            Long price = sc.nextLong();

            //obj for parameterised constructor
            Book obj = new Book(title,author, price);
            obj.DisplayDetails();
        }
    }

