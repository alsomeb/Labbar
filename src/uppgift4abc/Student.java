package uppgift4abc;

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}
