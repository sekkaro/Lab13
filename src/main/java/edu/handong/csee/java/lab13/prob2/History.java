package edu.handong.csee.java.lab13.prob2;

public class History extends Book {
	private String author;
	
	public History(){
		super();
	}
	
	public History(String name, String author) {
		super(name);
		this.author = author;
	}
	
	@Override
	public void writeOutput() {
		System.out.println("<<<History>>>");
		System.out.println(super.info());
		System.out.println("\tAuthor: " + author);
	}
}
