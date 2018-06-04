package com.primitive;

import java.math.BigDecimal; //class need to be imported to use BigDecimal

public class SimpleInterestCalculator {
	BigDecimal principal, interests;// BigDecimal is used for better accuracy of floating point

	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interests = new BigDecimal(interest);// for conversion of string to BigDecimal

	}

	public BigDecimal calculatevalue(int noOfyears) {
		// Simple Interest=principal+principal*interest*noOfyears
		BigDecimal totalsum;
		totalsum = principal.add(principal).multiply(interests).multiply(new BigDecimal(noOfyears));
		return totalsum;
	}

}
