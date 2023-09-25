package com.kn.ArrayTask;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();		}
	
		for(int i=0;i<arr.length;i++) {
			System.out.println((arr[i] += 5));
		}
		scan.close();

}
}
