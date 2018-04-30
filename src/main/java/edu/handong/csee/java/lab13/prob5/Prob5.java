package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		int[][] list1,list2;
		int list1row, list1column, list2row, list2column,i=0,j=0;
		String line;
		String[] stringArray1,stringArray2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter row size(maximum 5): ");
		list1row = input.nextInt();
		System.out.print("Enter column size(maximum 5): ");
		list1column = input.nextInt();
		System.out.print("Enter row size(maximum 5): ");
		list2row = input.nextInt();
		System.out.print("Enter column size(maximum 5): ");
		list2column = input.nextInt();
		
		list1 = new int[list1row][list1column];
		list2 = new int[list2row][list2column];
		
		System.out.print("Enter list1: ");
		input.nextLine();
		line = input.nextLine();
		stringArray1 =  line.split(" ");
		
		System.out.print("Enter list2: ");
		line = input.nextLine();
		stringArray2 =  line.split(" ");
		
		for(String element : stringArray1) {
			list1[i][j] = Integer.parseInt(element); 
			System.out.print(list1[i][j]);
			
			if(j==list1column-1) {
				j = 0;
				i++;
				System.out.println();
			}
			else {
				j++;
			}
		}
				
		i = 0;
		System.out.println();
		
		for(String element : stringArray2) {
			list2[i][j] = Integer.parseInt(element); 
			System.out.print(list2[i][j]);
			
			if(j==list2column-1) {
				j = 0;
				i++;
				System.out.println();
			}
			else {
				j++;
			}
		}
		
		if(!equals(list1,list2)) {
			System.out.println("The two arrays are not identical");
		}
		else {
			System.out.println("The two arrays are approximately identical");
		}
		
		
		
	}
	
	public static boolean equals(int[][] list1, int[][] list2) {
		int wrongValues=0;
		
		if(list1.length!=list2.length) {
			return false;
		}
		
		for(int i = 0 ; i < list1.length ; i++){
			for(int j = 0 ; j < list1[i].length ; j++) {
				
				if(list1[i][j] != list2[i][j]) {
					wrongValues++;
				}
				
				if(wrongValues > 3) {
					return false;
				}
			}
		}
		
		return true;
	}

}
