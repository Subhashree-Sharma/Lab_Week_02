import java.util.Scanner;
class Circle {

    double radius;

    // Default constructor
     Circle() {
        this(1.0);
    }

    //parameterised constructor
    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}
public class CircleDetails {
    public static void main(String[] args) {

        //using scanner object for taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of a circle - ");
        double radius = sc.nextDouble();

        //object for default constructor
        Circle objForDefault = new Circle();
        System.out.println("Calling default constructor - ");
        objForDefault.displayDetails();

        //for parameterised constructor
        Circle objForPara = new Circle(radius);
        System.out.println("Calling parameterised constructor - ");
        objForPara.displayDetails();
    }
}

