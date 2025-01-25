package AnimalHierarchy;

class Animal{
    //data members
    private String name;
    private int age;

    //constructor of animal class
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //method for overriding
    public void makeSound(){
        System.out.println("AnimalHierarchy.Animal sound");
    }

    //display details of animals
    public void display(){
        System.out.println("Name " + name + " age " + age);
    }
}

//dog class
class Dog extends Animal{

    //constructor
    Dog(String name, int age){
        super(name, age);
    }

    //overriding sound method
    public void makeSound(){
        System.out.println("Bhaww, Bhaww");
    }
}

//cat class
class Cat extends Animal{

    //constructor of cat class
    Cat(String n, int a){
        super(n, a);
    }

    //overriding sound method
    public void makeSound(){
        System.out.println("Meowwwwwwww");
    }
}

//bird class
class Bird extends Animal{

    //constructor of bird class
    Bird(String n, int a){
        super(n, a);
    }

    //overriding sound method
    public void makeSound(){
        System.out.println("kookrudk kuuu...");
    }
}

//main class
public class AnimalHierarchy {
    public static void main(String[] args) {

        //creating object of dog, cat, bird class
        Animal dog = new Dog("Luffy " , 18);
        Animal cat = new Cat("Zoro ", 19);
        Animal bird = new Bird("Nami " , 20);

        //calling display method for displaying details and sound method
        dog.display();
        dog.makeSound();

        cat.display();
        cat.makeSound();

        bird.display();
        bird.makeSound();
    }
}
