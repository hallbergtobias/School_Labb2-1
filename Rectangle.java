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
    public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.c = c;

    }
    
    /**
	 * Creates a Rectangle with the same position as an already given GeometricalForm, a new width and height, and a color.
	 * @param f A GeometricalForm
	 * @param width The width
	 * @param height The height
	 * @param c The color
	 */
    public Rectangle(GeometricalForm f, int width, int height, Color c) {
        this.x = f.getX();
        this.y = f.getY();
        this.width = width;
        this.height = height;
        this.c = c;
    }

    /**
	 * {@inheritDoc}
	 */
    public int getPerimeter () {
        return 0;
    }

    /**
	 * {@inheritDoc}
	 */
    public int getArea () {
        return height*width;
    }

    /**
	 * {@inheritDoc}
	 */
    public int compareTo( GeometricalForm f ) {
        if (this.getArea() == f.getArea()) {
            return 0;
        }  else if (this.getArea() > f.getArea()) {
            return 1;
        }   else {
            return -1;
        }
    }

    /**
	 * {@inheritDoc}
	 */
    public void fill( Graphics g ) {
        g.drawLine(x, y, x+width, y);
        g.drawLine(x, y, x, y+height);
        g.drawLine(x, y+height, x+width, y+height);
        g.drawLine(x+width, y, x+width, y+height);
        g.setColor(c);
    }
}