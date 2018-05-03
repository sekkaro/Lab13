// package name
package edu.handong.csee.java.lab13.prob4;

// imports Scanner class to read user inputs
import java.util.Scanner;

// Master class that act like main
public class Master {
	
	// main method
	public static void main(String[] args) {
		Master master = new Master(); // creates instance of master class
		
		Scanner input = new Scanner(System.in); // creates instance of Scanner class
		System.out.print("Enter the cat name and dog name: "); // guides the user to type the name of cat and dog
		
		Cat cat1 = new Cat(input.next()); // creates instance of cat class by using the user inputs
		Dog dog1 = new Dog(input.next()); // creates instance of dog class by using the user inputs
		
		System.out.println("Name: " + cat1.getName()); // prints out the name of the cat by using getter method from the instance of the cat class
		master.feed(cat1); // calls feed method from master class which prints out what the cat can eat
		
		System.out.println("Name: " + dog1.getName()); // prints out the name of the dog by using getter method from the instance of the dog class
		master.feed(dog1); // calls feed method from master class which prints out what the dog can eat
	}
	
	// feed method
	public void feed(Pet pet) {
		System.out.println("feed: " + pet.food()); // prints out what the cat can eat by calling the food() method from the instances that implement Pet interface which implies to both Dog class and Cat class without using the instanceof or typecast to call the methods
	}
}
