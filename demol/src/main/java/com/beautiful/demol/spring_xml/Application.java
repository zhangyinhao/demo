package com.beautiful.demol.spring_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	  OutputHelper obj = (OutputHelper) context.getBean("outputHelper");
	  obj.generateOutput();
  }
  
  /**
   * 简单的xml示例
   */
  public static void example_1(){
	  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	  HelloWorld obj = (HelloWorld) context.getBean("helloBean");
	  obj.printHello();
  }
}
