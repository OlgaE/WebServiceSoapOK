package com.demo.ws;

import javax.jws.WebService;

import com.demo.model.Person;

@WebService(name="NEW_Name", 
			endpointInterface = "com.demo.ws.HelloWorld",
			serviceName="NEW_ServiceName")
public class HelloWorldImpl implements HelloWorld{

	private Person person;
	
	public Person getPerson(String name) {
		person = new Person();
		person.setName(name);
		return person;
	}
}
