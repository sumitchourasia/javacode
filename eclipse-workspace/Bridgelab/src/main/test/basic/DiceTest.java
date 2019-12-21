package main.test.basic;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.basic.Dice;

public class DiceTest {

	@Test
	public void test() {
		
		
		int actual=Dice.dice(0, 2);
		assertEquals(0 , actual);
		
		actual=Dice.dice(0, 0);
		assertEquals(0 , actual);
		
		actual=Dice.dice(8, 9);
		assertEquals(0 , actual);
		
		actual=Dice.dice(5, 0);
		assertEquals(0 , actual);
		
		actual=Dice.dice(4,-4);
		assertEquals(0 , actual);
	}

}
