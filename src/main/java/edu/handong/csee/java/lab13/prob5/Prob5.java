// package name
package edu.handong.csee.java.lab13.prob5;

// imports the Scanner class to get user inputs
import java.util.Scanner;

// Prob5 class
public class Prob5 {

	// main method
	public static void main(String[] args) {
		int[][] list1,list2; // declares two lists that are two dimensioned
		int list1row, list1column, list2row, list2column,i=0,j=0; // declares necessary rows and column values for each of the two list created and i,j used in for loops
		String line; // line variable declared in String type 
		String[] stringArray1,stringArray2; // two String arrays declared

		Scanner input = new Scanner(System.in); // creates Scanner instance

		System.out.print("Enter row size(maximum 5): "); // guides the user to enter the row size of the 1st list
		list1row = input.nextInt(); // reads the row size and stores it
		System.out.print("Enter column size(maximum 5): "); // guides the user to enter the column size of the 1st list
		list1column = input.nextInt(); // reads the column size and stores it
		System.out.print("Enter row size(maximum 5): "); // guides the user to enter the row size of the 2nd list
		list2row = input.nextInt(); // reads the row size and stores it
		System.out.print("Enter column size(maximum 5): "); // guides the user to enter the column size of the 2nd list
		list2column = input.nextInt(); // reads the column size and stores it

		list1 = new int[list1row][list1column]; // makes 1st list using the rows and columns given by the user
		list2 = new int[list2row][list2column]; // makes 2nd list using the rows and columns given by the user

		System.out.print("Enter list1: "); // guides the user to enter the list of values of list1
		input.nextLine(); // since the enter key pressed by the user in the end can be read as a input when we use nextLine(), we declare it once without assigning any value in order to read it as a line first to not cause errors
		line = input.nextLine(); // reads the user input in a String variable
		stringArray1 =  line.split(" "); // splits the string that has values separated by spaces and adds it to the element of each string array

		System.out.print("Enter list2: "); // guides the user to enter the list of values of list1
		line = input.nextLine(); // reads the user input in a String variable
		stringArray2 =  line.split(" "); // splits the string that has values separated by spaces and adds it to the element of each string array

		// for-each statement where each element of string array is stored into a string variable called element
		for(String element : stringArray1) {
			list1[i][j] = Integer.parseInt(element); // stores each value of element into a 2D list index in sequential order 
			System.out.print(list1[i][j]); // prints out each index of a list

			// if j reaches the limit of column value,
			if(j==list1column-1) {
				j = 0; // then reset j value while,
				i++; // incrementing the value of i to go to the next row
				System.out.println(); // goes to the next line to print the next index values
			}
			// if j did not reach the limit yet then,
			else {
				j++; // increment j
			}
		}

		i = 0; // sets the value of i to 0 for the getting the value of second list
		System.out.println(); // goes to next line so that it looks neat showing it is the next list

		// for-each statement where each element of string array is stored into a string variable called element
		for(String element : stringArray2) {
			list2[i][j] = Integer.parseInt(element); // stores each value of element into a 2D list index in sequential order 
			System.out.print(list2[i][j]); // prints out each index of a list

			// if j reaches the limit of column value,
			if(j==list2column-1) {
				j = 0; // then reset j value while,
				i++; // incrementing the value of i to go to the next row
				System.out.println(); // goes to the next line to print the next index values
			}
			// if j did not reach the limit yet then,
			else {
				j++; // increment j
			}
		}

		// if list1 and list is not equal which is decided by equals static method,
		if(!equals(list1,list2)) {
			System.out.println("The two arrays are not identical"); // then print the following message showing it is not identical
		}
		else {
			System.out.println("The two arrays are approximately identical"); // otherwise print that they are identical
		}



	}

	// equals static method
	public static boolean equals(int[][] list1, int[][] list2) {
		int wrongValues=0; // checks the number of wrong values detected while comparing the two lists

		// if the length of the two lists is different,
		if(list1.length!=list2.length) {
			return false; // immediately return that it is false/not identical
		}

		// for loop
		for(int i = 0 ; i < list1.length ; i++){
			// for loop
			for(int j = 0 ; j < list1[i].length ; j++) {

				// for any of the values of the matching index is wrong,
				if(list1[i][j] != list2[i][j]) {
					wrongValues++; // increment how many times it has gotten it wrong
				}

				// if the number of wrong values between two lists has exceeded 3,
				if(wrongValues > 3) {
					return false; // immediately return false/not identical
				}
			}
		}

		return true; // if it has passed the whole for loop test, return that it is true/identical
	}

}
