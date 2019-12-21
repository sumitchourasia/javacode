package main.test.basic;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import main.java.basic.PrimeFactors;

public class PrimeFactorsTest {

	@Test
	public void test() {
		
		int[] expected= {2,5,0,0,0};
		int[] actual=PrimeFactors.findPrimeFactors(80);
		assertEquals(Arrays.toString(expected), Arrays.toString(actual));
		
		int[] expected1= {2,7,0,0,0};
		actual=PrimeFactors.findPrimeFactors(98);
		assertEquals(Arrays.toString(expected1), Arrays.toString(actual));
		
		
		int[] expected2= {2,0,0,0,0};
		actual=PrimeFactors.findPrimeFactors(16);
		assertEquals(Arrays.toString(expected2), Arrays.toString(actual));
		
		int[] expected3= {2,0,0,0,0};
		actual=PrimeFactors.findPrimeFactors(2);
		assertEquals(Arrays.toString(expected3), Arrays.toString(actual));
		
		int[] expected4= {2,5,0,0,0};
		actual=PrimeFactors.findPrimeFactors(1000);
		assertEquals(Arrays.toString(expected4), Arrays.toString(actual));
		
		int[] expected5= {2,3,5,7,0};
		actual=PrimeFactors.findPrimeFactors(210);
		assertEquals(Arrays.toString(expected5), Arrays.toString(actual));
	}

}
