package geometri;

import java.awt.*;

/**
 * Created by Emil H on 2014-11-22.
 */
public class Point extends RectangularForm implements GeometricalForm {

    public Point(int x, int y, Color c) throws IllegalPositionException {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public Point(GeometricalForm f, Color c) {
        this.x = f.getX();
        this.y = f.getY();
        this.c = c;
    }

    public int getPerimeter() {
        return 0;
    }

    public int getArea() {
        return 0;
    }

    public int compareTo(GeometricalForm f) {
        if (this.getArea() == f.getArea()) {
            return 0;
        } else if (this.getArea() > f.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }

    public void fill(Graphics g) {
    }
}