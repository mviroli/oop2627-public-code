package it.unibo.pslab.oop.p18streams;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Stream.*;

public class UseFactoriesImport {

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(10,20,30,5,6,7,10,20,100);
		IO.print("Collection: ");
		li.stream().forEach(i->IO.print(" "+i));
		
		IO.print("\nEmpty: ");
		empty().forEach(i->IO.print(" "+i));
		
		IO.print("\nFromValues: ");
		of("a","b","c").forEach(i->IO.print(" "+i));
		
		IO.print("\nIterate(+1): ");
		iterate(0,i->i+1).limit(20).forEach(i->IO.print(" "+i));
		
		IO.print("\nSuppl(random): ");
		generate(()->Math.random()).limit(5).forEach(i->IO.print(" "+i));
		
		IO.print("\nConcat: ");
		concat(of("a","b"),of(1,2)).forEach(i->IO.print(" "+i));
		
		IO.print("\nBuilder: ");
		builder().add(1).add(2).build().forEach(i->IO.print(" "+i));
		
		IO.print("\nRange: ");
		IntStream.range(0,20).forEach(i->IO.print(" "+i));
	}
}

