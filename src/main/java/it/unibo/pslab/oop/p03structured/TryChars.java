package it.unibo.pslab.oop.p03structured;

class TryChars {
	public static void main(String[] s) {
		IO.println("lettera 'a' e a capo" + 'a');
		IO.println("acqua (cinese) e a capo " + '\u6C34');
		IO.println("backslash e a capo" + '\\');
		IO.print("a capo " + '\n');
		IO.print("a capo " + (char) 10);
	}
}
