package hederligaharrydel1;

public abstract class FordonsAnnons {
    private int pris;
    private String rubrik;
    private String beskrivning;
    private int årsModell;
    private int antalMil;


    // Konstruktor
    public FordonsAnnons(int pris, String rubrik, String beskrivning, int årsModell, int antalMil) {
        this.pris = pris;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
        this.årsModell = årsModell;
        this.antalMil = antalMil;
    }


    public abstract String getAnnonsText();


    // Getters n Setters
    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getRubrik() {
        return rubrik;
    }

    public void setRubrik(String rubrik) {
        this.rubrik = rubrik;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public void setBeskrivning(String beskrivning) {
        this.beskrivning = beskrivning;
    }

    public int getÅrsModell() {
        return årsModell;
    }

    public void setÅrsModell(int årsModell) {
        this.årsModell = årsModell;
    }

    public int getAntalMil() {
        return antalMil;
    }

    public void setAntalMil(int antalMil) {
        this.antalMil = antalMil;
    }
}
