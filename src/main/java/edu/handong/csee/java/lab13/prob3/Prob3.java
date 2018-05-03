// package name
package edu.handong.csee.java.lab13.prob3;

// imports Scanner class to read user inputs
import java.util.Scanner;

// Prob3 class that acts like main
public class Prob3 {
	
	// main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // creates instance of Scanner class
		
		System.out.print("Enter radius: "); // guides the user to enter the radius
		Circle circle1 = new Circle(input.nextDouble()); // creates an instance of the circle by passing the user-given radius value
		System.out.println("Radius: " + circle1.getRadius()); // shows the value of radius using getter method of radius
		circle1.display(); // calls the display method of Shapes abstract class from instance of circle class to show the value of calculated area and perimeter
		
		System.out.print("\nEnter length and width: "); // guides the user to enter the length and width
		Rectangle rectangle1 = new Rectangle(input.nextDouble(),input.nextDouble()); // creates an instance of the Rectangle by passing the user-given length and width value
		System.out.println("Length: " + rectangle1.getLength()); // shows the value of length using getter method of length
		System.out.println("Width: " + rectangle1.getWidth()); // shows the value of width using getter method of width
		rectangle1.display(); // calls the display method of Shapes abstract class from instance of rectangle class to show the value of calculated area and perimeter
	}

}
