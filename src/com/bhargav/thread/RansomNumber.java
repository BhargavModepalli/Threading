package com.bhargav.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class RansomNumber {
	CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList<>();

	synchronized public void mul(int n) {
		for (int i = 1; i < 100; i++) {
			cowal.add(i * n);

		}

	}

	synchronized public void printAll() {
		ArrayList<Integer> temp = new ArrayList<>();
		temp.addAll(cowal);
		Collections.sort(temp);

		cowal.clear();
		cowal.addAll(temp);
		for (Iterator iterator = cowal.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}

}
