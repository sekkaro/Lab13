package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet {
	public Dog() {
		super();
	}
	
	public Dog(String name) {
		super(name);
	}
	
	public String food() {
		return "(Dog!)Sausage";
	}
}
