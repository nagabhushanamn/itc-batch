package com.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// init..

		ConfigurableApplicationContext ac = null;
		ac = new ClassPathXmlApplicationContext("spring.xml");

		// Use
		BillingImpl billComp = ac.getBean("billComp2", 
				BillingImpl.class);
		String[] cart = { "345678", "765434" };
		double totalPrice = billComp.getTotalPrice(cart);

		System.out.println(totalPrice);

		// destroy
		ac.close();

	}

}
