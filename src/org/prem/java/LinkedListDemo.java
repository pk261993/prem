package org.prem.java;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("Usa");
		countries.add("China");
		countries.add("Russia");
		countries.add("Canada");
		countries.add("Brazil");
		// LinkedListDemo app=new LinkedListDemo();
		// app.printList(countries);
		new LinkedListDemo().printList(countries);
		countries.add(3, "Mynmar");
		new LinkedListDemo().printList(countries);
		countries.remove(2);
		new LinkedListDemo().printList(countries);
	}

	void printList(LinkedList<String> list) {
		for (String element : list) {
			System.out.println("Element :" + element);

		}
		System.out.println("############");
	}

}
