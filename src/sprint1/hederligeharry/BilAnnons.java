package sprint1.hederligeharry;

public class BilAnnons extends FordonsAnnons implements Publishable, Revenuable {
    protected String färg;
    protected boolean sommarDäck;
    protected boolean vinterDäck;


    public BilAnnons(int pris, String rubrik, String beskrivning, String märke, int årsmodell, int antalMil, String färg, boolean sommarDäck, boolean vinterDäck){
        super(pris, rubrik, beskrivning, märke, årsmodell, antalMil);
        this.färg = färg;
        this.sommarDäck = sommarDäck;
        this.vinterDäck = vinterDäck;
    }

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

    @Override
    public String GetAnnonsText() {
        return rubrik + " " +  färg + " " + märke + " " + årsmodell + " " + beskrivning + "! " + antalMil + " mil, för " + " endast " + pris + "! " + "Sommardäck: "
                + sommarDäck + " Vinterdäck: " + vinterDäck;
    }

    @Override
    public void PrintHeader() {
        System.out.println(rubrik + " " + märke + " Endast " + pris + "kr!");
    }

    @Override
    public void PrintCompleteAd() {
        System.out.println("Modell: " + märke + " " + årsmodell + " Färg: " + färg + "\nAntal mil: " + antalMil + " Pris: " + pris + " Medföljande sommardäck: " + sommarDäck + " Medföljande vinterdäck: " + vinterDäck);

    }

    @Override
    public double calcuateRevenue() {
        return pris * 0.75;
    }
}
