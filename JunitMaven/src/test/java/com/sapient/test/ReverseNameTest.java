package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.Palindrome;

@RunWith(JUnitPlatform.class)
public class ReverseNameTest {
	
	private static Palindrome ser;
	private static String[] expected;
	private static String[] input;
	
	@BeforeAll
	public static void beforeAll(){
		ser = new Palindrome();
		expected =  new String[]{"amar","nitin","kayak","no"};
		input = new String[]{"rama","nitin","kayak","on"};
	}
	
	@AfterAll
	public static void afterAll(){
		ser = null;
	}
	
	@Test
	public void reverseTest1(){
		int actual = ser.reverseName(input).length;
		assertTrue(expected.length == actual);
	}
	
	@Test
	public void reverseTest2(){
		String[] actual = ser.reverseName(input);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void reverseTest3(){
		String[] actual = ser.reverseName(null);
		assertNull(actual);
	}

}
