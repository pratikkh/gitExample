package com.practice.gitExample;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator cal;

	@BeforeAll
	static void beforeAll () {
		System.out.println("Ran once before any other method!");
	}
	
	@BeforeEach
	void initializeCalculatorObject() {
		cal = new Calculator();
		System.out.println("BeforeEach");
	}
	
	@Test
	void testAdd() {
		double d = 4.0;	
		System.out.println("testAdd started");
		long expected = 5;
		long a = 4;
		long b = 1;
		long actual = cal.add(a,b);
		assertEquals(expected, actual);		
	}
	
	@Test
	void addNegativeAndPositiveNumber(){
		System.out.println("addNegativeAndPositiveNumber started");
		assertEquals(3, cal.add(4, -1));
	}
	
	@Test
	void testMultiply() {
		System.out.println("testMultiply started");
		assertEquals(50, cal.multiply(10, 5));
	}

	@Test
	void divisionTest() {
		System.out.println("divisionTest started");
		assertThrows(ArithmeticException.class, () -> cal.divide(2, 0));
	}

	@Test
	void additionTest() {
		System.out.println("inside additionTest");
		assertAll(() -> assertEquals(2, cal.add(1, 1), "Doesn't add two positive numbers properly"),
				() -> assertEquals(0, cal.add(-1, 1), "Doesn't add a negative and a positive number properly"),
				() -> assertNotNull(cal, "The calc variable should be initialized"));
	}

}