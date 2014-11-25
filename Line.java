package geometri;

import java.awt.*;

/**
 * A Line with two points (x1,y1) and (x2,y2), and a color.
 * 
 * @author Emil Hukic
 * @author Tobias Hallberg
 */
public class Line extends RectangularForm implements GeometricalForm {

	/**
	 * Creates a Line from two coordinates (x1,y1) to (x2,y2), and a color.
	 * @param x1 The first X coordinate
	 * @param y1 The first Y coordinate
	 * @param x2 The second X coordinate
	 * @param y2 The second Y coordinate
	 * @param c The Color
	 * @throws IllegalPositionException Is thrown if trying to set a negative position
	 */
    public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {}


    /**
	 * Creates a Line from two GeometricalForms and a color.
	 * @param f1 A GeometricalForm
	 * @param f2 A GeometricalForm
	 * @param c The Color
	 */
    public Line(GeometricalForm f1, GeometricalForm f2, Color c) {}


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
