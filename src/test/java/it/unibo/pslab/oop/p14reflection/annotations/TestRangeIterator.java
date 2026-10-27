package it.unibo.pslab.oop.p14reflection.annotations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TestRangeIterator {

	@Test
	public void testStandardBehaviour() {
		final Iterator<Integer> it = new RangeIterator(5,7);
		assertTrue(it.hasNext());
		assertEquals(5,it.next().intValue());
		assertTrue(it.hasNext());
		assertEquals(6,it.next().intValue());
		assertTrue(it.hasNext());
		assertEquals(7,it.next().intValue());
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testStartEqualsStop() {
		Iterator<Integer> it = new RangeIterator(5,5);
		assertTrue(it.hasNext());
		assertEquals(5,it.next().intValue());
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testRemoveRaisesException() {
		Iterator<Integer> it = new RangeIterator(5,10);
		try {
			it.remove();
			fail();
		} catch (UnsupportedOperationException e) {
		}
	}
	
	// Variante migliorativa
	@Test
	public void testRemoveRaisesException2() {
		Iterator<Integer> it = new RangeIterator(5,10);
		assertThrows(UnsupportedOperationException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				it.remove();
			}
		});
		// with lambdas: 
		// assertThrows(UnsupportedOperationException.class, () -> {it.remove();});
	}
	
	@Test
	public void testNoSuchElement() {
		Iterator<Integer> it = new RangeIterator(5,6);
		assertThrows(NoSuchElementException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				it.next();
				it.next();
				it.next();
			}
		});

	}
	
	@Test
	public void testIllegalArguments() {
		assertThrows(IllegalArgumentException.class, new Executable() {
			public void execute() throws Throwable {
				new RangeIterator(6,4);
			}
		});
	}
}
