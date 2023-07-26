package com.jan1ooo.hrpayroll.entities;

import java.io.Serializable;

public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id_worker;
	private String name;
	private Double dailyIncome;
	
	public Worker() {
	}

	public Worker(Long id_worker, String name, Double dailyIncome) {
		super();
		this.id_worker = id_worker;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	
	public Long getId_worker() {
		return id_worker;
	}
	

	public void setId_worker(Long id_worker) {
		this.id_worker = id_worker;
	}

	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	
	public Double getDailyIncome() {
		return dailyIncome;
	}

	
	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
}
