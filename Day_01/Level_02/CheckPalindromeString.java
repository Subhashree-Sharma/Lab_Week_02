package Day_06.Level_02;

import java.util.Scanner;

   class PalindromeChecker{

    	String text;

	   //constructor to initialize text
	   public PalindromeChecker(String text) {
		   this.text = text;
	   }
	//using method to reverse a string
       public String reverseString() {
    
        String reversed = "";

       //looping through the string from the end to the beginning
        for (int i = text.length() - 1; i >= 0; i--) {
           
           reversed = reversed + text.charAt(i);
        }

        return reversed;
    }
	   //using method to check and display the result
	   public void displayResult() {

		   // Get the reversed string
		   String reversed = reverseString();

		   // Use .equals() to compare strings
		   if (text.equals(reversed)) {
			   System.out.println("It is a palindrome string.");
		   } else {
			   System.out.println("It is not a palindrome string.");
		   }}
   }
public class CheckPalindromeString{

public static void main(String[] args){

	//using scanner class for taking input
	Scanner sc = new Scanner(System.in);

	//Take user input
	System.out.println("Enter the text - ");
	String text = sc.next();

	//creating object
	PalindromeChecker check = new PalindromeChecker(text);

	//calling display method
	check.displayResult();

	//closing scanner
	sc.close();
	}
}