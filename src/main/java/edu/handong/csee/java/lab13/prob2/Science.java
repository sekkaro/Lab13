// package name
package edu.handong.csee.java.lab13.prob2;

// Science class which is a subclass of Book class
public class Science extends Book {
	private String publisher; // publisher variable that stores the publisher of the Science Book

	// empty constructor
	public Science() {
		super(); // calls empty constructor of its superclass: Book
	}

	// constructor with parameters name and publisher
	public Science(String name, String publisher) {
		super(name);  // calls constructor of its superclass: Book with parameter as name of the book
		this.publisher = publisher; // sets the value of publisher that was gotten from the user
	}

	// Overridden method (same name as its superclass's method) that prints out the information of the Science class
	@Override
	public void writeOutput() {
		System.out.println("<<<Science>>>"); // prints out the message "<<<Science>>>"
		System.out.println(super.info()); // calls the info method from its superclass: Book that increments the Book ID and shows the name
		System.out.println("\tPublisher: " + publisher); // prints out message to show value of publisher of Science class
	}
}
