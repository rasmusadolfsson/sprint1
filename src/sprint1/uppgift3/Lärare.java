package sprint1.uppgift3;

public class Lärare extends Person{
    private Kurs[] undervisar;
    private int kursCounter = 0;

    public Lärare(String name, int age){
        super(name, age);
    }
    public void addKurs(Kurs kurs){
        undervisar[kursCounter++] = kurs;

    }
    public Kurs[] getUndervisar(){
        return undervisar;
    }
}
