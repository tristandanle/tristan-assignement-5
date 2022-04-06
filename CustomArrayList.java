package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	private static final int MIN_CAPACITY = 10;
	Object[] items = new Object[MIN_CAPACITY];
	private boolean added = false;
	private int i = 0; // use to trace of the current size in array - increase size when an item is added
	private int current_Capacity = 0;
	private int newSize = 0;
	private int oldSize = 0;

	@Override
	public boolean add(T item) {
		++current_Capacity;
		if (getSize() >= current_Capacity) {
			items[i] = item;
			i++;

		} else if (getSize() <= current_Capacity) {
			oldSize = items.length;
			newSize = oldSize + 20; // expand the array every 20 items reached the max
			// System.out.println("array overload - over capacity");
			items = Arrays.copyOf(items, newSize);
			items[i] = item;
			i++;
		} else {
			return false;
		}
		return added;
	}

	@Override
	public int getSize() {
		// System.out.println(items.length);
		return i; // current size of array
	}

	@Override
	public T get(int index) {
		return (T) items[index];

	}

}
