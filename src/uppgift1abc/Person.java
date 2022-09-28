package uppgift1abc;

public abstract class Person {

    // Inkapsling
    private String name;
    private String adress;
    private int age;


    // Konstruktor
    public Person(String name, String adress, int age) {
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void printDescription(); // Defineras här utan kropp, alla klasser som ärver från person MÅSTE implementera denna metod, där man sedan kan def vad den gör!

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                '}';
    }
}
