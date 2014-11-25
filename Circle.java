package geometri;

import java.awt.*;

/**
 * Created by Emil H on 2014-11-22.
 */
public class Circle extends RectangularForm implements GeometricalForm {

    public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException {
        this.x = x;
        this.y = y;
        this.width = diameter;
        this.height = diameter;
        this.c = c;
    }
    public Circle(GeometricalForm f, int diameter, Color c) {
        this.x = f.getX();
        this.y = f.getY();
        this.width = diameter;
        this.height = diameter;

    }
    private static final int n = 3;

    public int getWidth () {
        return width;
    }

    public int getHeight () {
        return height;
    }

    public int getPerimeter () {
        return 2 * n * getWidth()/2 ;
    }

    public int getArea () {
        return getWidth()/2*getWidth()/2*3;
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
        g.drawOval(x,y,width,height);
        g.setColor(c);
    }
}
