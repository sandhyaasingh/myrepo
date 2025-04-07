package com.tns.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list = new ArrayList<Integer>();// raw (can take any data type)
		
		System.out.println("the size of the arraylist" +list.isEmpty());
		System.out.println("the size of the arraylist"+list.size());
		list.add(2);
		list.add(99);
		list.add(99);//can add duplicate elements
		list.add(null);
		list.add(2265);
		//Collections.sort(list);
		//System.out.println(list);
		System.out.println("the size of the arraylist" +list.size());
		System.out.println(list);
		System.out.println(list.contains(55));
		list.remove(1);
		System.out.println(list);
		System.out.println("element at that position"+ list.get(0));

	}

}
