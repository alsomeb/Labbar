package uppgift7ab;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Figure implements FormatDouble {
    // Vi säger att det är samma y kordinat på båda punkterna
    private final Point a;
    private final Point b;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public double getRadius() {
        return Math.abs(getA().getX() - getB().getX());
    }

    @Override
    public double calcArea() {
        double area = Math.pow(getRadius(), 2) * Math.PI;
        return formatter(area, 1);
    }

    // Interface some avrundar dynamiskt number till dynamiskt antal decimaler
    @Override
    public double formatter(double number, int decimalPlaces) {
        BigDecimal bg = new BigDecimal(number).setScale(decimalPlaces, RoundingMode.HALF_UP);
        return bg.doubleValue();
    }
}
