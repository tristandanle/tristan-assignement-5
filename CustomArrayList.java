package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	private static final int MIN_CAPACITY = 10;
	Object[] items = new Object[MIN_CAPACITY];

	private boolean added = true; // true if an element is added successfully 
	private int i = 0; // size of array is increased when adding item

	@Override
	public boolean add(T item) {
	
		items[i++] = item;
		if (i == items.length) {
			Object[] copyArray = items;
			items = Arrays.copyOf(copyArray,copyArray.length + 20);
			for (int c = 0; c < copyArray.length; c++) {
				items[c] = copyArray[c];
			};
			added = true;
		}else {
		 added = false;
		}
       return added;
	}

	@Override
	public int getSize() {
		return i;
	}

	@Override
	public T get(int index) {
		return (T) items[index];

	}

}
