package com.java.training;

import java.util.Scanner;

public class Arrays {
	private int[] noramalArray = new int[50];
	private int rand = (int) ((Math.random() * 10) + 10);
	private int arraySize = rand;

	public void Main() {
		System.out.println("Main start ...");
		CreateArrays();
		GetValue();
	}

	public void PrintArray() {
		System.out.println("|-------|-------|");
		System.out.println("| Index | Value |");
		for (int i = 0; i < arraySize; i++) {
			if (i < 10) {
				if (noramalArray[i] < 10) {
					System.out.println("|  " + i + "    |   " + noramalArray[i]
							+ "   |");
				} else {
					System.out.println("|  " + i + "    |   " + noramalArray[i]
							+ "  |");
				}
			} else {
				if (noramalArray[i] < 10) {
					System.out.println("|  " + i + "   |   " + noramalArray[i]
							+ "   |");
				} else {
					System.out.println("|  " + i + "   |   " + noramalArray[i]
							+ "  |");
				}
			}
		}
		System.out.println("|-------|-------|");
	}

	public void CreateArrays() {
		System.out.println("Output Random Number:" + rand);
		for (int i = 0; i < arraySize; i++) {
			int localRand = (int) ((Math.random() * 45));
			// System.out.println("Output Local Random Number:" + localRand);
			noramalArray[i] = localRand;
			// System.out.println(noramalArray[i]);
		}
		// PrintArray();
	}

	public int SearchValueAtIndex(int searchIndex) {
		if (searchIndex < arraySize) {
			return noramalArray[searchIndex];
		}
		return 0;
	}

	public int GetValue() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String checkDecision = null;
		boolean isFalse = true;
		System.out.println("What Value Would you like to search? ");
		int value = input.nextInt();
		if (value <= arraySize && isFalse) {
			System.out.println("Is '" + value + "' the value you want to search? ");
			checkDecision = input.next();
			System.out.println(checkDecision);
			System.out.println("First If");
			if ((checkDecision.equals("yes")) || (checkDecision.equals("y"))) {
				System.out.println("If");
				return value;
			} else if ((checkDecision.equals("no")) || (checkDecision.equals("n"))) {
				System.out.println("What Value Would you like to search? ");
				System.out.println("Else");
				value = input.nextInt();
			}
		}else if(value > arraySize) {
			System.out.println("What Value Would you like to search? ");
			value = input.nextInt();
			System.out.println("Is '" + value + "' the value you want to search? ");
			checkDecision = input.next();
		}
		return 0;
	}

	public void SearchArrays(int searchValue) {
		for (int i = 0; i < arraySize; i++) {

		}
	}

}
