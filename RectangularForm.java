package geometri;

import java.awt.Color;

/**
 * Created by Emil H on 2014-11-24.
 */
public abstract class RectangularForm implements GeometricalForm {

    int x;
    int y;
    int width;
    int height;
    Color c;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Color getColor() {
        return c;
    }

    public void move( int dx, int dy ) throws IllegalPositionException {
        this.x += dx;
        this.y += dy;
    }

    public void place( int x, int y )throws IllegalPositionException {
        this.x = x;
        this.y = y;
    }

}
