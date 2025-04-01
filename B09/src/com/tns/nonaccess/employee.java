package com.tns.nonaccess;

public class employee {
	private String name; 
	private int id; 
	
	public employee(String name, int id) {
			super(); 
			this.name = name; 
			this.id = id; 
			}

	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + "]";
	} 
			
}
