package com.jan1ooo.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jan1ooo.hrpayroll.entities.Payment;
import com.jan1ooo.hrpayroll.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentResouce {

	@Autowired
	private PaymentService service;
	
	@GetMapping("/{id}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long id, @PathVariable Integer days){
		Payment payment = service.getPayment(id, days);
		return ResponseEntity.ok().body(payment);
	}
}
