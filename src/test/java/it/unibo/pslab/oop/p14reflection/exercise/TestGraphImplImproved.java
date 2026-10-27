package it.unibo.pslab.oop.p14reflection.exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;


public class TestGraphImplImproved {

    private Graph<String> g;

    @BeforeEach // initalisation code executed prior to each test
    @Disabled // to be removed
    public void initialise() {
        //g = new GraphImpl<>();
        g.addNode("a");
        g.addNode("b");
        g.addNode("c"); 
        g.addNode("d");
        g.addNode("e");
        g.addEdge("a", "b");
        g.addEdge("b", "c");
        g.addEdge("c", "d");
        g.addEdge("d", "e");
        g.addEdge("c", "a");
    }

    @Test
    @Disabled // to be removed
    public void testNodeSetSize() {
        assertEquals(5, g.nodeSet().size());
    }

    @Test
    @Disabled // to be removed
    public void testNodeSetElements() {
        assertEquals(Set.of("a", "b", "c", "d", "e") , g.nodeSet());
    }

    @Test
    @Disabled // to be removed
    public void testLinkedNodes() {
        assertEquals(2, g.linkedNodes("c").size());
        assertEquals(Set.of("a", "d") , g.linkedNodes("c"));
    }

    @Test
    @Disabled // to be removed
    public void testGetPath() {
        assertEquals(List.of("b", "c", "a"), g.getPath("b", "a"));
    }
}
