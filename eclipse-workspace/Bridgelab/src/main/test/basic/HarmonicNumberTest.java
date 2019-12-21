package main.test.basic;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.basic.HarmonicNumber;

public class HarmonicNumberTest {

	@Test
	public void test() {
		
		double actual=0;
		
		actual=HarmonicNumber.getHarmonicProgression(1);
		assertEquals(1.0,actual,0.01);
		
		actual=HarmonicNumber.getHarmonicProgression(2);
		assertEquals(1.5,actual,0.001);
		
		actual=HarmonicNumber.getHarmonicProgression(3);
		assertEquals(1.833,actual,0.001);
		
		actual=HarmonicNumber.getHarmonicProgression(0);
		assertEquals(0.0,actual,0.001);
		
		actual=HarmonicNumber.getHarmonicProgression(-3);
		assertEquals(0.0,actual,0.001);
		
	}

}
