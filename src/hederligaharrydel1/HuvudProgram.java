package hederligaharrydel1;

import java.util.ArrayList;
import java.util.List;

public class HuvudProgram {

    public static void main(String[] args) {
        // Uppgift spec på
        // https://studentportal.nackademin.se/pluginfile.php/297512/mod_resource/content/0/%C3%96vningsuppgifter%20Sprint1%20JAVA22.pdf


        // Bil Annons
        BilAnnons saaben = new BilAnnons(15000,
                "Fin Saab 95 säljes",
                "Går perfekt, inga problem sedan innan",
                1995,
                20000,
                "Röd",
                true, true);

        BilAnnons volvon = new BilAnnons(15000,
                "Ful Volvo v70 säljes",
                "Går sådär, lite fel här och där, rost.",
                1991,
                23000,
                "Grön",
                false, true);

        BilAnnons bmw = new BilAnnons(15000,
                "Kung Bmw säljes",
                "Går som ett skott, burna sönder",
                2005,
                20555,
                "Grön",
                true, false);

        BilAnnons audin = new BilAnnons(150000,
                "Galen Audi RS6 säljes",
                "Sänkt och trimmad som fan med dubbel turbo",
                2022,
                1337,
                "Blå",
                false, false);


        // Husvagnar
        HusvagnsAnnons h1 = new HusvagnsAnnons(200000,
                "Säljer en fin husvagn",
                "Väldigt fin utvändigt och invändigt",
                2005,
                15000,
                true,
                2);

        HusvagnsAnnons h2 = new HusvagnsAnnons(200000,
                "Säljer en stor husvagn",
                "Väldigt stor husvagn inga fel sedan innan",
                2010,
                2500,
                false,
                3);


        McAnnons mc1 = new McAnnons(50000,
                "Säljer nybörjar hojj",
                "Schysst hojj inga fel",
                1991,
                1500,
                600,
                DrivTyp.KEDJA);

        McAnnons mc2 = new McAnnons(50000,
                "Säljer galen hojj",
                "Schysst hojj snabb som fan",
                2008,
                150,
                900,
                DrivTyp.KARDAN);

        // Lista med FordonsAnnonser
        ArrayList<FordonsAnnons> annonser = new ArrayList<>(
                List.of(saaben, volvon, bmw, audin, h1, h2, mc1, mc2));

        // Använder printAnnonsTexter() för att Skriva ut
        printAnnonsTexter(annonser);

    }
    public static void printAnnonsTexter (ArrayList<FordonsAnnons> list) {
        list.forEach( annons -> System.out.println(annons.getAnnonsText() ));
    }
}
