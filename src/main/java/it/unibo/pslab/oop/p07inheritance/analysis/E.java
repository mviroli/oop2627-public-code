package it.unibo.pslab.oop.p07inheritance.analysis;

class E {
	protected int i;

	void m() {
		this.i++;
		this.n();
	}
	void n() {
		this.i = this.i + 10;
	}
}
