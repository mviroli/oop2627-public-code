package it.unibo.pslab.oop.p14reflection.classes;

public class TryClass {
	
	public static void main(String[] args) throws Exception {
		
		// Getting a Class with "exact type"
		final Class<String> c = String.class;
		IO.println(c);
		IO.println("object "+c.newInstance()); // deprecated
		
		// Getting a Class from a computed String
		final Class<?> c2 = Class.forName("java.lang" + ".String");
		IO.println("object "+(String)c2.newInstance());

		// Getting a Class from an Object
		final Object o = "3";
		final Class<?> c3 = o.getClass();
		IO.println(c3); //String

		// An example "reflective" functionality
		String s = cloneObject("a string...");
		java.util.Date d = cloneObject(new java.util.Date());
		IO.println(s.length()+" "+d);
	}
	
	private static <T> T cloneObject(T t) throws Exception {
		return (T)t.getClass().newInstance();
	}
}
