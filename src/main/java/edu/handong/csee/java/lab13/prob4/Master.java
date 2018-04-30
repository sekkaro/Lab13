package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner;

public class Master {
	
	public static void main(String[] args) {
		Master master = new Master();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the cat name and dog name: ");
		
		Cat cat1 = new Cat(input.next());
		Dog dog1 = new Dog(input.next());
		
		System.out.println("Name: " + cat1.getName());
		master.feed(cat1);
		
		System.out.println("Name: " + dog1.getName());
		master.feed(dog1);
	}
	
	public void feed(Pet pet) {
		System.out.println("feed: " + pet.food());
	}
}
