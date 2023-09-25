package com.kn.ArrayTask;

import java.util.Scanner;

public class SumOfArrayElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array creation and declaration
		System.out.println("Enter the size of Array : ");
		int arr[]= new int[ scan.nextInt()];
				
		//array initialization
				
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter array elements data for"+(i+1));
			arr[i]=scan.nextInt();
		}
		
		// Method cAll
		System.out.print("Sum of array is : "+sumOfArrayElements(arr));	
		scan.close();
	}

	//Method to calculate sum of elements
	public static int sumOfArrayElements(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

}
