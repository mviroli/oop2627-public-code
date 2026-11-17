package it.unibo.pslab.oop.p17lambda.optional;

import java.util.Optional;



public class UseOptional2 {

	public static void main(String[] args) throws Exception {

		final Optional<Integer> opt = Optional.of(10); 
		final Optional<Integer> opt2 = Optional.empty();
		IO.println(opt.isPresent());
		IO.println(opt2.isPresent());
		
		if (opt.isPresent()){
			IO.println(opt.get()); // 10
		} else {
			System.exit(0);
		}
		opt.ifPresent(IO::println); // 10
		opt2.ifPresent(IO::println); // nothing
		
		opt.map(x -> x+1).ifPresent(IO::println); // 11
		opt.map(x -> x+"1").ifPresent(IO::println); // "101"
		
		// Your first monad example!
		Optional<Integer> op3 = opt.flatMap(x -> 
								opt2.flatMap(y ->
								opt2.flatMap(z -> Optional.of(x+y+z))));
		IO.println(op3);
		
		IO.println(opt.orElseThrow(()->new Exception())); // 10
		IO.println(opt2.orElseThrow(()->new Exception())); // exc

	}

}
