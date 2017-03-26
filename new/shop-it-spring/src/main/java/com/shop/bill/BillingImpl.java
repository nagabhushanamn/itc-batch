package com.shop.bill;

import com.shop.pm.PriceMatrix;


public class BillingImpl {

	private PriceMatrix priceMatrix = null;

	// DI
	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	public double getTotalPrice(String[] cart) {

		double total = 0.0;

		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}

		return total;

	}

}
