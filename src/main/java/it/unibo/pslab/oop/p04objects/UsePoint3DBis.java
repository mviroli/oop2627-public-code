package it.unibo.pslab.oop.p04objects;

class UsePoint3DBis {
	public static void main(String[] s) {
		// creo vari punti
		Point3DBis p1 = new Point3DBis().build(10, 20, 30);
		Point3DBis p2 = new Point3DBis().build(5, 6, 7);
		Point3DBis p3 = new Point3DBis().build(100, 100, 100);
		
		IO.println(p1.getSquaredModulus());
		IO.println(p2.getSquaredModulus());
		IO.println(p3.getSquaredModulus());
	}
}