package it.unibo.pslab.oop.p15gui.mvc.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DrawNumberFrame extends JFrame {

    private DrawNumberViewObserver observer;
    private final ActionProcessor processor = new ActionProcessor();
    private final JButton bGo = new JButton("Go");
    private final JButton bReset = new JButton("Reset");
    private final JButton bQuit = new JButton("Quit");
    private final JTextField tNumber = new JTextField(10);

    public DrawNumberFrame() {
        this.setTitle("Draw Number App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(640, 400));
        this.getContentPane().add(new JPanel(new BorderLayout()));
        final JPanel pNorth = new JPanel(new FlowLayout());
        pNorth.add(tNumber);
        pNorth.add(bGo);
        final JPanel pSouth = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        pSouth.add(bReset);
        pSouth.add(bQuit);
        this.getContentPane().add(pNorth, BorderLayout.NORTH);
        this.getContentPane().add(pSouth, BorderLayout.SOUTH);
        bGo.addActionListener(processor);
        bQuit.addActionListener(processor);
        bReset.addActionListener(processor);
    }

    public void setObserver(DrawNumberViewObserver observer) {
        this.observer = observer;
    }

    // inner class ActionProcessor...
    private class ActionProcessor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bGo) {
                try {
                    observer.newAttempt(Integer.parseInt(tNumber.getText()));
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(
                            DrawNumberFrame.this, "An integer please..");
                }
            } else if (e.getSource() == bQuit) {
                if (confirmDialog("Confirm quitting?", "Quit")) {
                    observer.quit();
                }
            } else {
                if (confirmDialog("Confirm resetting?", "Reset")) {
                    observer.resetGame();
                }
            }
        }

        private boolean confirmDialog(String question, String name) {
            return JOptionPane.showConfirmDialog(DrawNumberFrame.this, question, name,
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        }
    }
}
