package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CustomListApplictation {

	public static void main(String[] args) {
		// CustomList<Integer> customs = new CustomArrayList<Integer>();

		CustomList<String> myCustomList = new CustomArrayList<>();

		for (int j = 0; j < 20; j++) {
			myCustomList.add("element " + j); // and continue to add another 10, 20 or 40 more elements
		}
		
		// then you should validate that all the elements you've inserted actually exist
		// in your data structure
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
	}
}
