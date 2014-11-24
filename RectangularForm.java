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

    public RectangularForm (Point a, int b, int c){
        this.x = a.getX();
        this.y = a.getY();
        this.width = b;
        this.height = c;
    }

    public RectangularForm () {
        x = 0;
        y = 0;
    }

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

    }

    public void place( int x, int y )throws IllegalPositionException {

    }

}
