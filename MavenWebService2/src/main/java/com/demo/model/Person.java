package com.demo.model;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement
public class Person {

	private String name;
	
	@XmlElement(name="NEW_name")
	public String getName() {
		return name;
	}
	
	@WebResult(name="NEW_output")
	public void setName(@WebParam(name="New_input") String name) {
		this.name = name;
	}
	
}
