package com.Demo.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {

		List<String> FamilyMembers = new LinkedList<>();

		List<String> parentNames = new LinkedList<>();

		// add() method
		parentNames.add("Namdeo Shinde");
		parentNames.add("ShantaBai Shinde");
		parentNames.add("Ganesh Shinde");
		parentNames.add("Gangaram Shinde");
		parentNames.add("Sunanda Shinde");
		parentNames.add("Anjali Shinde");

		// iterating over a LinkedList of parentNames
		// java8 way
		System.out.println("LinkedList of parentNames using java8 way: ");
		parentNames.forEach(System.out::println);

		// forEach loop
		/*
		 * System.out.println("LinkedList of parentNames using foreach loop: "); for
		 * (String s : parentNames) System.out.println(s); // Iterator way
		 * System.out.println("LinkedList of parentNames using Iterator Cursor: ");
		 * Iterator<String> parentNamesIterator = parentNames.iterator(); while
		 * (parentNamesIterator.hasNext()) {
		 * System.out.println(parentNamesIterator.next()); }
		 * 
		 * // ListIterator way System.out.
		 * println("LinkedList of parentNames using ListIterator Cursor in forward order: "
		 * ); ListIterator<String> listParentNamesIterator = parentNames.listIterator();
		 * while (listParentNamesIterator.hasNext()) {
		 * System.out.println(listParentNamesIterator.next()); } // ListIterator way
		 * System.out.
		 * println("LinkedList of parentNames using ListIterator Cursor in reverse order: "
		 * ); while (listParentNamesIterator.hasPrevious()) {
		 * System.out.println(listParentNamesIterator.previous()); }
		 */

		List<String> childNames = new LinkedList<>();

		childNames.add("Gauri Shinde");
		childNames.add("Akashay Shinde");
		childNames.add("Gaurav Shinde");
		childNames.add("Divya Shinde");
		childNames.add("Pranav Shinde");
		
		List<String> childNames1 = new LinkedList<>();

		childNames1.add("Gauri Shinde");
		childNames1.add("Akashay Shinde");
		childNames1.add("Gaurav Shinde");
		childNames1.add("Divya Shinde");
		childNames1.add("Pranav Shinde");
		
		System.out.println("LinkedList of childNames using java8 way: ");
		childNames.forEach(System.out::println);

		System.out.println("LinkedList of FamilyMembers using java8 way: ");
		FamilyMembers.addAll(parentNames);
		FamilyMembers.forEach(System.out::println);
		FamilyMembers.addAll(childNames);
		FamilyMembers.forEach(System.out::println);

		// contains() method

		System.out.println("FamilyMembers LinkedList Contains Ganesh ?" + FamilyMembers.contains("Ganesh Shinde"));
		System.out.println("FamilyMembers LinkedList Contains parentName ?" + FamilyMembers.containsAll(parentNames));

		// size() method
		System.out.println("The total family members are: " + FamilyMembers.size());
		
		//isEmpty() method
		System.out.println("Is FamilyMember List empty ?:"+FamilyMembers.isEmpty());
		
		//hashCode() method
		System.out.println("The HashCode for Family Member is: "+FamilyMembers.hashCode());
		
		//equals() method
		System.out.println("The 2 object of Family Member are equal or not: "+childNames.equals(childNames1));
		
		//remove() method
		System.out.println("After removing Namedeo Shinde from Family: "+FamilyMembers.remove("Namdeo Shinde"));
	}
}
