package com.demo.collections;

import java.util.ArrayList;
import java.util.List;

/*
 *  ArrayList provides us with dynamic arrays in Java. 
 *  The size of an ArrayList is increased automatically 
 *  if the collection grows or shrinks if the objects are 
 *  removed from the collection.

Add an Element in an ArrayList
Remove an Element in an ArrayList
Update an Element in an ArrayList
Remove duplicates from an ArrayList
Reverse an ArrayList
Converting ArrayList to String
Getting a sub-list from an ArrayList
 */

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> items = new ArrayList<String>();

		items.add("apple");
		items.add("mango");
		items.add("guvava");
		
	
		
		//using enhanced for loop

		for (String fruits : items) {

			System.out.println(fruits);
		}

	}

}
