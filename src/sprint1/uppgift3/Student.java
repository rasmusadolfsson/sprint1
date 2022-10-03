package sprint1.uppgift3;

public class Student extends Person{
    private Kurs[] studies;
    private int kursCounter = 0;

    public Student(String name, int age){
        super(name, age);
    }

    public void addKurs(Kurs kurs){
        studies[kursCounter++] = kurs;
    }
    public Kurs[] getKurser(){
        return studies;
    }
}
