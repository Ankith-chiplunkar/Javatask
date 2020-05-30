package com.ITO.Assign2.one;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junittest {

	@Test
	void test1() {
		String word1= NumberToWords.convert(100);
		assertEquals("one hundred ", word1);
		}
	@Test
	void test2() {
		String word2 = NumberToWords.convert(-101);
		assertEquals("please enter the number between 0-100000000", word2);
	}
	
	@Test 
	void test3() {
		String word3 = NumberToWords.convert(100000);
		assertEquals("one lakh ", word3);
	}


}
