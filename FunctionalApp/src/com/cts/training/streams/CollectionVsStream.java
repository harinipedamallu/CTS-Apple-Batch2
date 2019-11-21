package com.cts.training.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList();
		names.add("First");
		names.add("Second");
		names.add("Third");
		names.add("Fourth");
		
		
		// names.add(e)
		// names.remove(0)
		// names.get(4);
		
		names.forEach(System.out:: println);
		System.out.println();
		names.forEach(System.out:: println);
		System.out.println();
		// External iteration
		for(String name : names) {
			System.out.println(name);
		}
		
		
		
		Stream<String> namesStream = names.stream();
		// no updations possible
		System.out.println();
		namesStream.forEach(System.out::println);  // internal iteration
		System.out.println();
		// namesStream.forEach(System.out::println);
	}

}
