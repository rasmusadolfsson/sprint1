package sprint1.uppgift1;

public class Car {
    private String regNr;
    private String model;
    private String manufacturer;
    private Carowner owner;

    public Car(String ma, String m, String r){
        manufacturer = ma;
        model = m;
        regNr = r;
    }

    public void ownedBy(Carowner newOwner){
        owner = newOwner;
    }

    public void sold(){
        owner = null;

    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Carowner getOwner() {
        return owner;
    }

    public void setOwner(Carowner owner) {
        this.owner = owner;
    }
}
