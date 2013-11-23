package com.demo.ws;

import javax.jws.WebService;

//Service Implementation Bean

@WebService(endpointInterface = "com.demo.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	public String getHelloWorldAsString() {
		return "Hello World JAX-WS";
	}
}
