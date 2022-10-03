package sprint1.uppgift3b;

import java.util.ArrayList;
import java.util.List;

public class uppgift3b {

    uppgift3b() {

        Lärare Lasse = new Lärare("Lasse", 67);
        Lärare Eva = new Lärare("Eva", 49);
        Student s1 = new Student("Micke", 20);
        Student s2 = new Student("Torkel", 21);
        Student s3 = new Student("Kärstin", 65);
        Student s4 = new Student("Greta", 24);
        Student s5 = new Student("Pippi", 19);
        Student s6 = new Student("Nils", 23);
        Kurs kurs1 = new Kurs("Svenska");
        Kurs kurs2 = new Kurs("Engelska");
        Kurs kurs3 = new Kurs("Matematik");

        kurs1.addStuderande(s1);
        //s1.addKurs(kurs1);
        s1.getKurser();

        kurs1.setLärare(Lasse);
        kurs1.addStuderande(s1);
        kurs1.addStuderande(s2);
        kurs1.addStuderande(s3);
        kurs1.addStuderande(s4);
        kurs2.setLärare(Eva);
        kurs2.addStuderande(s2);
        kurs2.addStuderande(s5);
        kurs2.addStuderande(s6);
        kurs3.setLärare(Lasse);
        kurs3.addStuderande(s2);
        kurs3.addStuderande(s1);
        kurs3.addStuderande(s4);
        kurs3.addStuderande(s5);

        System.out.println(kurs1.getName()+" "+kurs1.getLärare().getName());
        printKurs(kurs1.studerande);
    }

    public void printKurs(List<Student> studenter) {
        for(Student s: studenter){
            System.out.println("Student: "+s.getName());

        }
    }
    public static void main (String[]args){

        uppgift3b u3 = new uppgift3b();
    }
}
