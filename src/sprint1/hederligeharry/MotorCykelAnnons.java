package sprint1.hederligeharry;

public class MotorCykelAnnons extends FordonsAnnons implements Publishable, Revenuable{
    protected String motorVolym;
    protected String drivtyp;

    public MotorCykelAnnons(int pris, String rubrik, String beskrivning, String märke, int årsmodell, int antalMil, String motorVolym, String drivtyp){
        super(pris, rubrik, beskrivning, märke, årsmodell, antalMil);
        this.motorVolym = motorVolym;
        this.drivtyp = drivtyp;
    }

    public String getMotorVolym() {
        return motorVolym;
    }

    public void setMotorVolym(String motorVolym) {
        this.motorVolym = motorVolym;
    }

    public String getDrivtyp() {
        return drivtyp;
    }

    public void setDrivtyp(String drivtyp) {
        this.drivtyp = drivtyp;
    }

    @Override
    public String GetAnnonsText() {
        return rubrik + " " + märke + " " + årsmodell + " " + " motorstorlek "+ motorVolym + " drivtyp " + drivtyp + " " + beskrivning + "! " + antalMil + " mil, för " + " endast " + pris + "!";
    }

    @Override
    public void PrintHeader() {
        System.out.println(rubrik + " " + märke + " Endast " + pris + "kr!");
    }

    @Override
    public void PrintCompleteAd() {
        System.out.println("Modell: " + märke + " " + årsmodell + " Pris: " + pris + "\nAntal mil: " + antalMil + " Motorvolym: " + motorVolym + " drivtyp: " + drivtyp);
    }

    @Override
    public double calcuateRevenue() {
        return (pris * 0.9) * 0.75;
    }
}
