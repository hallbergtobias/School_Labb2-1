package geometri;

import java.awt.*;

/**
 * A Circle with a size, position and color.
 * 
 * @author Emil Hukic
 * @author Tobias Hallberg
 */
public class Circle extends RectangularForm implements GeometricalForm {

	/**
	 * Creates a Circle from a position, diameter and color.
	 * @param x X coordinate from top left corner
	 * @param y Y coordinate from top left corner
	 * @param diameter The diameter
	 * @param c The color
	 * @throws IllegalPositionException Is thrown if trying to set a negative position
	 */
    public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException {}
    
    /**
	 * Creates a Circle with the same position as an already given GeometricalForm, a new diameter and color.
	 * @param f A circle
	 * @param diameter The diameter
	 * @param c The color
	 */
    public Circle(GeometricalForm f, int diameter, Color c) {}

    /**
	 * {@inheritDoc}
	 */
    public int getWidth () {}

    /**
	 * {@inheritDoc}
	 */
    public int getHeight () { }


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
