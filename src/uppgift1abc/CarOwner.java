package uppgift1abc;

import java.util.ArrayList;
import java.util.List;

public class CarOwner extends Person {

    ArrayList<String> favoriteColors = new ArrayList<>(List.of("Red", "Green"));

    public CarOwner(String name, String adress, int age) {
        super(name, adress, age); // attribut ärvs från super klassen Person
    }

    @Override
    public void printDescription() {
        System.out.println("Owner: " + getName() + "\nAdress: " + getAdress() + "\nAge: " + getAge());
    }

    // Getters & Setter samt toString() ärvs från Person

}
