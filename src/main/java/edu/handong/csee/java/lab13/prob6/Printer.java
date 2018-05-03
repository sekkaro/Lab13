// package name
package edu.handong.csee.java.lab13.prob6;

// Printer class
public class Printer {

	// print static method
	public static void print(Object object) {
		// if the object that was returned as parameter is instance implementing CapitalPrint interface,
		if(object instanceof CapitalPrint) {
			System.out.println((object.toString()).toUpperCase()); // then print its information in uppercase
		}
		//else,
		else {
			System.out.println(object.toString()); // just print it out normally in lowercase
		}
	}

}
