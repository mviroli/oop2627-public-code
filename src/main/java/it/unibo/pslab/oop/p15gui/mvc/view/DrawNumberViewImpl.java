package it.unibo.pslab.oop.p15gui.mvc.view;

import java.util.*;
import javax.swing.*;
import it.unibo.pslab.oop.p15gui.mvc.model.DrawResult;

public class DrawNumberViewImpl implements DrawNumberView {
	
	private static final Map<DrawResult,String> messages = Map.of(
			DrawResult.YOURS_IS_HIGHER,"Your number is too high",
			DrawResult.YOURS_IS_LOWER,"Your number is too low",
			DrawResult.YOU_WON,"You won the game!!");
	
	private DrawNumberFrame frame = new DrawNumberFrame();
	
	public void start(){
		this.frame.setVisible(true);
	}
	
	public void numberIncorrect() {
		JOptionPane.showMessageDialog(frame, "Incorrect Number.. try again", 
				"Incorrect Number", JOptionPane.ERROR_MESSAGE);
	}

	public void limitsReached() {
		JOptionPane.showMessageDialog(frame, "You lost.. a new game starts", 
				"Lost", JOptionPane.WARNING_MESSAGE);
	}

	public void result(DrawResult res) {
	    JOptionPane.showMessageDialog(frame, messages.get(res),
	                                  "Result",JOptionPane.PLAIN_MESSAGE);
	}

	public void setObserver(DrawNumberViewObserver observer) {
		this.frame.setObserver(observer);
	}
}
