package com.java.training;

import java.util.Scanner;

public class Arrays {
	private static int[] normalArray = new int[10];
	private static int rand = (int) ((Math.random() * 10));
	private static int arraySize = rand;

	public void Main() {
		System.out.println("Main start ...");
		createArrays();
		getValue();
		printArray();
		bubbleSort2For();
		// bubbleSortWhile();
	}

	private static void printArray() {
		System.out.println("|-------|-------|");
		System.out.println("| Index | Value |");
		for (int i = 0; i < arraySize; i++) {
			if (i < 10) {
				if (normalArray[i] < 10) {
					System.out.println("|  " + i + "    |   " + normalArray[i]
							+ "   |");
				} else {
					System.out.println("|  " + i + "    |   " + normalArray[i]
							+ "  |");
				}
			} else {
				if (normalArray[i] < 10) {
					System.out.println("|  " + i + "   |   " + normalArray[i]
							+ "   |");
				} else {
					System.out.println("|  " + i + "   |   " + normalArray[i]
							+ "  |");
				}
			}
		}
		System.out.println("|-------|-------|");
	}

	private static void createArrays() {
		System.out.println("Output Random Number:" + rand);
		for (int i = 0; i < arraySize; i++) {
			int localRand = (int) ((Math.random() * 10));
			// System.out.println("Output Local Random Number:" + localRand);
			normalArray[i] = localRand;
			// System.out.println(noramalArray[i]);
		}
		// printArray();
	}

	private static int searchValueAtIndex(int searchIndex) {
		if (searchIndex < arraySize) {
			System.out.println("The value in index [" + searchIndex + "] is: "
					+ normalArray[searchIndex]);
			// return normalArray[searchIndex];
			return 1;
		}
		return 0;
	}

	private static int getValue() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		// String checkDecision = null;
		// boolean isFalse = true;
		System.out.println("What index Would you like to search? ");
		int value = input.nextInt();
		searchValueAtIndex(value);
		searchValueInArray(value);
		// BubbleSortArray(value);

		// if (value <= arraySize && isFalse) {
		// System.out.println("Is '" + value
		// + "' the value you want to search? ");
		// checkDecision = input.next();
		// System.out.println(checkDecision);
		// System.out.println("First If");
		// if ((checkDecision.equals("yes")) || (checkDecision.equals("y"))) {
		// System.out.println("If");
		// return value;
		// } else if ((checkDecision.equals("no"))
		// || (checkDecision.equals("n"))) {
		// System.out.println("What Value Would you like to search? ");
		// System.out.println("Else");
		// value = input.nextInt();
		// }
		// } else if (value > arraySize) {
		// System.out.println("Value " + value + " > Array Size " + arraySize);
		// do {
		// System.out.println("What Value Would you like to search? ");
		// value = input.nextInt();
		// System.out.println("Is '" + value
		// + "' the value you want to search? ");
		// checkDecision = input.next();
		// if(value < arraySize){
		// System.out.println("While check.");
		// isFalse = false;}
		// }while (isFalse);
		// }
		return 0;
	}

	private static void searchValueInArray(int searchValue) {
		for (int i = 0; i < arraySize; i++) {
			if (searchValue == normalArray[i]) {
				System.out.print("Binary search " + normalArray[i] + ". ");
				System.out.println("The value in index [" + searchValue
						+ "] is: " + normalArray[searchValue]);
			} else {
				System.out.println("The value '" + searchValue
						+ "' is not in the array.");
			}
		}
	}

	// private static int[] BubbleSortArray(int searchValue){
	// int passedValue = 0;
	// for (int i = 0; i < arraySize; i++) {
	// if (normalArray[i] < normalArray[i+1]){
	// passedValue = normalArray[i];
	// }else{
	// System.out.println("The value '" + searchValue+"' is not in the array.");
	// }
	// }
	// printArray();
	// return normalArray;
	// }

	private static void bubbleSortWhile() {

		System.out.println("|-------|-------|");
		System.out.println("|--Bubble Sort--|");
		System.out.println("|-------|-------|");

		int temp;
		boolean isFalse = true;
		while (isFalse) {
			isFalse = false;
			for (int i = 0; i < arraySize; i++) {
				if (normalArray[i] > normalArray[i + 1]) {
					temp = normalArray[i];
					normalArray[i] = normalArray[i + 1];
					normalArray[i + 1] = temp;
					isFalse = true;
				}
			}
		}

		// boolean swapped = true;
		// int j = 0;
		// int tmp;
		// while (swapped) {
		// swapped = false;
		// j++;
		// for (int i = 0; i < normalArray.length - j; i++) {
		// if (normalArray[i] > normalArray[i + 1]) {
		// tmp = normalArray[i];
		// normalArray[i] = normalArray[i + 1];
		// normalArray[i + 1] = tmp;
		// swapped = true;
		// }
		// }
		// }

		printArray();
	}

	private static void bubbleSort2For() {

		System.out.println("|-------|-------|");
		System.out.println("|--Bubble Sort--|");
		System.out.println("|-------|-------|");
		System.out.println("|-Array Size: " + arraySize + "-|");
		System.out.println("|-------|-------|");

		int temp;
		// @SuppressWarnings("unused")
		// boolean isFalse = true;
		for (int i = 0; i < arraySize; i++) {
			// isFalse = false;
			for (int j = arraySize; arraySize > j; j--) {
				// Logic for descending order Bubble sort
				// if (normalArray[j] < normalArray[j + 1]) {
				// temp = normalArray[j];
				// normalArray[j] = normalArray[j + 1];
				// normalArray[j + 1] = temp;
				// isFalse = true;
				if (normalArray[i] < normalArray[i+1]) {
					temp = normalArray[j-1];
					normalArray[j-1] = normalArray[j];
					normalArray[j] = temp;
					printArray();
				}
			}
		}
		System.out.println("|-----Final-----|");
		printArray();
	}

}
