package uppgift4abc;

import java.time.LocalDate;
import java.time.Month;


public class HuvudProgram {

    public HuvudProgram() {

        // Kurs
        Course javaOOP = new Course("Java OOP");

        // Lärare
        Teacher sigrun = new Teacher("Sigrun");

        // Lista med Studenter i denna kurs
        Student alex = new Student("Alex");
        Student felle = new Student("Felle");
        Student andreas = new Student("Andreas");
        Student gurra = new Student("Gurra");
        Student lisa = new Student("Lisa");

        // Bokar in Datum och Kurs
        CoursePlanner oopPlaner = new CoursePlanner(LocalDate.of(2022, Month.OCTOBER, 11), javaOOP);

        // Sigrun håller i kurstillfället
        oopPlaner.addTeacher(sigrun);

        // Lägger in studenter för Java OOP
        oopPlaner.addStudent(alex);
        oopPlaner.addStudent(felle);
        oopPlaner.addStudent(andreas);
        oopPlaner.addStudent(gurra);
        oopPlaner.addStudent(lisa);

        // Printar kursens deltagande till terminalen
        oopPlaner.printCourseInfo();

        // Byter lärare och Datum
        oopPlaner.changeTeacher(new Teacher("David"));
        oopPlaner.setDate(LocalDate.of(2022, Month.OCTOBER, 10));

        // Printar ut nytt
        oopPlaner.printCourseInfo();

    }


    // Main metod, kommer ur en statisk kontext
    public static void main(String[] args) {
       new HuvudProgram();
    }
}

