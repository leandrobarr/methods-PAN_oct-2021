package arrays;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {

		LinkedList<String> cars = new LinkedList<String>();
		//ArrayList<String> cars = new ArrayList<String>();
		cars.add("EcoSport");
		cars.add("Mercedes");
		cars.add("Fox");
		cars.add("Gol");

		System.out.println(cars.contains("Gol"));
		cars.addFirst("Palio");
		cars.addLast("Mazda");
		//cars.removeLast();
		System.out.println(cars.get(0));
		System.out.println(cars.getLast());
		cars.clear();
		// System.out.println(cars);

		LinkedList<String> list = new LinkedList<String>();
		// Use add() method to add elements in the list
		list.add("Geeks");
		list.add("for");

		// check if list contains "Geeks"
		System.out.println("Does the List contains 'Geeks' : " + list.contains("Geeks"));
	}
}
