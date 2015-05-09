//
package com.java.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaList {
	private List<Integer> list;
	private static final int SIZE=10;
	public Random rand = new Random();
	public int CreateList(int ListSize) {
		int localrand = rand.nextInt(100);
		list = new ArrayList<Integer>(ListSize);
		for (int i = 0; i < ListSize; i++) {
			list.add(localrand);
		}
		return localrand;
	}

	public void FileInOut() {

	}
}
