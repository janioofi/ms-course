package com.jan1ooo.hrworker.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_worker")
public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_worker;
	private String name;
	@Column(name = "daily_income")
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
