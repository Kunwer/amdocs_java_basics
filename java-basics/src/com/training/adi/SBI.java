package com.training.adi;

public class SBI extends DomesticBank implements Bank{ // can implement mulitple interfaces but can extend a single class

	@Override
	public double getInterestRate() {
		return 6.5;
	}
	public void message() {
		System.out.println("Domestic Bank");
	}
}
