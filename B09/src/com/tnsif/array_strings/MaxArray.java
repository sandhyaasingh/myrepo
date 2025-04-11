package com.tnsif.array_strings;

//Find the largest element in an array
//Input: [10, 20, 5, 30, 15]
//Output: 30

public class MaxArray {

	public static void main(String[] args) {
		int[] arr = {10, 20, 5, 30, 15};
		int max = arr[1]; //assume the 1 st element is a max
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i]; // update the max
			}
		}
		System.out.println("Max value is:" + max);

	}

}
