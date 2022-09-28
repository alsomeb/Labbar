package uppgift6;

public class HuvudProgram {
    public static void main(String[] args) {

        // TIPS
        // Animal->Mammal->Dog->Pitbull
        // Animal->Reptile->Crocodile->PansarKrokodil

        // - Uppgift 6 – Polymorfism
        // - Olika sorters djur kan beskrivas med hjälp av klasser och arv. Definiera några olika djur.
        // - Utgå från en abstrakt klass Djur och härled de olika djuren från denna.
        // - Använd gärna mellanliggande klasser som t.ex Däggdjur, Kräldjur, Fågel, Fisk etc.
        // - Låt klassen Djur ha en abstrakt metod ”läte” som beskriver hur ett djur låter. Implementera denna metod i subklasserna.
        // - Deklarera sedan en array eller lista med djur
        // - Skriv satser för att löpa igenom arrayen och låta alla djuren ge ifrån sig ett läte.


        PansarKrokodil bengt = new PansarKrokodil();
        Pitbull tord = new Pitbull();

        Animal[] allaDjur = {bengt, tord};

        for(Animal animal : allaDjur) {
            animal.makeNoise();
        }

    }
}
