package com.demo.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.demo.model.Person;
 
@WebService(targetNamespace="http://example.com")
@SOAPBinding(style = Style.RPC)
public interface HelloWorld{
 
	@WebMethod(operationName="NEW_getPerson")
	@WebResult(name="NEW_person_output")
	Person getPerson(@WebParam(name="NEW_person_input") String name);
 
}