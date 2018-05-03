// package name
package edu.handong.csee.java.lab13.prob4;

// cat class which is a subclass of Animal and implements the pet interface
public class Cat extends Animal implements Pet {

	// empty constructor
	public Cat(){
		super(); // calls the empty constructor of Animal class too
	}

	// constructor with parameter of name value
	public Cat(String name) {
		super(name); // calls the constructor of Animal class by passing name value
	}

	// food method that shows what the cat eats
	public String food() {
		return "(Cat!)Fish"; // returns the string message "(Cat!)Fish"
	}
}
