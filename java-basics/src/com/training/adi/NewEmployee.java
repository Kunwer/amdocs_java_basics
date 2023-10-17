package com.training.adi;

public class NewEmployee {
	private String name;
	private double netSalary;
	
	NewEmployee() {
		System.out.println("Employee class initialted");
	}
	public String getName() {
		return this.name;
	}
	public double getNetSalary() {
		return this.netSalary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
}
