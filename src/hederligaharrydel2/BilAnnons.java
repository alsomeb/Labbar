package hederligaharrydel2;

public class BilAnnons extends FordonsAnnons {

    private String färg;
    private boolean sommarDäck;
    private boolean vinterDäck;


    // Konstruktor
    public BilAnnons(int pris, String rubrik, String beskrivning, int årsModell, int antalMil, String färg, boolean sommarDäck, boolean vinterDäck) {
        super(pris, rubrik, beskrivning, årsModell, antalMil);
        this.färg = färg;
        this.sommarDäck = sommarDäck;
        this.vinterDäck = vinterDäck;
    }

    @Override
    public String getAnnonsText() {
        return "Rubrik: " + getRubrik()
                + "\nBeskrivning: " + getBeskrivning()
                + "\nPris: " + getPris()
                + "\nÅrsmodell: " + getÅrsModell()
                + "\nFärg: " + getFärg()
                + "\nMil: " + getAntalMil()
                + "\nDäck: " + getDäck() + "\n";

    }




    public String getDäck() {
        String däck = "";

        if(sommarDäck && vinterDäck) {
            däck = "Både sommar & vinterdäck ingår";
        } else if (sommarDäck) {
            däck = "Bara sommardäck ingår";
        } else if (vinterDäck) {
            däck = "Bara vinterdäck ingår";
        } else {
            däck = "Inga ytterliggare däck ingår förutom dem på bilen";
        }

        return däck;
    }


    //INTERFACE
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

    // Getters n Setters
    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public boolean isSommarDäck() {
        return sommarDäck;
    }

    public void setSommarDäck(boolean sommarDäck) {
        this.sommarDäck = sommarDäck;
    }

    public boolean isVinterDäck() {
        return vinterDäck;
    }

    public void setVinterDäck(boolean vinterDäck) {
        this.vinterDäck = vinterDäck;
    }
}
