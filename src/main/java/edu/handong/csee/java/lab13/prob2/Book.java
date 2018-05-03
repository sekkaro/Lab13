// package name
package edu.handong.csee.java.lab13.prob2;

// Book class
public class Book {
	private static int count=0; // count variable defined as 'static' so that it counts how many books it has made for every instance of Book 
	private String name; // name variable that stores name of the book
	
	// empty constructor
	public Book(){
		this.name= ""; // sets default value of name as just an empty string since the user has not specified the name
	}
	
	// constructor with name of the book passed as parameter
	public Book(String name){
		this.name = name; // sets the value of name of the book of the instance by using "this"
	}
	
	// info method that returns the id(count variable) of the book and the name
	public String info() {
		count++; // when info() is called, increases the value of count to give a new value for book's ID
		return "\tId: " + count +"\n\tBook Name: " + name; // returns string that shows the value of book ID and name.
	}

	// writeOutput method that shows the possible outputs of the Book class basically its information
	public void writeOutput() {
		System.out.println("<<<BOOK>>>"); // prints the message "<<<BOOK>>>"
		System.out.println(info()); // calls info method and prints out the returned information of the book  
	}
}
