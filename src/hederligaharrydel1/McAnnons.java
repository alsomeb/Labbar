package hederligaharrydel1;

public class McAnnons extends FordonsAnnons {

    private int motorVolym;
    private DrivTyp drivTyp; // ENUM


    // Constructor
    public McAnnons(int pris, String rubrik, String beskrivning, int årsModell, int antalMil, int motorVolym, DrivTyp drivTyp) {
        super(pris, rubrik, beskrivning, årsModell, antalMil);
        this.motorVolym = motorVolym;
        this.drivTyp = drivTyp;
    }

    @Override
    public String getAnnonsText() {
        return "Rubrik: " + getRubrik()
                + "\nBeskrivning: " + getBeskrivning()
                + "\nPris: " + getPris()
                + "\nÅrsmodell: " + getÅrsModell()
                + "\nMil: " + getAntalMil()
                + "\nMotorvolym: " + motorVolym
                + "\nDrivtyp: " + drivTyp.toString().toLowerCase() + "\n";
    }


    // Getters n Setters
    public int getMotorVolym() {
        return motorVolym;
    }

    public void setMotorVolym(int motorVolym) {
        this.motorVolym = motorVolym;
    }

    public DrivTyp getDrivTyp() {
        return drivTyp;
    }

    public void setDrivTyp(DrivTyp drivTyp) {
        this.drivTyp = drivTyp;
    }
}
