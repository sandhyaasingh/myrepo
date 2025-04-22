package com.tnsif.generics;

class Box<T>{
	private T value;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
}

public class GenericsClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> intBox = new Box<>();
		intBox.setValue(100);
		System.out.println("Integer Value" + intBox.getValue());
		
		Box<String> strBox = new Box<>();
		strBox.setValue("Hello Generics!");
		System.out.println("Integer Value" + strBox.getValue());
	}

}
