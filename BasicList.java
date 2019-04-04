package Homework;

import java.util.Arrays;
import java.util.ArrayList;

public class BasicList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(10);

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		System.out.println(list);
		System.out.println("Size of the list is " + list.size());

		list.add(5, 200);

		System.out.println(list);
		System.out.println("Size of the list is " + list.size());
		System.out.println("Value of 200 is located at "  + list.indexOf(200));
	}

}
