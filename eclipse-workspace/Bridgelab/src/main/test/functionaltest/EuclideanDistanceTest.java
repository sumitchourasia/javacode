package main.test.functionaltest;

import static org.junit.Assert.*;
import org.junit.Test;
import main.java.functional.EuclideanDistance;

public class EuclideanDistanceTest {

	@Test
	public void test() {
		
		double actualresult=EuclideanDistance.findEuclideanDistance(0, 0, 3, 4);
		assertEquals(5.0, actualresult,0.01);
		
		actualresult=EuclideanDistance.findEuclideanDistance(-1, -1,3, 3);
		assertEquals(5.65, actualresult,0.01);
	}
}
