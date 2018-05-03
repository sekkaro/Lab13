// package name
package edu.handong.csee.java.lab13.prob2;

// History class which is a subclass of Book class 
public class History extends Book {
	private String author; // author variable that stores the author name of the history book
	
	// empty constructor
	public History(){
		super(); // calls the empty constructor of its superclass: Book
	}
	
	// constructor with parameters name and author of the book
	public History(String name, String author) {
		super(name); // calls the constructor of its superclass : Book by passing the name as parameter
		this.author = author; // sets the value of the author variable to what the user has passed
	}
	
	// overridden method writeOutput() from its superclass 
	@Override
	public void writeOutput() {
		System.out.println("<<<History>>>"); // prints out message "<<<History>>>" to show that this is the output from history class
		System.out.println(super.info()); // calls the info method from its superclass: Book that increments the Book ID and shows the name
		System.out.println("\tAuthor: " + author); // prints out message to show value of author of History class
	}
}
