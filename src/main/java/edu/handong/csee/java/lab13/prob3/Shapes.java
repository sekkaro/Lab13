// package name
package edu.handong.csee.java.lab13.prob3;

// Shapes abstract class
public abstract class Shapes {
	public abstract double area(); // abstract method area 
	public abstract double perimeter(); // abstract method perimeter

	// display method
	public void display() {
		System.out.println("Area: " + area()); // this calls out area() method of that particular instance it is calling from
		System.out.println("Perimeter: " + perimeter()); // this calls out perimeter() method of that particular instance it is calling from
	}
}
