package com.kn.ArrayTask;

import java.util.Scanner;

public class FindingEvenOddElementsUsingConstructor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array creation and declaration
		System.out.println("Enter the array size : ");
		int arr[]= new int[scan.nextInt()];
		
		// Array initialization
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the data for Array element "+(i+1));
			arr[i]=scan.nextInt();
			
		}
		FindingEvenOdd evenOdd = new FindingEvenOdd();
		evenOdd.findingEvenOddElement(arr);
		evenOdd.countingEvenOdd(arr);
		scan.close();
	}

}
