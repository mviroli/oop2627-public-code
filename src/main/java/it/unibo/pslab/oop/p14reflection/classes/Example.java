package it.unibo.pslab.oop.p14reflection.classes;

import java.lang.reflect.*;

public class Example {

	public static void main(String[] args) throws Exception{
		Class<?> c = Class.forName("it.unibo.apice.oop.p14reflection.classes.Counter");
		IO.println(c);
		
		Object o = c.newInstance();
		//Object o = new Counter();
		
		Field f = c.getDeclaredField("countValue");
		
		IO.println(f);
		
		IO.println(f.get(o));
		//IO.println(((Counter)o).getValue());
		
		

	}

}
