// package name
package edu.handong.csee.java.lab13.prob4;

// Animal class
public class Animal {
	private String name; // name variable of the Animal stored in String type 
	
	// empty constructor
	public Animal() {
		this.name=""; // sets the default value of name as empty;
	} 
	
	// constructor with Animal name as parameter
	public Animal(String name) {
		this.name = name; // sets the name as the one given as parameter
	}
	
	// getter method to get the name
	public String getName() {
		return this.name; // returns the name
	}
}
