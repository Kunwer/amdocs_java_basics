package com.training.practice;

public class SavingsAccount implements Account{
	private double amount;
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public double getInterestRate() {
		System.out.println("Savings Account Amount after adding Interest Rate: ");
		this.amount = ((this.amount*4)/100)+this.amount;
		return this.amount;
	}

}
