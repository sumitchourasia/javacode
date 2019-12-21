package main.test.basic;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.basic.LeapYear;

public class LeapYearTest {

	@Test
	public void test() {
		boolean actual=LeapYear.isLeapYear(2000);
		assertEquals(true,actual);
		
		actual=LeapYear.isLeapYear(1000);
		assertEquals(false,actual);
		
		actual=LeapYear.isLeapYear(9999);
		assertEquals(false,actual);
		
		actual=LeapYear.isLeapYear(2016);
		assertEquals(true,actual);
		
		actual=LeapYear.isLeapYear(999);
		assertEquals(false,actual);
		
		actual=LeapYear.isLeapYear(10000);
		assertEquals(false,actual);
		
		actual=LeapYear.isLeapYear(555);
		assertEquals(false,actual);
		
		
		
	}
}

