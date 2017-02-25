package com;

import java.util.ArrayList;
import java.util.List;

import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {
	
	public static void main(String[] args) {
		
		List<String> cart=new ArrayList<String>();
		cart.add("123");
		cart.add("786");
		
		BillingImpl billComp=new BillingImpl();
		billComp.setPriceMatrix(new PriceMatrixImpl_v2());
		double totalPrice=billComp.getTotalPrice(cart);
		
		System.out.println("total: "+totalPrice);
		
	}

}
