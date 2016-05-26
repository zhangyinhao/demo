package com.beautiful.demol.spring_xml;

import org.springframework.stereotype.Component;

@Component
public class CsvOutputGenerator implements IOutputGenerator {

	@Override
	public void generateOutput() {
		
		System.out.println("This is Csv Output Generator");
	}

}
