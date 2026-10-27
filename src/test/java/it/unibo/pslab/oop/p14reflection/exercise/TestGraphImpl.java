package it.unibo.pslab.oop.p14reflection.exercise;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;

public class TestGraphImpl {

	@Test
	@Disabled // to be removed
	public void testNodeSet() {
		final Graph<String> g = null; //new GraphImpl<>();
		assertTrue(g.nodeSet().isEmpty());
		
		g.addNode("a");
		g.addNode("b");
		g.addNode("c");
		g.addNode("d");
		g.addNode("e");
		assertEquals(5, g.nodeSet().size());
		assertEquals(Set.of("a","b","c","d","e"), g.nodeSet());
		assertTrue(g.linkedNodes("c").isEmpty());
		
		g.addEdge("a","b");
		g.addEdge("b","c");
		g.addEdge("c","d");
		g.addEdge("d","e");
		g.addEdge("c","a");
		assertEquals(2, g.linkedNodes("c").size());
		assertEquals(Set.of("a","d"), g.linkedNodes("c"));
		assertEquals(List.of("b","c","a"), g.getPath("b", "a"));
	}

}
