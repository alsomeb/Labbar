package uppgift3abcd;

public class Teacher extends Person{

    public Teacher(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}

// TEST github SSH