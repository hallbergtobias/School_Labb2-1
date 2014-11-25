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
    public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {
        this.x = x1;
        this.y = y1;
        this.width = x2-x1;
        this.height = y2-y1;
        this.c = c;
    }

    /**
	 * Creates a Line from two GeometricalForms and a color.
	 * @param f1 A GeometricalForm
	 * @param f2 A GeometricalForm
	 * @param c The Color
	 */
    public Line(GeometricalForm f1, GeometricalForm f2, Color c) {
        this.x = f1.getX();
        this.y = f1.getY();
        this.width = f2.getWidth();
        this.height = f2.getHeight();

    }
    
    /**
	 * {@inheritDoc}
	 */
    public int getPerimeter () {
        return (width) + (height);
    }

    /**
	 * {@inheritDoc}
	 */
    public int getArea () {
        return 0;
    }

    /**
	 * {@inheritDoc}
	 */
    public int compareTo( GeometricalForm f ) {
        if (this.getPerimeter() == f.getPerimeter()) {
            return 0;
        }   else if (this.getPerimeter() > f.getPerimeter()) {
            return 1;
        }   else {
            return -1;
        }
    }

    /**
	 * {@inheritDoc}
	 */
    public void fill( Graphics g ) {
        g.drawLine(x, y, width+x, height+y);
        g.setColor(c);
    }
}
