// package name
package edu.handong.csee.java.lab13.prob3;

// Circle class which is a subclass of Shapes abstract class
public class Circle extends Shapes {
	private double radius; // radius variable to store the radius of the circle

	// default constructor 
	public Circle() {
		radius = 0; // radius set to default as 0
	}

	// constructor with radius passed as parameter
	public Circle(double radius) {
		this.radius = radius; // sets the value of radius as the parameter passed
	}

	// area method to calculate the area of the circle and return the result
	public double area() {
		return Math.PI*radius*radius; // returns the calculated area
	}

	// perimeter method to calculate the perimeter of the circle and return the result
	public double perimeter() {
		return 2*Math.PI*radius; // returns the calculated perimeter
	}

	// getter method to get the radius
	public double getRadius() {
		return this.radius; // returns the radius of the current instance of Circle class 
	}

}
