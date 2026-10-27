package it.unibo.pslab.oop.p14reflection.classes;

public class UseReflection {
	
	private static Object callGetter(Object receiver, String getterName) throws Exception {
		return receiver.getClass().getMethod(getterName).invoke(receiver);	
	}
	
	public static void main(String[] args) throws Exception {
		IO.println(callGetter("prova","isEmpty"));
		IO.println(callGetter(new java.util.Date(),"getDate"));
		IO.println(callGetter(new Object(),"hashCode"));
		
		class A{
			public void createDialog() { 
				IO.println("It worked!!");
			}
		}
		IO.println(callGetter(new A(),"createDialog"));
		//IO.println(callGetter(new A(),"createDial"));
	}
}
