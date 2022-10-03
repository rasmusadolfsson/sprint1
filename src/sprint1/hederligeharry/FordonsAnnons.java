package sprint1.hederligeharry;

public abstract class FordonsAnnons {
    protected int pris;
    protected String rubrik;
    protected String beskrivning;
    protected String märke;
    protected int årsmodell;
    protected int antalMil;

    FordonsAnnons(int pris, String rubrik, String beskrivning, String märke, int årsmodell, int antalMil) {
        this.pris = pris;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
        this.märke = märke;
        this.årsmodell = årsmodell;
        this.antalMil = antalMil;
    }

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

    public String getMärke() {
        return märke;
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }

    public void setÅrsmodell(int årsmodell) {
        this.årsmodell = årsmodell;
    }

    public int getAntalMil() {
        return antalMil;
    }

    public void setAntalMil(int antalMil) {
        this.antalMil = antalMil;
    }

    public abstract String GetAnnonsText();
}
