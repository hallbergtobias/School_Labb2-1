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
    public Point(int x, int y, Color c) throws IllegalPositionException {
        this.x = x;
        this.y = y;
        this.c = c;
        this.width = 0;
        this.height = 0;
    }

    /**
	 * Creates a Point with the same position as an already given GeometricalForm, and a color.
	 * @param f A GeometricalForm
	 * @param c The color
	 */
    public Point(GeometricalForm f, Color c) {
        this.x = f.getX();
        this.y = f.getY();
        this.c = c;
        this.width = 0;
        this.height = 0;
    }

    /**
	 * {@inheritDoc}
	 */
    public int getPerimeter() {
        return 0;
    }

    /**
	 * {@inheritDoc}
	 */
    public int getArea() {
        return 0;
    }

    /**
	 * {@inheritDoc}
	 */
    public int compareTo(GeometricalForm f) {
        if (this.getArea() == f.getArea()) {
            return 0;
        } else if (this.getArea() > f.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
	 * {@inheritDoc}
	 */
    public void fill(Graphics g) {
    }
}