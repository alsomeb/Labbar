package uppgift2ab;

import java.util.ArrayList;
import java.util.List;

public class HuvudProgram {
    public static void main(String[] args) {
        /*
            - https://studentportal.nackademin.se/pluginfile.php/297512/mod_resource/content/0/%C3%96vningsuppgifter%20Sprint1%20JAVA22.pdf

              Uppgift 2 A Arv:
            - Implementera följande klassdiagram.
            - Detta sätt att rita kallas UML och är vanligt förekommande för att illustrera klasshierarkier.
            - Överst, i varje ruta, står klassnamnet på de klasser ni ska skriva.
            - I mitten finns instansvariablerna. Nederst instansmetoderna i varje klass.
            - Triangeln betyder att nedanstående klasser ärver ovanstående.
            - Ni ska alltså skriva nedanstående 5 klasser, med de instansvariabler och instansmetoder som anges (och också arvet).
            - Ni behöver inte lägga tid på vettig kod för ”sväng”-metoden.
            - Testa att använda super constructor.

            - (EXTRA ALEX) skapa en metod som gör ngt, kanske plussar något - KLAR:
            - Skriv ett JUnit Test på den metoden - KLAR!



            Uppgift 2b – Abstrakt superklass, polymorfism
           - Låt Fordon bli abstrakt
           - Lägg till den abstrakta metoden printMe() i Fordon och implementera den i de olika subklasserna.
           - printMe() ska skriva ut vikt, hastighet och övriga data för varje subklass.
           - Lägg sedan till ett huvudprogram som skapar upp ett fordon av varje sort.
           - Lägg till en metod som skriver ut data om de fordon du skapat.
           - Anropa utskriftsmetoden från ditt huvudprogram
         */


        // Valde göra såhär för är BARA intresserad av printMe() metoden, inget annat i detta fall!
        Fordon bil = new Bil(150, 1500, 6, 1);
        Fordon cykel = new Cykel(30, 10, 21, 3);
        Fordon tåg = new Tåg(300, 50000, 5);
        Fordon båt = new Båt(100, 1000, 5000);

        ArrayList<Fordon> listaAvFordon = new ArrayList<>(
                List.of(bil, cykel, tåg, båt)
        );

        listaAvFordon.forEach(fordon -> printFordon(fordon));

    }

    public static void printFordon(Fordon fordon) {
        fordon.printMe();
    }
}
