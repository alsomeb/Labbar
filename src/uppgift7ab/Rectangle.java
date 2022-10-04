package uppgift7ab;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends Figure {

    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    public double getHeight() {
        return Math.abs(getA().getY() - getC().getY());
    }

    public double getWidth() {
        return Math.abs(getA().getX() - getB().getX());
    }

    @Override
    public double calcArea() {
        double formula = getHeight() * getWidth();
        BigDecimal bg = new BigDecimal(formula).setScale(1, RoundingMode.HALF_UP);
        return bg.doubleValue();
    }

}
