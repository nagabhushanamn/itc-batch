package com.shop.bill;

import com.shop.pm.PriceMatrix;

/*
 *  design & performance issues
 *  ----------------------------
 *  
 *  
 *   --> tight-coupling with dependency
 *   
 *        - can't extend comp with new features
 *        
 *   --> too many dependencies are created & destructed.
 *   
 *   	   - memory, slow	
 *   
 *   --> Unit Testing not possible
 *   
 *         - bug fix difficult , dev slow
 *         
 *      -------------------------------------------------
 *      
 *         
 *         reason for these issues
 *         
 *         --> creating dependency-obj in dependent's class
 *  
 *         Soln :
 *         
 *         Don't  create dependency obj in dependent's class , do lookup
 *         
 *         Limitation on Lookup:
 *         
 *         --> location tight-coupling
 *         
 *         
 *         best soln :
 *         
 *         dont create & lookup , get/inject thru 'some-one' ( IOC )
 *         
 *         IOC ==> inversion of control
 *         
 *         how to implement IOC ?
 *         
 *           --> Dependency Injection ( DI )
 *           
 *           
 *           	 1. constructor DI  ( mandatory dependency )
 *               2. setter DI ( optional dependency )
 *         
 *         --------------------------------------
 *         
 *         
 *         
 *         
 *         
 */

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
