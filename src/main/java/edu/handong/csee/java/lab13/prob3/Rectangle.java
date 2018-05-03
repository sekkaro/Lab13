// package name
package edu.handong.csee.java.lab13.prob3;

// Rectangle class which is a subclass of Shapes abstract class
public class Rectangle extends Shapes {
	private double length, width; // length and width variables to store length and width of rectangle in double type
	
	// default constructor
	public Rectangle() {
		length = 0; // sets default value of length as 0
		width = 0; // sets degault valye of width as 0
	}
	
	// constructor with parameters length and width passed
	public Rectangle(double length, double width) {
		this.length = length; // sets the length as the length given from parameter
		this.width = width; // sets the width as the length given from parameter
	}
	
	// area method that returns the calculated area
	public double area() {
		return length*width; // returns the calculated area of rectangle
	}
	
	// area method that returns the calculated perimeter
	public double perimeter() {
		return 2*(length+width); // returns the calculated perimeter of rectangle
	}
	
	// getter method to get the length
	public double getLength() {
		return this.length; // returns the length of the current instance of Rectangle class 
	}
	
	// getter method to get the width
	public double getWidth() {
		return this.width; // returns the width of the current instance of Rectangle class 
	}
}
