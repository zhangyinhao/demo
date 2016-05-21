package com.beautiful.demol.spring_xml;

public class HelloWorld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 4 : Hello ! " + name);
	}
}
