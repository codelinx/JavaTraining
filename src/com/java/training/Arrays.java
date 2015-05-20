package com.java.training;

import java.util.Scanner;

public class Arrays {
	private static int[] normalArray = new int[10];
	private static int rand = (int) ((Math.random()*10));
	private static int arraySize = rand;

	public static void Main() {
		System.out.println("Main start ...");
		CreateArrays();
		GetValue();
		PrintArray();
	}

	public static void PrintArray() {
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

	public static void CreateArrays() {
		System.out.println("Output Random Number:" + rand);
		for (int i = 0; i < arraySize; i++) {
			int localRand = (int) ((Math.random() * 10));
			// System.out.println("Output Local Random Number:" + localRand);
			normalArray[i] = localRand;
			// System.out.println(noramalArray[i]);
		}
		// PrintArray();
	}

	public static int SearchValueAtIndex(int searchIndex) {
		if (searchIndex < arraySize) {
			System.out.println("The value in index ["+ searchIndex +"] is: " + normalArray[searchIndex]);
//			return normalArray[searchIndex];
			return 1;
		}
		return 0;
	}

	public static int GetValue() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
//		String checkDecision = null;
//		boolean isFalse = true;
		System.out.println("What index Would you like to search? ");
		int value = input.nextInt();
		SearchValueAtIndex(value);
		SearchValueInArray(value);
		BubbleSortArray(value);
		
//		if (value <= arraySize && isFalse) {
//			System.out.println("Is '" + value
//					+ "' the value you want to search? ");
//			checkDecision = input.next();
//			System.out.println(checkDecision);
//			System.out.println("First If");
//			if ((checkDecision.equals("yes")) || (checkDecision.equals("y"))) {
//				System.out.println("If");
//				return value;
//			} else if ((checkDecision.equals("no"))
//					|| (checkDecision.equals("n"))) {
//				System.out.println("What Value Would you like to search? ");
//				System.out.println("Else");
//				value = input.nextInt();
//			}
//		} else if (value > arraySize) {
//			System.out.println("Value " + value + " > Array Size " + arraySize);
//			do {
//				System.out.println("What Value Would you like to search? ");
//				value = input.nextInt();
//				System.out.println("Is '" + value
//						+ "' the value you want to search? ");
//				checkDecision = input.next();
//				if(value < arraySize){
//					System.out.println("While check.");
//						isFalse = false;}
//			}while (isFalse);
//		}
		return 0;
	}

	public static void SearchValueInArray(int searchValue) {
		for (int i = 0; i < arraySize; i++) {			
			if (searchValue == normalArray[i]){
				System.out.print("Binary search " + normalArray[i]+". ");
				System.out.println("The value in index [" + searchValue
						+ "] is: " + normalArray[searchValue]);
			}else{
				System.out.println("The value '" + searchValue+"' is not in the array.");
			}
		}
	}
	
	public static int[] BubbleSortArray(int searchValue){
		int passedValue = 0;
		for (int i = 0; i < arraySize; i++) {			
			if (normalArray[i] < normalArray[i+1]){
				passedValue = normalArray[i];
			}else{
				System.out.println("The value '" + searchValue+"' is not in the array.");
			}
		}
		PrintArray();
		return normalArray;
	}

}
