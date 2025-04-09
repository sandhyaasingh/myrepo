package com.tnsif.nonaccess;

public class Myclass {
	private int section; //instance variable
	private static int srNo; //static var
	
	static {
		System.out.println("Static block");
		srNo=1000;
		
	}
	
	Myclass() {
		System.out.println("default constructor");
		srNo++;
		section++;
		
	}
	void hello() {
		srNo++;
		section++;
		
	}
	static void display() {
		System.out.println("Static method");
		srNo++;
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}

	
}
