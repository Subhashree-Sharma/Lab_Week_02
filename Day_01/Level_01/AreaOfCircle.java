import java.util.Scanner;

     class Circle{
	 double radius;

	//constructor
	Circle(double radius){
	  this.radius = radius;
	}

	//method to calculate area
	public double calculateArea(double radius){
		return Math.PI * radius * radius;
		
	}

	//method to calculate circumference
	public double calculateCircumference(double radius){
	       return 2 * Math.PI * radius;
	}
	
	 // Method to display details
       public void displayDetails() {
        System.out.println("Area of the circle -  " + calculateArea(radius));
        System.out.println("Circumference of the circle -" + calculateCircumference(radius));
    }
}
public class AreaOfCircle{

	public static void main(String[] args){

	//using scanner for taking inputs
	Scanner sc = new Scanner (System.in);

	System.out.println("Enter the radius of a circle - ");
	double radius = sc.nextDouble();

	//creating an object of circle class
	Circle obj = new Circle(radius);
	
	//display area and circumference
        obj.displayDetails();

	//closing scanner object
        sc.close(); 
    }
}
