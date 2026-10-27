package it.unibo.pslab.oop.p14reflection.classes;

import java.lang.reflect.*;

public class DynamicExecution {

	private static final String Q_CLASS = "Insert fully-qualified class name: ";
	private static final String Q_METH = "Insert name of method to call: ";
	private static final String L_OK = "Everything was ok! The result is..";
	private static final String E_RET = "Wrong return type";

	public static void main(String[] s) throws Exception {
		while (true) {
			final String className = System.console().readLine(Q_CLASS);
			final String methName = System.console().readLine(Q_METH);
			final Class<?> retrievedClass = Class.forName(className);	
			final Constructor<?> retrievedConstructor = retrievedClass.getConstructor();
			final Method retrievedMethod = retrievedClass.getMethod(methName);
			if (!retrievedMethod.getReturnType().isAssignableFrom(String.class)) {
				throw new NoSuchMethodException(E_RET);
			}
			final Object createdObject = retrievedConstructor.newInstance();
			final String resultOfMethodCall = (String) retrievedMethod.invoke(createdObject);
			IO.println(L_OK);
			IO.println(resultOfMethodCall);
			IO.println();
		}
	}
}
