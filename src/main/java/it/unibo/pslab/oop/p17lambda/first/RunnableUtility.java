package it.unibo.pslab.oop.p17lambda.first;

import java.util.*;

public class RunnableUtility {
	
	private static void iterate(final int howMany, final Runnable r){
		for (int i = 0; i < howMany; i++){
			r.run();
		}
	}
	
	private static void batchExecution(final List<Runnable> list){
		for (final Runnable r: list){
			r.run();
		}
	}

	public static void main(String[] args) {
		iterate(10, ()-> IO.println("ok"));
		final List<Runnable> list = List.of( 
				()->IO.println("a"),
				()->IO.println("b"),
				()->IO.println("c"),
				()->System.exit(0)
		); // Inferenza su List.of automatica!
		batchExecution(list);
	}
}
