package it.unibo.pslab.oop.p17lambda.first;

import java.awt.FlowLayout;

import javax.swing.*;

// Showing how lambdas can access their scope
public class ChangeButton extends JFrame{

	private int counter = 0;
	
	public ChangeButton(){
		super("Changing button example");
		final JButton button = new JButton("Val: ");
		button.addActionListener(
			e -> button.setText("Val: " + ChangeButton.this.counter++));
		// button è una variabile finale nel metodo
		// ChangeButton.this.counter è un campo nella enclosing instance
	
		this.setSize(320, 200);
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(button);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		new ChangeButton();
	}
}
