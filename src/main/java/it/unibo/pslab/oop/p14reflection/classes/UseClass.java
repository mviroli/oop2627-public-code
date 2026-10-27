package it.unibo.pslab.oop.p14reflection.classes;

public class UseClass {
	public static void main(String[] args) throws ClassNotFoundException {
		final Class<String> c = String.class;
		IO.println(c.getName()+" "+c.getCanonicalName());
		//java.lang.String java.lang.String
		final Class<Integer> ci = (Class<Integer>)Integer.valueOf(5).getClass();
		IO.println(ci.getName()+" "+ci.getCanonicalName());
		//java.lang.Integer java.lang.Integer
		final Class<?> ca = new int[20].getClass();
		IO.println(ca.getName()+" "+ca.getCanonicalName());
		//[I int[]
		final Class<?> cint = ca.getComponentType();
		IO.println(cint.getName()+" "+cint.getCanonicalName());
		//int int
		final Class<?> cl = Class.forName("java.util.List");
		IO.println(cl.getName()+" "+cl.getCanonicalName());
		//java.util.List java.util.List
		final Class<?> can = new Object(){
			public String toString(){ return "none";}
		}.getClass();
		IO.println(can.getName()+" "+can.getCanonicalName());
		//it.unibo.apice.oop.p16reflection.UseClass$1 null	
	}
}
