package com.tnsif.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> laps = new ArrayList<Laptop>();
		
		laps.add(new Laptop("dell", 15, 169999));
		laps.add(new Laptop("asus", 22, 17787));
		laps.add(new Laptop("apple", 2, 177878));
		
Collections.sort(laps);
for(Laptop l: laps)
{
	System.out.println(l);
}
	}

}
