package hederligaharrydel2;

public class HusvagnsAnnons extends FordonsAnnons {

    private boolean dusch;
    private int bäddar;

    // Constructor
    public HusvagnsAnnons(int pris, String rubrik, String beskrivning, int årsModell, int antalMil, boolean dusch, int bäddar) {
        super(pris, rubrik, beskrivning, årsModell, antalMil);
        this.dusch = dusch;
        this.bäddar = bäddar;
    }


    @Override
    public String getAnnonsText() {
        return "Rubrik: " + getRubrik()
                + "\nBeskrivning: " + getBeskrivning()
                + "\nPris: " + getPris()
                + "\nÅrsmodell: " + getÅrsModell()
                + "\nMil: " + getAntalMil()
                + "\nBäddar: " + getBäddar()
                + "\nDusch: " + hasDusch() + "\n";

    }

    public String hasDusch() {
        return isDusch() ? "Ja" : "Nej"; // Ternary Operator
    }


    // Getters n Setters
    public boolean isDusch() {
        return dusch;
    }

    public void setDusch(boolean dusch) {
        this.dusch = dusch;
    }

    public int getBäddar() {
        return bäddar;
    }

    public void setBäddar(int bäddar) {
        this.bäddar = bäddar;
    }


    // INTERFACE
    @Override
    public String printHeader() {
        return getRubrik();
    }

    @Override
    public String printCompleteAd() {
        return getAnnonsText();
    }

    @Override
    public double calcuateRevenue() {
        return getPris() * 0.75;
    }
}
