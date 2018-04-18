package interactivePreprocessing;


import java.awt.Label;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JScrollBar;

import interactivePreprocessing.InteractiveMethods.ValueChange;

public class PREMaxSizeListener implements AdjustmentListener {
	
	final Label label;
	final String string;
	final InteractiveMethods parent;
	final float min, max;
	final int scrollbarSize;
	final JScrollBar scrollbar;
	
	
	public PREMaxSizeListener(final InteractiveMethods parent, final Label label, final String string, final float min, final float max, final int scrollbarSize, final JScrollBar scrollbar) {
		
		this.parent = parent;
		this.label = label;
		this.string = string;
		this.min = min;
		this.max = max;
		this.scrollbarSize = scrollbarSize;
		this.scrollbar = scrollbar;
		
		scrollbar.addMouseListener( new CovistoStandardMouseListener( parent, ValueChange.MSER ) );
		
	}
	
	
	
	@Override
	public void adjustmentValueChanged(final AdjustmentEvent event) {
		    parent.maxSize = (long) utility.ScrollbarUtils.computeValueFromScrollbarPosition(event.getValue(), min, max, scrollbarSize);

		
			scrollbar.setValue(utility.ScrollbarUtils.computeScrollbarPositionFromValue(parent.maxSize, min, max, scrollbarSize));

			label.setText(string +  " = "  + parent.nf.format(parent.maxSize));

	
	}
	

}



