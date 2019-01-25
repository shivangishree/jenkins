package com.boeing.rest;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boeing.bean.Customer;

@RestController
public class HelloController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_XML,
			method = RequestMethod.GET,
			value = "/details")
	@ResponseBody
	public Customer details() {
		Customer cl = new Customer();
		cl.setId(101);
		cl.setName("amit");
		cl.setAddress("delhi");
		
		return cl;
	}
	
}
