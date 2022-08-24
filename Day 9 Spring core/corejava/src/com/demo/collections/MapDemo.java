package com.demo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer, String>();
		
		m.put(1,"tom");
		m.put(2,"ram");
		m.put(3,"sham");
		
		
		for(Entry<Integer,String> maplist:m.entrySet()){
			
			System.out.println(maplist.getValue());
			System.out.println(maplist.getKey());
		}

	}

}
