package com.tnsif.array_strings;

import java.util.Scanner;

@SuppressWarnings("unused")
public class StringSlicing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Take the string input
		System.out.println("Enter a  String: ");
		String text = scanner.nextLine();
		
		System.out.println("Enter a  Start index: ");
		int start = scanner.nextInt();

		System.out.println("Enter a  end index: ");
		int end = scanner.nextInt();
		
		//Validate and slice the string
		if(start >= 0 && end <= text.length() && start < end) {
			String slice = text.substring(start, end);
			System.out.println("Sliced String: " + slice);
		}else {
			System.out.println("Invalid indixes!");
		}
		
		scanner.close();

	}

}
