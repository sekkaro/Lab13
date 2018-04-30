package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet {

	public Cat(){
		super();
	}
	
	public Cat(String name) {
		super(name);
	}
	
	public String food() {
		return "(Cat!)Fish";
	}
}
