package com.beautiful.demol.spring_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	  HelloWorld obj = (HelloWorld) context.getBean("helloBean");
	  obj.printHello();
  }
}
