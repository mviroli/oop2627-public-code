package it.unibo.pslab.oop.p18streams;

import java.util.*;
import java.util.stream.*;

public class UseGeneralizedCollectors {

	public static void main(String[] args) {

		final List<Integer> li = List.of(10,20,30,5,6,7,10,20,100);
		
		// Uso collect a tre argomenti
		final Set<Integer> set = li.stream().collect(
				()->new HashSet<>(), 		// oggetto collettore
				(h,i)->h.add(i),			// aggiunta di un elemento
				(h,h2)->h.addAll(h2));		// concatenazione due collettori
		IO.println("Set: "+set);    // un HashSet coi valori dello stream
		
		// Più frequente: uso collect passandogli un collettore general-purpose
		final Set<Integer> set2 = li.stream().collect(Collector.of(
				HashSet::new, 							// oggetto collettore
				HashSet::add,							// aggiunta di un elemento
				(h,h2)->{h.addAll(h2); return h;}));	// concatenazione due collettori
		IO.println("Set: "+set2);
		
		// cosa fa questo collettore? (.. un po' complicato)
		final int res=li.stream().collect(Collector.of(
				()->Arrays.<Integer>asList(0), 				// oggetto collettore
				(l,i)->l.set(0,i+l.get(0)),					// aggiunta di un elemento
				(l,l2)->{l.set(0,l.get(0)+l2.get(0)); return l;}))	// concatenazione
				.get(0);									// estrazione risultato
		IO.println("Res: "+res);
		
	}
}

