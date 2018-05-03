// package name
package edu.handong.csee.java.lab13.prob4;

// Dog class which is a subclass of Animal class and implements pet interface 
public class Dog extends Animal implements Pet {
	// empty constructor
	public Dog() {
		super(); // calls empty constructor of superclass: Animal 
	}
	
	// constructor with name as parameter
	public Dog(String name) {
		super(name); // calls constructor of Animal class passing the name value as parameter
	}
	
	// food() method prints out what Dog eats
	public String food() {
		return "(Dog!)Sausage"; // prints out the message "(Dog!)Sausage"
	}
}
