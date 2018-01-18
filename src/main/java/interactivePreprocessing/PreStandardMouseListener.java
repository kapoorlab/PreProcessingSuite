package interactivePreprocessing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JScrollBar;

import interactivePreprocessing.InteractiveMethods.ValueChange;





/**
 * Updates when mouse is released
 * 
 * @author spreibi
 *
 */
public class PreStandardMouseListener implements MouseListener
{
	final InteractiveMethods parent;
	final ValueChange change;

	public PreStandardMouseListener( final InteractiveMethods parent, final ValueChange change)
	{
		this.parent = parent;
		this.change = change;
	}
	
	

	@Override
	public void mouseReleased( MouseEvent arg0 )
	{
		
		
		parent.updatePreview(change);
		

		
	}

	@Override
	public void mousePressed( MouseEvent arg0 ){
		
		
		/*
		deltascrollbar.setLocation(arg0.getLocationOnScreen());
		deltascrollbar.repaint();
		deltascrollbar.validate();
		System.out.println(arg0.getLocationOnScreen());
		*/
	}

	@Override
	public void mouseExited( MouseEvent arg0 ) {
	
	}

	@Override
	public void mouseEntered( MouseEvent arg0 ) {
	}

	@Override
	public void mouseClicked( MouseEvent arg0 ) {}
}

