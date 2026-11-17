package it.unibo.pslab.oop.p17lambda.first;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class UseButtonEvents{
	
	public static void main(String[] args){
		final JButton b1 = new JButton("Say Hello");

		// Uso una inner class anonima..
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				IO.println("Hello!! "+e);
			}
		}); 
		
		// Uso una lambda
		final JButton b2 = new JButton("Say Hello 2");
		b2.addActionListener(e -> IO.println("Hello 2!! "+e));
		
		final JFrame frame = new JFrame("Events Example");
		frame.setSize(320, 200);
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);
		frame.setVisible(true);
	}
}
