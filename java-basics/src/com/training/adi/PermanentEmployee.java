package com.training.adi;

public class PermanentEmployee extends NewEmployee{
	private double pfPercentage;
	private double pfAmount;
	
	PermanentEmployee(){
		System.out.println("Permanent Employee class initialted");
	}
	public double getPfAmount() {
		this.pfPercentage=12;
		this.pfAmount=(super.getNetSalary()*pfPercentage)/100;
		return this.pfAmount;
	}
}
