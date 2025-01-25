package SingleInheritance.LibraryManagement;

//book class - superclass
class Book{
    private String title;
    private int publicationYear;

    //constructor of super class
    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    //display details
    public void displayInfo(){
        System.out.println("Title - " + title + "\n publication year of book - " + publicationYear);
    }
}

//author class - subclass
class Author extends Book{
    private String name;
    private String bio;

    //constructor of author class
    Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    //overriding display method
    @Override
    public void displayInfo() {
        System.out.println("Book and author details - ");
        super.displayInfo();
        System.out.println("Author name - " + name + "\n Author bio - " + bio);
    }
}

//main class
public class ManageLibrary {
    public static void main(String[] args) {

        //create obj of author class
        Book author = new Author("Paapi Gudiya", 2004, "Subhashree", "s" + "xyz");

        //display details
        author.displayInfo();
    }
}

