package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	final static int CAPACITY = 10;
	Object[] items = new Object[CAPACITY];
	private int cc = 0; // current capacity/size of array

	@Override
	public boolean add(T item) {
		if (items.length == cc) {
			Object[] newArray = new Object[items.length * 2];
			System.arraycopy(items, 0, newArray, 0, items.length);
			items = newArray;
		}
		items[cc++] = item;
		return true;
	}

	@Override
	public int getSize() {
		return cc;
	}

	@Override
	public T get(int index) {
		return (T) items[index];

	}

}
