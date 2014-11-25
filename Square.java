package geometri;

import java.awt.*;

/**
 * Created by Emil H on 2014-11-23.
 */
public class Square extends RectangularForm implements GeometricalForm {


    public Square(int x, int y, int side, Color c) throws IllegalPositionException {
        this.x = x;
        this.y = y;
        this.width = side;
        this.height = side;
        this.c = c;
    }

    public Square(GeometricalForm f, int side, Color c) {
        x = f.getX();
        y = f.getY();
        this.height = side;
        this.width = side;
        this.c = c;
    }

    public int getPerimeter () {
        return height*4;
    }

    public int getArea () {
        return height*height;
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
        g.drawLine(x, y, x+width, y );
        g.drawLine(x, y, x, y+width);
        g.drawLine(x+width, y, x+width, y+width);
        g.drawLine(x, y+width, x+width, y+width);
        g.setColor(c);
    }
}
