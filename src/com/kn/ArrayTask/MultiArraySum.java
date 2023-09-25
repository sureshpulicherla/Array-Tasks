package com.kn.ArrayTask;

import java.util.*;

public class MultiArraySum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the arr array row size : ");
		int rowSize = scan.nextInt();
		System.out.println("Enter the arr array column size :");
		int columnSize = scan.nextInt();
		int arr[][] = new int[rowSize][columnSize];
			// ------ BRR array initialization
		int brr[][] = new int[rowSize][columnSize];
			// ----- ARR declaration
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter the arr array row "+(i+1)+" values : ");
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j] = scan.nextInt();
					}
				}
			// ---------- BRR declaration

			for(int i=0;i<brr.length;i++) {
				System.out.println("Enter the brr array row "+(i+1)+" values : ");
				for(int j=0;j<brr[i].length;j++) {
					brr[i][j] = scan.nextInt();
				}
			}
			// method call 
			arrayAddition(arr,brr);
			scan.close();	
	}
	
	static void arrayAddition(int arr[][],int brr[][]) {
			
			//  ********** ARR array *********** 
		System.out.println("******* Array 1 ********");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			 // ******** BRR Array *********
			System.out.println("******* Array 2 ********");
			for(int i=0;i<brr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(brr[i][j]+" ");
				}
				System.out.println();
			}
			
			// ------CRR creation and declaration
			System.out.println("********* SUM ARRAY ********** ");
			int crr[][] = new int[arr.length][arr.length];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					crr[i][j] = arr[i][j]+brr[i][j];
					System.out.print(crr[i][j]+" ");
				}System.out.println();
			}
			
		}

}
