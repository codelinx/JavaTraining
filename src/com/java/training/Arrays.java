// First git exchange
//change
package com.java.training;

public class Arrays {
	private int[] noramalArray= new int[50];
	private int rand=(int)((Math.random()*10)+10);
	private int arraySize=rand;
	public void Main(){
		System.out.println("Main start ...");
		CreateArrays();
		PrintArray();
	}	
	public void CreateArrays(){
		System.out.println("Output Random Number:" + rand);
		for(int i=0; i < arraySize; i++){
			int localRand = (int)((Math.random()*45));
			noramalArray[i]= localRand;
			System.out.println(noramalArray[i]);}
	}	
	public void PrintArray(){
		System.out.println("|-------|-------|");		
		System.out.println("| Index | Value |");
		for(int i=0; i < arraySize; i++){
			if(i < 10){
			System.out.println("|  "+ i +"    |   "+ noramalArray[i] +"  |");
			}
		else{
				System.out.println("|  "+ i +"   |  "+ noramalArray[i] +"  |");}
			}
			System.out.println("|-------|-------|");
	}	
}
