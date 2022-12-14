package uppgift7ab;

import java.util.LinkedList;
import java.util.List;

public class HuvudProgram {

    public HuvudProgram() {

        // Circle
        Figure circle = new Circle(new Point(5, 2), new Point(10, 2));


        // Rectangle
        Figure rect = new Rectangle(new Point(1,5),
                new Point(5,5),
                new Point(1, 2),
                new Point(5, 2));
        rect.calcArea();


        // Triangle
        Figure triangle = new LikeSidedTriangle(new Point(1,1),
                new Point(5, 1),
                new Point(3, 6));


        List<Figure> figures = new LinkedList<>(List.of(rect, triangle, circle));

        // Loopar genom listan och ger arean för varje figur
        figures.forEach(figure -> printAreaOfFigure(figure));


        // Figure Factory
        System.out.println("\n----FACTORY PATTERN----");
        FigureFactory factory = new FigureFactory(); // Klass som skapar figurer mha en ENUM, skippa magic strings

        List<Figure> figurerna = new LinkedList<>();
        figurerna.add(factory.getFigure(FigureSpecification.CIRCLE));
        figurerna.add(factory.getFigure(FigureSpecification.RECTANGLE));
        figurerna.add(factory.getFigure(FigureSpecification.LIKESIDEDTRIANGLE));

        for(Figure figur : figurerna) {
            printAreaOfFigure(figur);
        }


    }

    public void printAreaOfFigure(Figure figure) {
        System.out.println("\nArea for " + figure.getClass().getSimpleName()); // getSimpleName() ger bara KlassNamnet
        System.out.println(figure.calcArea());
    }

    public static void main(String[] args) {
/*
        Definiera en klass Punkt som beskriver en punkt (x,y) i ett tvådimensionellt koordinatsystem.
        Deklarera sedan en abstrakt klass ”Figur” som innehåller en startpunkt. Låt klassen Figur ha en
        abstrakt metod, ”Area”.
        Definiera ett antal subklasser till Figur, t.ex. Cirkel, Liksidig Triangel, och Rektangel. Ge dem
        lämpliga instansvariabler. Låt varje subklass ha en egen implementation av metoden Area.
        I ditt huvudprogram, skapa några olika figurer. Deklarera slutligen en lista av ”Figur” enligt följande:
        List<Figur> figurlista = new LinkedList<>();
        Iterera över listan och skriv ut vilken sort varje figur är av och figurens area.
*/

        new HuvudProgram();

    }



}
