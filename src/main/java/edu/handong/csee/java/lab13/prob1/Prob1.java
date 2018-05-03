// package name
package edu.handong.csee.java.lab13.prob1;

// class name Prob1 that acts like a main
public class Prob1 {
	// main method
	public static void main(String[] args) {
		Friend friend1 = new Friend(); // creates an instance of Friend class called friend1
		SchoolFriend friend2 = new SchoolFriend(); // creates an instance of SchoolFriend class called friend2
		ClassFriend friend3 = new ClassFriend(); // creates an instance of ClassFriend class called friend3

		InstanceOf.WhatFriend(friend1); // calls WhatFriend static method from instanceOf class by sending friend1 as parameter
		InstanceOf.WhatFriend(friend2); // calls WhatFriend static method from instanceOf class by sending friend2 as parameter
		InstanceOf.WhatFriend(friend3); // calls WhatFriend static method from instanceOf class by sending friend3 as parameter
	}

}
