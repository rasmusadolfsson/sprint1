package sprint1.uppgift3;

import java.util.Arrays;

public class uppgift3a {

    uppgift3a() {

        Lärare Lasse = new Lärare("Lasse", 67);
        Student s1 = new Student("Micke", 20);
        Student s2 = new Student("Torkel", 21);
        Student s3 = new Student("Kärstin", 65);
        Student s4 = new Student("Greta", 24);
        Kurs kurs1 = new Kurs("Svenska");
        Kurs kurs2 = new Kurs("Matematik");

        kurs1.setLärare(Lasse);
        kurs1.addStuderande(s1);
        kurs1.addStuderande(s2);
        kurs1.addStuderande(s3);
        kurs1.addStuderande(s4);

        kurs2.setLärare(Lasse);
        kurs2.addStuderande(s3);
        kurs2.addStuderande(s2);

        printKurs(kurs2);
    }

    public void printKurs(Kurs kurs) {
        System.out.println("Namn på kursen: " + kurs.getName());
        System.out.println("Namn på läraren: " + kurs.getLärare().getName());

        for (Student s : kurs.getStuderande()) {
            if (s != null) {
                System.out.println("Student: " + s.getName());
            }
        }
    }
    public static void main (String[]args){
        uppgift3a u3 = new uppgift3a();

    }
}
