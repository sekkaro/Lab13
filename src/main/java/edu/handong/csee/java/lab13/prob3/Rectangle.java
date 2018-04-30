package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shapes {
	private double length, width;
	
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length*width;
	}
	
	public double perimeter() {
		return 2*(length+width);
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
}
