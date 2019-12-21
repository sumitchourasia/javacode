package main.test.functionaltest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import main.java.functional.QuadrarticRoots;

public class QuadrarticRootsTest {

	@Test
	public void test() {
		double[] expectedresult= {4.0,-2.0};
		double[] actualresult = QuadrarticRoots.calculateQuadraticRoots(1, -2, -8);
		
		assertEquals(Arrays.toString(expectedresult),Arrays.toString(actualresult));
	}

}
