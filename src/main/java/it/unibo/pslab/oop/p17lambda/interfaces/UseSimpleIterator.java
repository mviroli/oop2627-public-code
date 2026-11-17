package it.unibo.pslab.oop.p17lambda.interfaces;

public class UseSimpleIterator {
	
	public static void main(String[] args){
		final Counter c = new Counter();
		final SimpleIterator<Integer> si = 
				() -> {c.inc(); return c.getValue();};
		
		IO.println(si.getNext());
		IO.println(si.getListOfNext(20));
	}

}
