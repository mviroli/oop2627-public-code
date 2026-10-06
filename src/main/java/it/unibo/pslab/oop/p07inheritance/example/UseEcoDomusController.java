package it.unibo.pslab.oop.p07inheritance.example;

public class UseEcoDomusController extends Object{
	public static void main(String[] s) {
		// Simulazione sessione di lavoro
		final EcoDomusController controller;
		controller = new EcoDomusController(5, 10);
		IO.println(controller);
		// off(10) | off(10) | off(10) | off(10) | off(10) |
		final LimitedLamp l = controller.getLamp(0);
		l.switchOn();
		l.switchOff();
		l.switchOn();
		IO.println(controller);
		// on(8) | off(10) | off(10) | off(10) | off(10) |
		controller.switchOnOne();
		controller.switchOnOne();
		controller.switchOnOne();
		controller.switchOnOne();
		IO.println(controller);
		// on(8) | on(9) | on(9) | on(9) | on(9) |
	}
}
