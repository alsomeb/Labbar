package uppgift3abcd;

public class Participation {

    private Student student;
    private Course course;

    public Participation(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "Participation{" +
                "student=" + student +
                ", course=" + course +
                '}';
    }
}
