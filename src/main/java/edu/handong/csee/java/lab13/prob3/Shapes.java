package edu.handong.csee.java.lab13.prob3;

public abstract class Shapes {
	public abstract double area();
	public abstract double perimeter();
	
	public void display() {
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
	}
}
