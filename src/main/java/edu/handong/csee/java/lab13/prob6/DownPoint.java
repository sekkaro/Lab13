// package name
package edu.handong.csee.java.lab13.prob6;

// class DownPoint
public class DownPoint {
	private int x,y; // two integer values storing x and y coordinates

	// empty constructor
	public DownPoint() {
		x = 0; // sets the value of x as default 0
		y = 0; // sets the value of y as default 0
	}

	// constructor with 2 parameters of x and y value
	public DownPoint(int x, int y) {
		this.x = x; // sets the value of x as given in the parameter
		this.y = y; // sets the value of y as given in the parameter
	}

	// toString method
	public String toString(){
		return "x: " + x + " y: " + y; // returns the information of the x and y values of downpoint instances in String type
	}

}
