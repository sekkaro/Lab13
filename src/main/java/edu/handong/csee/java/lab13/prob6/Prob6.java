// package name
package edu.handong.csee.java.lab13.prob6;

// Prob6 class acting like main
public class Prob6 {

	// main method
	public static void main(String[] args) {
		UpPoint data1 = new UpPoint(3,3); // creates instance of UpPoint class with x and y values 
		DownPoint data2 = new DownPoint(2,5); // creates instance of DownPoint class with x and y values
		DownPoint data3 = new DownPoint(4,7); // creates instance of DownPoint class with x and y values
		UpPoint data4 = new UpPoint(9,12); // creates instance of UpPoint class with x and y values

		Printer.print(data1); // uses print static method from Printer class by passing data1 as parameter
		Printer.print(data2); // uses print static method from Printer class by passing data2 as parameter
		Printer.print(data3); // uses print static method from Printer class by passing data3 as parameter
		Printer.print(data4); // uses print static method from Printer class by passing data4 as parameter
	}

}
