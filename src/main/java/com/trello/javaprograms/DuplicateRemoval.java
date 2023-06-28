package com.trello.javaprograms;
import java.util.*;
public class DuplicateRemoval {
	public static void main(String[] args)
    {
        //Constructing An ArrayList
        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
        listWithDuplicateElements.add("Manoj");
        listWithDuplicateElements.add("Anil");
        listWithDuplicateElements.add("Rohith");
        listWithDuplicateElements.add("Anil");
        listWithDuplicateElements.add("Vikas");
        listWithDuplicateElements.add("Vikas");
        listWithDuplicateElements.add("Suresh");
 
        //Printing listWithDuplicateElements
        System.out.print("ArrayList With Duplicate Elements :");
        System.out.println(listWithDuplicateElements);
 
        //Constructing HashSet using listWithDuplicateElements
        HashSet<String> set = new HashSet<String>(listWithDuplicateElements);
 
        //Constructing listWithoutDuplicateElements using set
        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
 
        //Printing listWithoutDuplicateElements
        System.out.print("ArrayList After Removing Duplicate Elements :");
        System.out.println(listWithoutDuplicateElements);
    }
}
