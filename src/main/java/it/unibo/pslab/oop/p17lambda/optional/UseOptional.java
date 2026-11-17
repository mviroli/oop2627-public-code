package it.unibo.pslab.oop.p17lambda.optional;

import java.util.*;

public class UseOptional {

	public static void main(String[] args) {
		
		final String s = Math.random() > 0.5 ? "high value" : null;
		//Optional<String> opt = Optional.ofNullable(s);
		Optional<String> opt = s == null ? Optional.empty() : Optional.of(s);
		
		IO.println("present: "+opt.isPresent());
		IO.println("orElse: "+opt.orElse("it is actually null"));
		try{
			IO.println("get: "+opt.get());
		} catch (Exception e){
			IO.println("get failed.."+e.getClass());
		}
		
		IO.print("ifPresent..");
		opt.ifPresent(IO::println);
		
	}

}
