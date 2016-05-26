package com.beautiful.demol.spring_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OutputHelper {
	@Autowired(required = true)
	@Qualifier(value="csvOutputGenerator")
	IOutputGenerator outputGenerator;

	public void generateOutput() {
		outputGenerator.generateOutput();
	}
}
