package it.unibo.pslab.oop.p04objects;

class UsePoint {
	public static void main() {
		// creo vari punti
		Point p1 = new Point();
		p1.build(10, 20, 30);
		Point p2 = new Point();
		p2.build(5, 6, 7);
		Point p3 = new Point();
		p3.build(100, 100, 100);
		Point p4 = Points.zero; // questo è lo zero

		// costruisco l'array
		Point[] array = new Point[] { p1, p2, p3, p4 };

		// calcolo il max
		Point max = Points.max(array);

		// stampo
		IO.println("Max: " + max.x + "," + max.y + "," + max.z);
	}
}