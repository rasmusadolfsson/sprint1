package sprint1.uppgift3b;

import java.util.*;

public class Student extends Person {
    protected List<Kurs> studies;

    public Student(String name, int age){
        super(name, age);
        studies = new ArrayList<>();
    }
    public void addKurs(Kurs kurs){
        studies.add(kurs);
    }
    public List<Kurs> getKurser(){
        return studies;
        }
    }

