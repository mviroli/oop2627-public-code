package it.unibo.pslab.oop.p04objects;

class Point3DBis { // dichiarazione classe
	double x; // 3 campi
	double y;
	double z;

	Point3DBis build(double a, double b, double c) { // build con ritorno
		this.x = a;
		this.y = b;
		this.z = c;
		return this;
	}

	double getSquaredModulus() { 
		return this.x * this.x + this.y * this.y + this.z * this.z;
	}
}