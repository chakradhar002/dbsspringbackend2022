package com.demo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/*Set Methods
Add Method
Remove Method
Is Empty Method
Size Method
Iterating Over A Set
Searching In A Set
 * 
 */
public class SetDemo {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();
		s.add("Ram");
		s.add("tom");
		s.add("sham");
		s.add("sham");

		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		

		}
		System.out.println(s.size());
	}

}
