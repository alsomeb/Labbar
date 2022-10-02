package uppgift4abc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class CoursePlanner {
    protected LocalDate date;
    protected Course course;
    protected Teacher teacher;
    protected List<Student> students;


    // Bara datum och kurs är relevanta för att instansiera
    public CoursePlanner(LocalDate date, Course course) {
        this.date = date;
        this.course = course;
        students = new ArrayList<>(); // Vi gör en metod för att lägga in studenter
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void changeTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void printCourseInfo() {
        System.out.println("\n" + course.getName() + " with " + teacher.getName() + " - " + getDateFull());
        System.out.println("Students that will be attending this course:");
        printAllStudents();
    }

    private void printAllStudents() {
        students.forEach(student -> System.out.println(student));
    }

    // Relevanta Getters N Setters
    public String getDateFull() {
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CoursePlanner{" +
                "date=" + date +
                ", course=" + course +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
