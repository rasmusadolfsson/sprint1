package sprint1.uppgift3b;

import java.util.*;

public class Kurs{
    protected String name;
    protected Lärare lärare;
    protected List<Student> studerande;

    Kurs(String name){
        this.name = name;
        studerande = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public void setLärare(Lärare l) {
        this.lärare = l;
    }

    public List<Student> getStuderande() {
        return studerande;
    }

    public void addStuderande(Student students) {
        studerande.add(students);
    }
}