package edu.handong.csee.java.lab13.prob6;

public class Printer {
	public static void print(Object object) {
		if(object instanceof CapitalPrint) {
			System.out.println((object.toString()).toUpperCase());
		}
		else {
			System.out.println(object.toString());
		}
	}

}
