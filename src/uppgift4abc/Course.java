package uppgift4abc;

public class Course {
    private String name;

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

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
