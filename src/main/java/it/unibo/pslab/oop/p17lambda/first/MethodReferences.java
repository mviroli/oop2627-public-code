package it.unibo.pslab.oop.p17lambda.first;

import java.util.*;

public class MethodReferences {
	
	private static int staticMyCompare(final String a, final String b) {
		return a.compareTo(b);
	}
	private int instanceMyCompare(final String a, final String b) {
		return b.compareTo(a);
	}
	public static void main(String[] args) {
		final List<String> list = List.of("a", "bb", "c", "ddd");
		final MethodReferences objAL = new MethodReferences();

		Collections.sort(list, (x,y) -> staticMyCompare(x,y));
		// <class>::<static-method>
		Collections.sort(list, MethodReferences::staticMyCompare);
		
		Collections.sort(list, (x,y) -> objAL.instanceMyCompare(x, y));
		// <object>::<instance-method>
		Collections.sort(list, objAL::instanceMyCompare); 
				
		Collections.sort(list, (x,y) -> x.compareTo(y));
		// <class>::<instance-method>
		Collections.sort(list, String::compareTo);  // same as above
	}
}
