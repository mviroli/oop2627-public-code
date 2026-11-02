package it.unibo.pslab.oop.p15gui.mvc.view;

import it.unibo.pslab.oop.p15gui.mvc.model.DrawResult;

public interface DrawNumberView {
	
	void setObserver(DrawNumberViewObserver observer);
	
	void start(); 

	void numberIncorrect();

	void limitsReached();

	void result(DrawResult res);

}
