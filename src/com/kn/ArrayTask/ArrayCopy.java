package com.kn.ArrayTask;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		// declaration && creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = scan.nextInt();
		int arr[] = new int[size];
	
		// initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the array elements "+(i+1));
				arr[i]= scan.nextInt();
		}
		
		// array traversing
	
		int crr[] = copyArr(arr);
		
		for(int i=0;i<crr.length;i++) {
			System.out.print(crr[i]+" ");
		}
		scan.close();
		
	}
	// Method Creation
	public static int[] copyArr(int arr[]) {
		int brr[]= new int[arr.length];
		
		// array traversing
		for(int i=0 ;i<brr.length;i++) {
			brr[i] = arr[i]; 
		}
		return brr;			
	}

}
