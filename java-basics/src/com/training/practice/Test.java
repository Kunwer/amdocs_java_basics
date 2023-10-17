package com.training.practice;

public class Test {
	public static void main(String[] args) {
		Account sa = new SavingsAccount();
		Account ca = new CheckingAccount();
		sa.setAmount(10000.0);
		ca.setAmount(20000.0);
		System.out.println(sa.getInterestRate());
		System.out.println(ca.getInterestRate());
		
	}
	
}
