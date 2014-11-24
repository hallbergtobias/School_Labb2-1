package geometri;

import java.awt.*;

/**
 * Created by Emil H on 2014-11-23.
 */
public class Square extends RectangularForm implements GeometricalForm {

    private int side;

    public Square(int x, int y, int side, Color c) throws IllegalPositionException {
        super(new Point(x, y, c), new Point(side, side, c));
        this.side = side;
        this.c = c;
    }

    public Square(GeometricalForm f, int side, Color c) {
        x = f.getX();
        y = f.getY();
        this.side = side;
    }

    public int getPerimeter () {
        return side*4;
    }

    public int getArea () {
        return side*side;
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
        g.drawLine(x, y, x+side, y );
        g.drawLine(x, y, x, y+side);
        g.drawLine(x+side, y, x+side, y+side);
        g.drawLine(x, y+side, x+side, y+side);
        g.setColor(c);
    }
}
