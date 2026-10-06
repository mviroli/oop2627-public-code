package it.unibo.pslab.oop.p04objects;

class Points { // Modulo con funzionalità per punti 
	
	static Point zero = new Point();

	static Point max(Point[] ps) { // metodo statico
		Point max = zero; // ricerca max
		for (Point elem : ps) {
			if (elem.getSquaredModulus() > max.getSquaredModulus()) {
				max = elem;
			}
		}
		return max;
	}
}