package uppgift1abc;

public class Car {
    private String regNr;
    private String modelName;
    private CarOwner carOwner; // har metoder från person och carowner osv

    // Konstruktor
    public Car(String regNr, String modelName, CarOwner carOwner) {
        this.regNr = regNr;
        this.modelName = modelName;
        this.carOwner = carOwner;
    }


    // Funktion som sätter carOwner till null (såld)
    public void carSold() {
        setCarOwner(null);
    }

    // Getters n Setters
    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public CarOwner getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(CarOwner carOwner) {
        this.carOwner = carOwner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNr='" + regNr + '\'' +
                ", modelName='" + modelName + '\'' +
                ", carOwner=" + carOwner +
                '}';
    }
}
