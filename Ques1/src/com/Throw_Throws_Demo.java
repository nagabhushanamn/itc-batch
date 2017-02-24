package com;

class BalanceException extends Exception {
	public BalanceException(String message) {
		super(message);
	}
}

class Bank {
	double balance = 1000.00;

	public String withdraw(double amount) throws BalanceException {
		if (amount <= this.balance) {
			return "enjoy with money";
		} else {
			throw new BalanceException("u dont have enough balance");
		}
	}

}

public class Throw_Throws_Demo {

	public static void main(String[] args) {

		Bank bank=new Bank();
		try {
			bank.withdraw(100.00);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
