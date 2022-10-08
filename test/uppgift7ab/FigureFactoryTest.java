package uppgift7ab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureFactoryTest {
    // Skapar upp fabriken som vi kan återanvända i testerna
    FigureFactory testFactory = new FigureFactory();

    @Test
    void testGetFigureAsCircleCreatesACircle() {
        Figure expected  = new Circle(new Point(5, 2), new Point(10, 2));
        Figure actual = testFactory.getFigure(FigureSpecification.CIRCLE);

        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName()); // har samma klass namn
        assertInstanceOf(Circle.class, actual); // är en instans av Circle

        // samma som ovan fast utan JUnits hjälp metod för den har inte en NOT metod, kan nog bygga liknande med assertTrue/False och assertEquals/NotEquals
        assert(!(actual instanceof LikeSidedTriangle));
        assert(!(actual instanceof Rectangle));
    }

    @Test
    void testGetFigureAsRectangleCreatesARectangle() {
        Figure expected = new Rectangle(new Point(1,5),
                new Point(5,5),
                new Point(1, 2),
                new Point(5, 2));

        Figure actual = testFactory.getFigure(FigureSpecification.RECTANGLE);

        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
        assertInstanceOf(Rectangle.class, actual);
        assert(!(actual instanceof Circle));
        assert(!(actual instanceof LikeSidedTriangle));
    }

    @Test
    void testGetFigureAsRectangleCreatesALikeSidedTriangle() {
        Figure expected = new LikeSidedTriangle(new Point(1,1),
                new Point(5, 1),
                new Point(3, 6));

        Figure actual = testFactory.getFigure(FigureSpecification.LIKESIDEDTRIANGLE);

        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
        assertInstanceOf(LikeSidedTriangle.class, actual);
        assert(!(actual instanceof Circle));
        assert(!(actual instanceof Rectangle));
    }

}