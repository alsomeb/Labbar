package uppgift1abc;


public class HuvudProgram {

    public HuvudProgram() {
        // Spec för uppgifterna 1a och 1b finns i min NOTION

        // CarOwners (Ärver från Person)
        CarOwner alex = new CarOwner("Alexander", "Uppsala", 31);
        CarOwner andreas = new CarOwner("Andreas", "Jakobsberg", 30);

        // Person lisa = new Person(); FUNKAR EJ PGA KLASSEN ABSTRACT, JAG VILL INTE SKAPA UPP DEN NÅGONSIN, den har bara information som vi behöver i CarOwner
        andreas.printDescription(); // <-- abstract funktion från Person
        System.out.println();

        // Säljer bilen får då en stund ingen ägare
        Car saab = new Car("JPG123", "Saab 95", alex);
        System.out.println(saab);
        saab.carSold();
        System.out.println(saab);

        // Andreas köper bilen
        saab.setCarOwner(andreas);
        System.out.println(saab);

        // Provar lite annat
        Person test = new CarOwner("Alex", "Odenplan", 33);
        System.out.println(test);
        // Får ej tillgång till favoriteColors listan
        // test.favoriteColors <-- FUNKAR EJ

        // Här funkar de printa Listan!
        CarOwner test2 = new CarOwner("Adde", "Odenplan", 23);
        System.out.println(test2.favoriteColors);
    }

    public static void main(String[] args) {
        // Behöver ej göra såhär, smaksak, för att lära ut innebörden av STATIC, så man inte använder det fel!!
        // Testar komma ur statisk kontext, hålla det objektOrienterat
        HuvudProgram program = new HuvudProgram();
    }
}
