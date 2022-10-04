package uppgift7ab;


public class LikeSidedTriangle extends Figure{
    private final Point a;
    private final Point b;
    private final Point c;

    public LikeSidedTriangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getBase() {
        return Math.abs(getA().getX() - getB().getX());
    }

    public double getHeight() {
        return Math.abs(getA().getY() - getC().getY());
    }



    @Override
    public double calcArea() {
        return (getBase() * getHeight()) / 2;
    }
}
