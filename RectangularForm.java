package geometri;

import java.awt.Color;

/**
 * An abstract class for the instance variables and methods that all GeometricalForms uses.
 * 
 * @author Emil Hukic
 * @author Tobias Hallberg
 */
public abstract class RectangularForm implements GeometricalForm {

	/**
	 * X position from top left corner
	 */
    protected int x;
    /**
	 * Y position from top left corner
	 */
    protected int y;
    /**
   	 * The width of the form
   	 */
    protected int width;
    /**
   	 * The height of the form
   	 */
    protected int height;
    /**
	 * Color of the form
	 */
    protected Color c;

    /**
	 * {@inheritDoc}
	 */

    public int getX() {}

    /**
	 * {@inheritDoc}
	 */
    public int getY() {}

    /**
	 * {@inheritDoc}
	 */
    public int getHeight() {}

    /**
	 * {@inheritDoc}
	 */
    public int getWidth() {}

    /**
	 * {@inheritDoc}
	 */
    public Color getColor() {}

    /**
	 * {@inheritDoc}
	 */
    public void move( int dx, int dy ) throws IllegalPositionException {}

    /**
	 * {@inheritDoc}
	 */
    public void place( int x, int y )throws IllegalPositionException {}

}
