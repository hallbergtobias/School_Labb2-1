package geometri;

import java.awt.*;

/**
 * Created by Emil H on 2014-11-23.
 */
public class Line extends RectangularForm implements GeometricalForm {
    private int x1;
    private int y1;
    private Color c;

    public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {
        super(new Point(x1,y1,c), x2, y2);
        this.c = c;
    }

    public int getWidth () {
        return x1-x;
    }

    public int getHeight () {
        return y-y1;
    }

    public int getPerimeter () {
        return (x1-x) + (y1-y);
    }

    public int getArea () {
        return 0;
    }

    public int compareTo( GeometricalForm f ) {
        if (this.getPerimeter() == f.getPerimeter()) {
            return 0;
        }  else if (this.getPerimeter() > f.getPerimeter()) {
            return 1;
        }   else {
            return -1;
        }
    }

    public void fill( Graphics g ) {
        g.drawLine(x, width, y, height);
        g.setColor(c);
    }
}
