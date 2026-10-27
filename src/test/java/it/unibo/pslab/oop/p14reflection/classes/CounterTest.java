package it.unibo.pslab.oop.p14reflection.classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

	@Test
	public void test1() {
		Counter c = new Counter();
		c.increment();
		c.increment();
		assertTrue(c.getValue()==2, "Increment does not work wrt getValue");
	}
	
	@Test
	public void test2() {
		Counter c = new Counter();
		assertTrue(c.getValue()==0, "getValue is not initially zero");
	}
	

}
