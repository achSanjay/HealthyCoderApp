package com.healthycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BMICalculatorTest {

	@Test
	void test() {
		BMICalculator.isDietRecommended(89, 1.72);
	}

}
