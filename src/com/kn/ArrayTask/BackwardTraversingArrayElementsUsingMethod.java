package com.kn.ArrayTask;

import java.util.Scanner;

public class BackwardTraversingArrayElementsUsingMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array creation and declaration
		System.out.println("Enter the size of Array : ");
		int arr[]= new int[ scan.nextInt()];
		
		//array initialization
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter array elements data for"+(i+1));
			arr[i]=scan.nextInt();
		}
		
		// method assign to crr[]
		int brr[] = backWardTraversingArray(arr);
		// Array traversing
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(brr[i]+" ");
		}
		scan.close();
	}
		// Method Creation
	public static int[] backWardTraversingArray(int[] arr) {
		//Array traversing1
		for(int i=0;i>arr.length;i++) {
		}
		return arr;
}
}

