package com.training.practice;

public class CheckingAccount implements Account{
	private double amount;
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("Checking Account Amount after adding Interest Rate: ");
		this.amount = ((this.amount*4)/100)+this.amount;
		return this.amount;
	}

}
