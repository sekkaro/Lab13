package edu.handong.csee.java.lab13.prob2;

public class Prob2 {
	
	public static void main(String[] args) {
		Book book = new Book("Simple Book");
		Science scienceBook = new Science("Hello Physics!","ScienceWorld");
		History historyBook = new History("What Is history?","E.H.Carr");
		
		book.writeOutput();
		scienceBook.writeOutput();
		historyBook.writeOutput();
	}
}
