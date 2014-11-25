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
    public Square(int x, int y, int side, Color c) throws IllegalPositionException {
        this.x = x;
        this.y = y;
        this.width = side;
        this.height = side;
        this.c = c;
    }

    /**
	 * Creates a Square with the same position as an already given GeometricalForm, a new size, and a color.
	 * @param f A GeometricalForm
	 * @param side The size
	 * @param c The color
	 */
    public Square(GeometricalForm f, int side, Color c) {
        x = f.getX();
        y = f.getY();
        this.height = side;
        this.width = side;
        this.c = c;
    }

    /**
	 * {@inheritDoc}
	 */
    public int getPerimeter () {
        return height*4;
    }

    /**
	 * {@inheritDoc}
	 */
    public int getArea () {
        return height*height;
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
        g.drawLine(x, y, x+width, y );
        g.drawLine(x, y, x, y+width);
        g.drawLine(x+width, y, x+width, y+width);
        g.drawLine(x, y+width, x+width, y+width);
        g.setColor(c);
    }
}
