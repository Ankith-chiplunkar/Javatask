package com.ITO.Assign2.three;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junittest {

	@Test
	public void test1() {
		EvenOdd eo = new EvenOdd(1, 100);
		Thread even = new Thread(new EvenThread(eo));
		assertFalse(even.isAlive());
	}
	
	@Test
	public void test2() {
		EvenOdd eo = new EvenOdd(1, 100);
		Thread even = new Thread(new EvenThread(eo));
		assertFalse(even.isInterrupted());
	}
	
	@Test
	public void test3() {
		EvenOdd eo = new EvenOdd(1, 100);
		Thread even = new Thread(new EvenThread(eo));
		assertEquals("Thread[main,5,main]", even.currentThread().toString());
	}

		
}
