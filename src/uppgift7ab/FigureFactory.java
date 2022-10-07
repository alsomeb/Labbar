package uppgift7ab;

public class FigureFactory {

    // MHA enum, för att få bort magic strings
    public Figure getFigure(FigureSpecification figureSpecification) {
        switch (figureSpecification) {
            case CIRCLE -> {
                return new Circle(new Point(5, 2), new Point(10, 2));
            }
            case LIKESIDEDTRIANGLE -> {
                return new LikeSidedTriangle(new Point(1,1),
                        new Point(5, 1),
                        new Point(3, 6));
            }
            case RECTANGLE -> {
                return new Rectangle(new Point(1,5),
                        new Point(5,5),
                        new Point(1, 2),
                        new Point(5, 2));
            }
            default -> { // If there is no match, the code of the default case is executed.
                return null;
            }
        }
    }
}
