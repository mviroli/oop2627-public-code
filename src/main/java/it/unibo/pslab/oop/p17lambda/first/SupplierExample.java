package it.unibo.pslab.oop.p17lambda.first;

import java.util.function.Supplier;

public class SupplierExample {

	private void check(boolean condition, Supplier<RuntimeException> exception){
		if (!condition){
			throw exception.get();
		}    
	}

	public int access(int[] array, int index){
		check(array != null, NullPointerException::new); //method/constructor reference
		check(index >=0 && index < array.length, 
				() -> new IndexOutOfBoundsException("Error at position "+index));
		return array[index];
	}

}
