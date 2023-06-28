package com.trello.javaprograms;
import java.util.*;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList l = new ArrayList();
	       l.add("Manoj");
	       l.add("Rohith");
	       l.add("Vikas");
	       l.add("Suresh");
	       l.add("Akhil");
	       System.out.println(l);
	       l.remove(2);
	       l.set(0, "Priya");
	       System.out.println(l);  
	      
		LinkedList m = new LinkedList();
		m.add("java");
		m.add(30);
		m.add(null);
		m.add("Java");
		System.out.println(m);
		m.set(0, "software");
		System.out.println(m);
		m.removeLast();
		System.out.println(m);
		m.addFirst("AAAA");
		System.out.println(m);
	}

}
