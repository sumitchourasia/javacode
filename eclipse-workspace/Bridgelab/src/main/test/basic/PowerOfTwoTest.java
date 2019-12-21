package main.test.basic;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.basic.PowerOfTwo;

public class PowerOfTwoTest {

	@Test
	public void test() {
		
		//PowerOfTwo pt=new PowerOfTwo();
		int actual=PowerOfTwo.getPowerOfTwo(5);
		assertEquals(32, actual);
		
		actual=PowerOfTwo.getPowerOfTwo(30);
		assertEquals(1073741824, actual);
		
		actual=PowerOfTwo.getPowerOfTwo(31);
		assertEquals(-1, actual);
		
		actual=PowerOfTwo.getPowerOfTwo(0);
		assertEquals(1, actual);
		
		actual=PowerOfTwo.getPowerOfTwo(-1);
		assertEquals(-1, actual);
	}

}
