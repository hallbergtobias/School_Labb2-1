package geometri;

import java.awt.*;

/**
 * Created by Emil H on 2014-11-23.
 */
public class Rectangle extends RectangularForm implements GeometricalForm {



    public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.c = c;

    }
    public Rectangle(GeometricalForm f, int width, int height, Color c) {
        this.x = f.getX();
        this.y = f.getY();
        this.width = width;
        this.height = height;
        this.c = c;
    }

    public int getPerimeter () {
        return 0;
    }

    public int getArea () {
        return height*width;
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
        g.drawLine(x, y, x+width, y);
        g.drawLine(x, y, x, y+height);
        g.drawLine(x, y+height, x+width, y+height);
        g.drawLine(x+width, y, x+width, y+height);
        g.setColor(c);
    }
}