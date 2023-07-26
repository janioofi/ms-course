package com.jan1ooo.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jan1ooo.hrpayroll.entities.Payment;
import com.jan1ooo.hrpayroll.entities.Worker;
import com.jan1ooo.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	@Autowired
	WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
	
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
