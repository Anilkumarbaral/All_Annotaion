package com.anil.sevice;

import org.springframework.stereotype.Service;

@Service

public class Paytm  implements Payment{

	@Override
	public String doTransaction() {
		// TODO Auto-generated method stub
		System.out.println("payment transaction done by through paytm...");
		return "payment transaction done by through paytm...";
	}

}
