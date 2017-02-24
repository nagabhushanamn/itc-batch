package com;

class Mobile {
	double balance = 0.0;
}

class MobileRecharger {

	public void recharge(Mobile mobile, double amount) {
		mobile.balance += amount;
	}

}

public class Ques1 {

	public static void main(String[] args) {

		Mobile mobile = new Mobile();
		
		MobileRecharger recharger=new MobileRecharger();
		recharger.recharge(mobile, 1000.00);
		
		
		System.out.println(mobile.balance);

	}

}
