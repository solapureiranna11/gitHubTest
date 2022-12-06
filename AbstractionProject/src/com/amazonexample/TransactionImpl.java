package com.amazonexample;

public class TransactionImpl implements TransactionI{

	@Override
	public void withdrawAmt(int amtToWithdraw) {
		System.out.println("end user imp info");
	}
	
	void display() {
		
		System.out.println(" logic");
	}

	@Override
	public void balanceCheck() {
		System.out.println("Balance check");
		
	}
	

}
