package geometri;

import java.awt.*;

/**
 * A Rectangle with a size, position and color.
 * 
 * @author Emil Hukic
 * @author Tobias Hallberg
 */
public class Rectangle extends RectangularForm implements GeometricalForm {

	/**
	 * Creates a Rectangle from a position, width, height and color.
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @param width The width
	 * @param height The height
	 * @param c The color
	 * @throws IllegalPositionException Is thrown if trying to set a negative position
	 */
    public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException {}
    
    /**
	 * Creates a Rectangle with the same position as an already given GeometricalForm, a new width and height, and a color.
	 * @param f A GeometricalForm
	 * @param width The width
	 * @param height The height
	 * @param c The color
	 */
    public Rectangle(GeometricalForm f, int width, int height, Color c) {}

    /**
	 * {@inheritDoc}
	 */
    public int getPerimeter () {}

    /**
	 * {@inheritDoc}
	 */
    public int getArea () {}

    /**
	 * {@inheritDoc}
	 */
    public void fill( Graphics g ) {}
}