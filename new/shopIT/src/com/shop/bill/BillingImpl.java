package com.shop.bill;

import com.shop.pm.PriceMatrixImpl_v1;

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
 *         --------------------------------------
 *         
 *         
 *         
 *         
 *         
 */

public class BillingImpl {

	private PriceMatrixImpl_v1 priceMatrix = null;

	public double getTotalPrice(String[] cart) {

		double total = 0.0;
		priceMatrix = new PriceMatrixImpl_v1();

		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}

		return total;

	}

}