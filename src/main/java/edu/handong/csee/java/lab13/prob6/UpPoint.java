// package name
package edu.handong.csee.java.lab13.prob6;

// UpPoint class implementing CapitalPrint interface
public class UpPoint implements CapitalPrint {
	private int x,y; // x and y values stored in variables
	
	// empty constructor
	public UpPoint() {
		x = 0; // sets x value as default 0
		y = 0; // sets y value as default 0
	}
	
	// constructor with parameters of x and y values passed
	public UpPoint(int x, int y) {
		this.x = x; // sets the value of x as the parameter given
		this.y = y; // sets the value of y as the parameter given
	}
	
	// toString method
	public String toString() {
		return "x: " + x + " y: " + y; // returns the information of the class values (x and y) in String type
	}
}
