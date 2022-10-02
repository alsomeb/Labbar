package uppgift3abcd;

public class Course {
    private String name;
    private Teacher teacher;

    // Om kursen inte har en lärare ännu
    public Course(String name) {
        this.name = name;
    }


    // Getters n Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
