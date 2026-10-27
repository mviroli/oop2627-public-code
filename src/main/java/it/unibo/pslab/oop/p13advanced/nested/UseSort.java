package it.unibo.pslab.oop.p13advanced.nested;

import java.util.*;

public class UseSort {

	public static void main(String[] args) {
		final List<Integer> list = List.of(10,40,7,57,13,19,21,35);
		IO.println(list);
		// classe anonima a partire da una interfaccia
		Collections.sort(list,new Comparator<Integer>(){
			public int compare(Integer a,Integer b){
				return a-b;
			}
		});
		IO.println(list);

		Collections.sort(list,new Comparator<Integer>(){
			public int compare(Integer a,Integer b){
				return b-a;
			}
		});
		IO.println(list);
	}
}






