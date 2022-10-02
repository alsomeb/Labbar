package hederligaharrydel2;
import java.util.ArrayList;
import java.util.List;

public class HuvudProgram {

    public HuvudProgram() {
        FordonsAnnons mc1 = new McAnnons(100_000,
                "Yamaha r6 2022",
                "Jannes säljer sin Yamaha R6 då den är för snabb",
                2022,
                100,
                900,
                DrivTyp.KEDJA
                );

        FordonsAnnons mc2 = new McAnnons(250_000,
                "Kawasaki KXF 450 2022",
                "Schysst crosshoj perfekt bara att tuta och köra",
                2022,
                10,
                450,
                DrivTyp.KEDJA
        );


        // Lista av Publishable mcAnnonser, Interface Polymorfism, skalar ner varje objekt genom att bara peka på typer som har den datan jag behöver.
        List<Publishable> motorcykelAnnonser = new ArrayList<>( List.of(mc1, mc2) );
        printAllAdHeaders(motorcykelAnnonser);
        printAllAdds(motorcykelAnnonser);


        // Lista av Revenuable mc Annonser, skall bara räkna ut hur mycket harry tjänar!
        List<Revenuable> mcAnnonser = new ArrayList<>( List.of(mc1, mc2) );
        double revenue = getRevenueOfAds(mcAnnonser);
        System.out.println("Harrys revenue på dessa Mc Annonser: " + revenue + " SEK");

    }

    public void printAllAdHeaders(List<Publishable> allaFordonsAnnonser) {
        System.out.println("\nAlla Annonstitlar på Harrys hemsida");
        for(Publishable annons : allaFordonsAnnonser) {
            System.out.println(annons.printHeader());
        }
    }

    public void printAllAdds(List<Publishable> allaFordonsAnnonser) {
        System.out.println("\nAlla Annonser på Harrys Hemsida");
        for(Publishable annons : allaFordonsAnnonser) {
            System.out.println(annons.printCompleteAd());
        }
    }

    public double getRevenueOfAds(List<Revenuable> allaFordonsAnnonser) {
        double sum = 0;
        for(Revenuable add : allaFordonsAnnonser) {
            sum += add.calcuateRevenue();
        }
        return sum;
    }

    public static void main(String[] args) {
        new HuvudProgram();
    }
}
