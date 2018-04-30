package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrint {
	private int x,y;
	
	public UpPoint() {
		x = 0;
		y = 0;
	}
	
	public UpPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x: " + x + " y: " + y;
	}
}
