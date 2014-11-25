package geometri;

import java.awt.*;

/**
 * An Oval with a size, position and color.
 * 
 * @author Emil Hukic
 * @author Tobias Hallberg
 */
public class Oval extends RectangularForm implements GeometricalForm {

	/**
	 * Creates an Oval with a position, height, width and color.
	 * @param x The X coordinate
	 * @param y The Y coordinate
	 * @param width The width
	 * @param height The height
	 * @param c The Color
	 * @throws IllegalPositionException Is thrown if trying to set a negative position
	 */
    public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.c = c;
    }


    /**
	  * Creates an Oval with the same position as an already given GeometricalForm, a new height, width and color.
	  * @param f A GeometricalForm
	  * @param width The width
	  * @param height The height
	  * @param c The color
	  */
    public Oval(GeometricalForm f, int width, int height, Color c) {
        x = f.getX();
        y = f.getY();
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
        return 0;
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
        g.drawOval(x,y,width,height);
        g.setColor(c);
    }
}