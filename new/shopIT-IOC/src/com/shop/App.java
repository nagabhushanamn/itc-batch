package com.shop;

import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// some-one

		// init..
		PriceMatrix priceMatrix_v1 = new PriceMatrixImpl_v1();
		PriceMatrix priceMatrix_v2 = new PriceMatrixImpl_v2();
		
		BillingImpl billComp = new BillingImpl(priceMatrix_v2);

		// Use
		String[] cart = { "345678", "765434" };
		double totalPrice = billComp.getTotalPrice(cart);

		System.out.println(totalPrice);

		// destroy
		// ..

	}

}
