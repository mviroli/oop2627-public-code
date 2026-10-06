package it.unibo.pslab.oop.p08polymorphism.last;

/* Showcasing autoboxing */
public class Boxing {
	public static void main(String[] s) {
		final Object[] os = new Object[5];
		os[0] = new Object();
		os[1] = 5; // equivalent to os[1]=Integer.valueOf(5);
		os[2] = 10; // equivalent to os[2]=Integer.valueOf(10);
		os[3] = true; // equivalent to os[3]=Boolean.valueOf(true);
		os[4] = 20.5; // equivalent to os[4]=Double.valueOf(20.5);
		final Integer[] is = new Integer[] { 10, 20, 30, 40 };
		final int i = is[0] + is[1] + is[2] + is[3];
		// equivalent to: is[0].intValue()+ is[1].intValue()+..
		IO.println("Sum: " + i); // 100
	}
}
