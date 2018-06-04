package com.primitive;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "70.0");
		BigDecimal totalsum = calculator.calculatevalue(5);
		System.out.println(totalsum);


	}

}
