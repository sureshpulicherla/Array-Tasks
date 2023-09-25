package com.kn.ArrayTask;

public class FindingEvenOdd {
	public void findingEvenOddElement(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				System.out.println("Even Number : "+arr[i]);
			else
				System.out.println("Odd Number : "+arr[i]);
		}
		
		
	}
	public void countingEvenOdd(int[]arr) {
		int evenCount=0,oddCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.println("--------------");
		
		System.out.println("Even Count : "+evenCount);
		
		System.out.println("Odd Count : "+oddCount);
		
		
	}
	
	
	
	
}
