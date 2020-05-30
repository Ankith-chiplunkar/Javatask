package com.ITO.Assign2.two;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

class Junittest {

	@Test
	void test1() throws Exception {
		DistinctWords word =new DistinctWords();
		Map<String, Integer> file=word.distinctword();
		assertEquals(3,file.get("I"));
	}
	
	@Test
	void test2() throws Exception {
		DistinctWords word =new DistinctWords();
		Map<String, Integer> file=word.distinctword();
		assertEquals(11,file.size());
	}
	@Test
	void test3() throws Exception {
		DistinctWords word =new DistinctWords();
		Map<String, Integer> file=word.distinctword();
		assertTrue(file.containsKey("Java"));
	}

}
