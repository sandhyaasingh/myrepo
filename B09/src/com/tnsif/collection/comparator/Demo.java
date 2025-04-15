package com.tnsif.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student>ar=new ArrayList<Student>();
		ar.add(new Student(12,"abc","bang"));
		ar.add(new Student(6,"type","mysore"));
		ar.add(new Student(1,"mno","ranchi"));
		System.out.println("-----------");
		Collections.sort(ar,new SortRoll());
		for (int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		

	}

}
