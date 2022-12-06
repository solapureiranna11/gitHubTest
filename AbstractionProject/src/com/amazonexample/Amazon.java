package com.amazonexample;

public class Amazon {
    public static void main(String[] args) {
		TransactionI t = new TransactionImpl();
		t.withdrawAmt(10000);
		t.balanceCheck();
		//t.display(); compile time error ( becoz this method belongs to TransactionImpl)
		
	}
}
