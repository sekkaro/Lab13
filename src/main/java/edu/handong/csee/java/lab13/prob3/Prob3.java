package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		Circle circle1 = new Circle(input.nextDouble());
		System.out.println("Radius: " + circle1.getRadius());
		circle1.display();
		
		System.out.print("\nEnter length and width: ");
		Rectangle rectangle1 = new Rectangle(input.nextDouble(),input.nextDouble());
		System.out.println("Length: " + rectangle1.getLength());
		System.out.println("Width: " + rectangle1.getWidth());
		rectangle1.display();
	}

}
