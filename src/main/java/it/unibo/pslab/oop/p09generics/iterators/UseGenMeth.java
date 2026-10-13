package it.unibo.pslab.oop.p09generics.iterators;

public class UseGenMeth{
    public static void main(String[] s){
    	Vector<String> vs = new Vector<>();
    	vs.addElement("try");
    	vs.addElement("a");
    	vs.addElement("vector");
    	Vector<Pair<String,Integer>> vp = vs.<Integer>genVectorPair(101);
    	Vector<Pair<String,Integer>> vp2 = vs.genVectorPair(101); // inference
    	System.out.println(""+vp);
    }
}
