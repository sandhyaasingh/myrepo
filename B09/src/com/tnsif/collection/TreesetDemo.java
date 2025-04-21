package com.tnsif.collection;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <String> t=new TreeSet<String>();
		t.add("HTML");
		t.add("java");
		t.add("HTML");
		//t.add(null);
		//equals() and hashcode() tom's hw both r object cls methods
		System.out.println("course are"+t);
	}

}
