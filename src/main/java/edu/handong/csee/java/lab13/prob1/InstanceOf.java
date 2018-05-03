// package name
package edu.handong.csee.java.lab13.prob1;

// class name InstanceOf
public class InstanceOf {
	// WhatFriend method that is defined 'static' so that it is shared by all instances that calls this method
	public static void WhatFriend(Friend friend) {
		// checks if the parameter received is an instance of ClassFriend class
		if(friend instanceof ClassFriend) {
			((ClassFriend) friend).classFriend(); // calls the classFriend method of ClassFriend class
			// uses type casting since classFriend method cannot be called from friend object 
		}
		// checks if the parameter received is an instance of SchoolFriend class
		else if(friend instanceof SchoolFriend) {
			((SchoolFriend) friend).schoolFriend(); // calls the SchoolFriend method of SchoolFriend class
		}
		// checks if the parameter is an instance of Friend class
		else {
			friend.friend(); // calls friend method of Friend class
		}
	}
}
