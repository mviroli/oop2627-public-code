package it.unibo.pslab.oop.p02objects;

class Point3D {
	double x; 
	double y;
	double z;
	void build(double a, double b, double c) {
		this.x = a;
		this.y = b;
		this.z = c;
	}
	double getSquaredModulus() { 
		return this.x * this.x + this.y * this.y + this.z * this.z;
	}
	boolean isEqual(Point3D q) { // equal
		return this.x == q.x && this.y == q.y && this.z == q.z;
	}
	public static void main(String[] s) {
		Point3D p = new Point3D(); // creo un punto p
		p.build(10.0, 20.0, 30.0); // ne imposto i valori
		Point3D q = new Point3D(); // creo un punto q
		q.build(10.0, 20.0, 31.0); // ne imposto i valori
		IO.println("Modulo quadro di p: " + p.getSquaredModulus());
		IO.println("p è uguale a q? : " + p.isEqual(q));
	}
}