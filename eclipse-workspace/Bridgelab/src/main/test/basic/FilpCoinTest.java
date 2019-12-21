package main.test.basic;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.basic.FlipCoin;

public class FilpCoinTest {

	// @SuppressWarnings("deprecation")
	@Test
	public void test() {
		
		double actual=FlipCoin.headPercentage(0);
		assertEquals(0.0, actual,0.1);
	}
}
