package it.unibo.pslab.oop.p14reflection.classes;

import java.lang.reflect.Method;
import java.util.Arrays;

public class PrintObjectsUtilities {

	public static String objectToString(Object o, String... getters) throws Exception {
		String out = o.getClass().getSimpleName() + ": ";
		for (String getter : getters) {
			// handling initial capital letter
			getter = getter.substring(0, 1).toUpperCase() + getter.substring(1);
			final Method getterMethod = o.getClass().getMethod("get" + getter);
			final Object resultOfCall = getterMethod.invoke(o);
			out += " " + getter + " -> ";
			out += resultOfCall.getClass().isArray() 
					? Arrays.deepToString((Object[]) resultOfCall) : resultOfCall.toString();
			out += " |";
		}
		return out.substring(0, out.length() - 2);
	}
}
