package geometri;

import java.awt.*;

/**
 * Created by Emil H on 2014-11-23.
 */
public class Line extends RectangularForm implements GeometricalForm {

    public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {
        this.x = x1;
        this.y = y1;
        this.width = x2-x1;
        this.height = y2-y1;
        this.c = c;
    }

    public Line(GeometricalForm f1, GeometricalForm f2, Color c) {
        this.x = f1.getX();
        this.y = f1.getY();
        this.width = f2.getWidth();
        this.height = f2.getHeight();

    }
    public int getPerimeter () {
        return (width) + (height);
    }

    public int getArea () {
        return 0;
    }

    public int compareTo( GeometricalForm f ) {
        if (this.getPerimeter() == f.getPerimeter()) {
            return 0;
        }   else if (this.getPerimeter() > f.getPerimeter()) {
            return 1;
        }   else {
            return -1;
        }
    }

    public void fill( Graphics g ) {
        g.drawLine(x, y, width+x, height+y);
        g.setColor(c);
    }
}
