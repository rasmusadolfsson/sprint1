package sprint1.hederligeharry;

public class HusvagnsAnnons extends FordonsAnnons implements Publishable, Revenuable{
    protected boolean dusch;
    protected int antalSängar;

    public HusvagnsAnnons(int pris, String rubrik, String beskrivning, String märke, int årsmodell, int antalMil, boolean dusch, int antalSängar){
        super(pris, rubrik, beskrivning, märke, årsmodell, antalMil);
        this.dusch = dusch;
        this.antalSängar = antalSängar;
    }

    public boolean isDusch() {
        return dusch;
    }

    public void setDusch(boolean dusch) {
        this.dusch = dusch;
    }

    public int getAntalSängar() {
        return antalSängar;
    }

    public void setAntalSängar(int antalSängar) {
        this.antalSängar = antalSängar;
    }

    @Override
    public String GetAnnonsText() {
        return rubrik + " " + märke + " " + årsmodell + " " + beskrivning + "! " + antalMil + " mil, för " + " endast " + pris + "! " + "Antal sängar "
                + antalSängar + " Dusch " + dusch;
    }

    @Override
    public void PrintHeader() {
        System.out.println(rubrik + " " + märke + " Endast " + pris + "kr!");
    }

    @Override
    public void PrintCompleteAd() {
        System.out.println("Modell: " + märke + " " + årsmodell + " Pris: " + pris + "\nAntal mil: " + antalMil + " antal sänger: " + antalSängar + " dusch: " + dusch);

    }

    @Override
    public double calcuateRevenue() {
        return pris * 0.75;
    }
}
