package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {
	public static void WhatFriend(Friend friend) {
		if(friend instanceof ClassFriend) {
			((ClassFriend) friend).classFriend();
		}
		
		else if(friend instanceof SchoolFriend) {
			((SchoolFriend) friend).schoolFriend();
		}
		
		else {
			friend.friend();
		}
	}
}
