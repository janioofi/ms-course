package com.jan1oo.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.jan1oo.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("Bob", 100.20, days);
	}
}
