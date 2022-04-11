package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CustomListApplictation {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();

		for (int j = 0; j < 20; j++) {
			myCustomList.add("element " + j);
		}

		myCustomList.add("element 1000");
		myCustomList.add("element 2000");

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
	}
}
