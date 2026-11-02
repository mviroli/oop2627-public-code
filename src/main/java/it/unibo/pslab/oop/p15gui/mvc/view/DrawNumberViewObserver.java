package it.unibo.pslab.oop.p15gui.mvc.view;

public interface DrawNumberViewObserver {
	
	void newAttempt(int n);
	
	void resetGame();
	
	void quit();
}
