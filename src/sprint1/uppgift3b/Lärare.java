package sprint1.uppgift3b;

import java.util.List;


public class Lärare extends Person {
    private List<Kurs> undervisar;

    public Lärare(String name, int age){
        super(name, age);
    }

    public void addKurs(Kurs kurs){
        undervisar.add(kurs);
    }
}
