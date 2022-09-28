package uppgift2ab;

abstract class Fordon {
    private int hastighet; // or protected making them accessible in the same package and subclasses.
    private int vikt;


    public Fordon(int hastighet, int vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    // Abstract metod printMe()
    abstract void printMe();


    // Getters n Setters
    public int getHastighet() {
        return hastighet;
    }

    public void setHastighet(int hastighet) {
        this.hastighet = hastighet;
    }

    public int getVikt() {
        return vikt;
    }
}
