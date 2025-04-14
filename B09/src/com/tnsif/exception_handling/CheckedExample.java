package com.tnsif.exception_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExample {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("date.txt");
		BufferedReader fileInput = new BufferedReader(file);
		System.out.println(fileInput.readLine());
		fileInput.close();

	}

}
