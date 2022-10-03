package sprint1.uppgift3;

public class Kurs{
    private String name;
    private Lärare lärare;
    private Student[] studerande;
    private int studentCounter = 0;

    Kurs(String name){
        this.name = name;
        studerande = new Student[10];
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

    public Student[] getStuderande() {
        return studerande;
    }

    public void addStuderande(Student students) {
        studerande[studentCounter++] = students;
    }


}
