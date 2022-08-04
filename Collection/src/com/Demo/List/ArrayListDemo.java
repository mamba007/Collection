package com.Demo.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();

		// add() method
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Starwbery");
		fruits.add("Banana");

		// printing the collection of fruits
		// java 8 way
		System.out.println("Printing List Of Fruits using java8 way");
		fruits.forEach(System.out::println);
		// for each loop
		System.out.println("Printing List Of Fruits using foreach loop:");
		for (String s : fruits)
			System.out.println(s);
		// Iterator way
		System.out.println("Printing List Of Fruits using Iterator Cursor:");
		Iterator<String> fruitsIterator = fruits.iterator();
		while (fruitsIterator.hasNext()) {
			System.out.println(fruitsIterator.next());
		}
		
		
		List<String> fruit = new ArrayList<>();
		fruit.add("Mango");
		fruit.add("Apple");
		fruit.add("Starwbery");
		fruit.add("Banana");

		System.out.println("Printing List Of Fruit using java8 way");
		fruit.forEach(System.out::println);

		fruits.addAll(fruit);
		System.out.println("Printing List Of Fruit using java8 way");
		fruits.forEach(System.out::println);
		// size() method
		System.out.println("Size of Fruits list is: " + fruits.size());

		// contains() method
		System.out.println("List of Fruits contains Banana? " + fruits.contains("Banana"));
		System.out.println("List of Fruits contains DragonFruit? " + fruits.contains("DragonFruit"));
		System.out.println("List of Fruits contains list of fruit ?" + fruits.containsAll(fruit));

		// isEmpty() method
		System.out.println("Whether List of Fruits is empty ?" + fruits.isEmpty());

		// equals() method
		System.out.println("List of Fruits and Fruit are same ?" + fruits.equals(fruit));

		// hashCode method
		System.out.println("HashCode value of List of Fruits is:" + fruits.hashCode());

		// remove() method
		System.out.println("Removing Banana from List of Fruits:" + fruits.remove("Banana"));
		// System.out.println("Removing List of Fruit from List of
		// Fruits:"+fruits.removeAll(fruit));

		// clear() method
		fruits.forEach(System.out::println);
		fruits.clear();
		System.out.println("After clearing the list, List Of Fruits will be:" + fruits);

	}
}
