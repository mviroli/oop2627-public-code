package it.unibo.pslab.oop.p15gui.mvc.controller;

import it.unibo.pslab.oop.p15gui.mvc.model.*;
import it.unibo.pslab.oop.p15gui.mvc.view.*;

public class DrawNumberApp implements DrawNumberViewObserver {
	
	private static final int MIN = 0;
	private static final int MAX = 100;
	private static final int ATTEMPTS = 10;
	private final DrawNumber model;
	private final DrawNumberView view;

	public DrawNumberApp() {
		this.model = new DrawNumberImpl(MIN, MAX, ATTEMPTS); 
		this.view = new DrawNumberViewImpl();
		this.view.setObserver(this);
		this.view.start();
	}

	public void newAttempt(int n) {
		try {
			final DrawResult result = this.model.attempt(n);
			if (result == DrawResult.YOU_LOST){
			    this.view.limitsReached();
			}
			this.view.result(result);
			if (result == DrawResult.YOU_WON){
			    this.quit();
			}
		} catch (IllegalArgumentException e) {
			this.view.numberIncorrect();
		}
	}

	public void resetGame() {
		this.model.reset();
	}

	public void quit() {
		System.exit(0);
	}

	public static void main(String[] args) {
		new DrawNumberApp();
	}
}
