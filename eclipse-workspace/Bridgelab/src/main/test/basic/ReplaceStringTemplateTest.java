package main.test.basic;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.basic.ReplaceStringTemplate;

public class ReplaceStringTemplateTest {

	@Test
	public void test() {
		
		String actual=ReplaceStringTemplate.replaceUserName("Sumit");
		assertEquals("Hello Sumit,how are you?", actual);
		
		actual=ReplaceStringTemplate.replaceUserName("null");
		assertEquals("Hello null,how are you?", actual);
		
		actual=ReplaceStringTemplate.replaceUserName("");
		assertEquals("Hello null,how are you?", actual);
		
		
	}
}
