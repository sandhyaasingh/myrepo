package com.tnsif.array_strings;
// Input: [1,2,3,4,5]
//Output: [5,4,3,2,1]

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5}; //creation of array
		int start = 0; //declare a variable (index 0)
		int end= arr.length -1; //(index 4)
		
		while(start < end) {
			//swap the elements from both ends
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
			
		}
		System.out.println("Reversed Array:");
		for(int num: arr) {
			System.out.println(num + " ");
		}

	}

}
