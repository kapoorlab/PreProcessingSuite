package interactivePreprocessing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import snakeSegmentation.SingleSnake;
import snakeSegmentation.ZSnake;

public class PREZSnakeListener implements ActionListener {
	
	final InteractiveMethods parent;
	
	public PREZSnakeListener(final InteractiveMethods parent) {
		
		this.parent = parent;
	}
	
	@Override
	public void actionPerformed(final ActionEvent arg0) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {

				go();

			}

		});

	}

	public void go() {

	

		ZSnake dosnake = new ZSnake(parent);
		dosnake.execute();

	}

}
