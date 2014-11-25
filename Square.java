package geometri;

import java.awt.*;

/**
 * A Square with a size, position and color.
 * 
 * @author Emil Hukic
 * @author Tobias Hallberg
 */
public class Square extends RectangularForm implements GeometricalForm {

	/**
	 * Creates a Square from a position, size and color.
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @param side The size
	 * @param c The color
	 * @throws IllegalPositionException Is thrown if trying to set a negative position
	 */
    public Square(int x, int y, int side, Color c) throws IllegalPositionException {}

    /**
	 * Creates a Square with the same position as an already given GeometricalForm, a new size, and a color.
	 * @param f A GeometricalForm
	 * @param side The size
	 * @param c The color
	 */
    public Square(GeometricalForm f, int side, Color c) {}

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
    public int compareTo( GeometricalForm f ) {}

    /**
	 * {@inheritDoc}
	 */
    public void fill( Graphics g ) {}
}
