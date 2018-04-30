package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {
	private String publisher;

	public Science() {
		super();
	}
	
	public Science(String name, String publisher) {
		super(name);
		this.publisher = publisher;
	}
	
	@Override
	public void writeOutput() {
		System.out.println("<<<Science>>>");
		System.out.println(super.info());
		System.out.println("\tPublisher: " + publisher);
	}
}
