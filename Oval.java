package geometri;

import java.awt.*;

/**
 * Created by Emil H on 2014-11-23.
 */
public class Oval extends RectangularForm implements GeometricalForm {

    public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException {
        super(new Point(x,y,c), new Point (x,y,c));
    }
    public Oval(GeometricalForm f, int width, int height, Color c) {
        x = f.getX();
        y = f.getY();
        this.width = width;
        this.height = height;
        this.c = c;
    }

    public int getPerimeter () {
        return 0;
    }

    public int getArea () {
        return 0;
    }

    public int compareTo( GeometricalForm f ) {
        if (this.getArea() == f.getArea()) {
            return 0;
        }  else if (this.getArea() > f.getArea()) {
            return 1;
        }   else {
            return -1;
        }
    }

    public void fill( Graphics g ) {

    }
}