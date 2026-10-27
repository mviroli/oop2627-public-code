package it.unibo.pslab.oop.p14reflection.classes;

import static it.unibo.pslab.oop.p14reflection.classes.PrintObjectsUtilities.*;

public class UsePrintObjectUtilities {
	
	public static void main(String[] args) throws Exception {
		Person p = new Person("Mario",101);
		Teacher t = new Teacher("Gino",102,"PC","OOP");
		IO.println(objectToString(p));
		IO.println(objectToString(p,"name"));
		IO.println(objectToString(p,"name","id"));
		IO.println(objectToString(t,"name","id","courses"));
		
		Counter c = new Counter();
		c.increment();
		c.increment();
		IO.println(objectToString(c,"value"));
	}
}
