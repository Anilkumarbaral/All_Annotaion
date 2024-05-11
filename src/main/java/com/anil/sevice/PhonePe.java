package com.anil.sevice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class PhonePe implements Payment{

	@Override
	
	public String doTransaction() {
		// TODO Auto-generated method stub
		System.out.println("payment done by though phonepe...");
		return "payment done by though phonepe...";
	}

}
