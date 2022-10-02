package uppgift3abcd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HuvudProgram {

    public HuvudProgram() {
        // Kurser
        Course java = new Course("Java");
        Course net = new Course(".NET");

        // Lärare
        Teacher sigrun = new Teacher("Sigrun");
        java.setTeacher(sigrun);
        net.setTeacher(sigrun);

        // Studenter och lagt dem i en lista
        Student andreas = new Student("Andreas");
        Student gustaf = new Student("Gustaf");
        Student anna = new Student("Anna");
        Student per = new Student("Per");


        // 3d Deltagande klassen
        Participation p1 = new Participation(andreas, java);
        Participation p2 = new Participation(gustaf, java);
        Participation p3 = new Participation(anna, java);
        Participation p4 = new Participation(per, net);
        Participation p5 = new Participation(andreas, net);

        List<Participation> allParticipants = new ArrayList<>(List.of(p1, p2, p3, p4, p5));
        allParticipants.forEach(participation -> System.out.println(participation));

        // Samma med utan streams
        System.out.println();
        printCoursesOfSpecificStudent(andreas, allParticipants);

        // Hämta lista över andreas kurser MHA Streams
        System.out.println();
        List<Participation> andreasPart = getCoursesByStudent(andreas, allParticipants);
        andreasPart.forEach(participation -> System.out.println(participation));

        // Printa kurs samt lärare och lista av students
        printCourse(java, allParticipants);

        //Printa allt
        System.out.println();
        printAllCourses(allParticipants);
    }


    public void printCoursesOfSpecificStudent(Student student, List<Participation> allParticipants) {
        for (Participation participant : allParticipants) {
            if (participant.getStudent() == student) {
                System.out.println("Course: " + participant.getCourse().getName());
            }
        }
    }

    // Samma som ovan fast med Streams och returnerar en Lista inte printar
    public List<Participation> getCoursesByStudent(Student specificStudent, List<Participation> allParticipants) {
        return allParticipants.stream()
                .filter(student -> student.getStudent().equals(specificStudent))
                .collect(Collectors.toList());
    }


    // Skapa en print funktion som tar en Kurs och sedan skriver ut kursens lärare och en lista
    // av alla Studenter som går kursen.
    public void printCourse(Course course, List<Participation> allParticipants) {
        System.out.println("\n" + course.getName());
        System.out.println("Teacher: " + course.getTeacher());
        System.out.println("\nStudents:");

        for (Participation participant : allParticipants) {
            if (participant.getCourse() == course) {
                System.out.println(participant.getStudent());
            }
        }
    }


    // Skapa en ”jätteutskriftsfunktion” som skriver ut samtliga studenter och efter varje student
    // listas alla kurser som studenten går på.
    public void printAllCourses(List<Participation> allParticipants) {
        for (Participation participant : allParticipants) {
            Student currentStudent = participant.getStudent();
            System.out.println("Student: " + currentStudent);
            printCoursesOfSpecificStudent(currentStudent, allParticipants);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new HuvudProgram();
    }
}

