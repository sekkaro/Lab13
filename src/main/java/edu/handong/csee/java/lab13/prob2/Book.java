package edu.handong.csee.java.lab13.prob2;

public class Book {
	private static int count=0; 
	private String name;
	
	public Book(){
		this.name= "";
	}
	
	public Book(String name){
		this.name = name;
	}
	
	public String info() {
		count++;
		return "\tId: " + count +"\n\tBook Name: " + name;
	}
	
	public void writeOutput() {
		System.out.println("<<<BOOK>>>");
		System.out.println(info());
	}
}
