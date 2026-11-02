package it.unibo.pslab.oop.p15gui.gui;

public class UseEncapsulatedFrame {

	public static void main(String[] args) { 
		final UserInterface ui = new UserInterfaceImpl();
		ui.setDimensions(300, 300);
		ui.show();
	}

}
