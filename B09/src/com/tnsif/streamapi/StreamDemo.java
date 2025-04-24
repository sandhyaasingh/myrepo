package com.tnsif.streamapi;
import java.util.*;
import java.util.stream.Collectors;
//import java.util.stream.*; can import it this way too

public class StreamDemo {

	public static void main(String[] args) {
		//asList converts array into list
		List<String> names = Arrays.asList("Hello","World","Alice","Bob","Jhanavi","Katharine","Sandhya","Aadish","Aadil");
		List<String> result = names.stream().filter(name -> name.startsWith("S"))
                							.map(String::toLowerCase)
                							.collect(Collectors.toList());
		System.out.println("Filtered Names: "+result);


	}

}