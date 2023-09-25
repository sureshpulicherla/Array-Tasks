package com.kn.ArrayTask;

public class FindingElement {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,55,664};
		int element = 55;
		
		findingElementInArray(arr,element);		
	}

	public static void findingElementInArray(int[] arr, int element) {
		boolean isFound = false;
		int position = -1;
		int low=0,high=arr.length-1;
		while(low<=high) {
		int mid = (low+high)/2;
			if(element== arr[mid]) {
				isFound = true;
				position = mid+1;
				break;
			}else if(element > arr[mid]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
	}
		if(isFound==false) {
			System.out.println("Element Not Found");
		}else {
			System.out.println("Element found in the position of "+position);
		}
		
	}

}
