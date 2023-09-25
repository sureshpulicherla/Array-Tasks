package com.kn.ArrayTask;

import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//arr[] Array creation and declaration
		System.out.println("Enter the Array 1 size: ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the Array 2 size: ");
		int brr[] = new int[scan.nextInt()];
		
		// Array Initialization
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the arr array data for element "+(i+1));
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<brr.length;i++) {
			System.out.println("Enter the brr array data for element "+(i+1));
			brr[i]=scan.nextInt();
		}
		int crr[] = mergeArray(arr,brr);
		
		//  for each loop
		System.out.println("-----------Merged Array -----------");
		for(int i : crr)
			System.out.print(i+" ");
		
		scan.close();
	}

	public static int[] mergeArray(int[] arr, int[] brr) {
		int crr[] = new int[arr.length+brr.length];
		for(int i=0;i<arr.length;i++) {
			 crr[i]=arr[i];
		}
		int j=0;
		for(int i=arr.length;i<crr.length;i++) {
			crr[i]=brr[j];
			j++;
		}
		
		return crr;
	}

	
}
