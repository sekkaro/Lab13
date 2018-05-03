// package name
package edu.handong.csee.java.lab13.prob2;

// Prob2 class that acts like a main
public class Prob2 {

	// main method
	public static void main(String[] args) {
		Book book = new Book("Simple Book"); // creates a book instance with book name as parameter
		Science scienceBook = new Science("Hello Physics!","ScienceWorld"); // creates an instance of Science class by passing name and publisher as parameter
		History historyBook = new History("What Is history?","E.H.Carr"); // creates an instance of History class by passing name and publisher as parameter 

		book.writeOutput(); // calls writeOutput() method of book class to print out information about that instance
		scienceBook.writeOutput(); // calls writeOutput() method of science class to print out information about that instance
		historyBook.writeOutput(); // calls writeOutput() method of history class to print out information about that instance
	}
}
