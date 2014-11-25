package geometri;

import java.awt.*;

/**
 * A Point with a position and color.
 * 
 * @author Emil Hukic
 * @author Tobias Hallberg
 */
public class Point extends RectangularForm implements GeometricalForm {

	/**
	 * Creates a Point from a position and color.
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @param c The color
	 * @throws IllegalPositionException Is thrown if trying to set a negative position
	 */
    public Point(int x, int y, Color c) throws IllegalPositionException {}

    /**
	 * Creates a Point with the same position as an already given GeometricalForm, and a color.
	 * @param f A GeometricalForm
	 * @param c The color
	 */
    public Point(GeometricalForm f, Color c) {}

    /**
	 * {@inheritDoc}
	 */
    public int getPerimeter() {}


    /**
	 * {@inheritDoc}
	 */
    public int getArea() {}


    /**
	 * {@inheritDoc}
	 */
    public void fill(Graphics g) {}
}