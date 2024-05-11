package com.anil.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anil.sevice.Payment;

import jakarta.annotation.Resource;

@RestController
//@PropertySource(value = {"application.properties"})
public class PyametRestController {
	
	@Autowired
	//@Qualifier("paytm")
//	@Resource(name= "${name}")
	private Payment paytm;
	
	@GetMapping("/payment")
	public String doPayment() {
		String status = paytm.doTransaction();
		return status;
	}

}
