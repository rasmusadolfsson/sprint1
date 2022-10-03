package sprint1.uppgift1;

public class Main {
    public static void main(String[] args) {
        Car volvo = new Car("Volvo", "X90", "ABC 123");
        Car saab = new Car("Saab", "93", "LLL 777");
        Car volvo2 = new Car("Volvo", "XC70", "IOP 456");
        Car opel = new Car("Opel", "Corsa", "WWW 531");

        Carowner Ola = new Carowner("Ola", 46, "Golvgatan 359");
        Carowner Fisen = new Carowner("Fisen", 24, "Testvägen 39");
        Carowner Torkel = new Carowner("Torkel", 37, "Gågatan 9");
        Carowner Gösta = new Carowner("Gösta", 64, "Härborjagvägen 2");

        volvo.ownedBy(Fisen);
        volvo2.ownedBy(Gösta);
        saab.ownedBy(Torkel);
        volvo.sold();
        opel.ownedBy(Fisen);
        volvo.ownedBy(Ola);
        saab.sold();

        printCar(volvo);
        printCar(volvo2);
        printCar(saab);
        printCar(opel);

        }
    private static void printCar(Car car){
        if(car.getOwner() == null){
            System.out.println("Bilen: "+car.getManufacturer()+" "+car.getModel()+" med registreringsnummer: "+car.getRegNr()+" Har ingen ägare.");
        }
        else{
            System.out.println("Bilen: "+car.getManufacturer()+" "+car.getModel()+" med registreringsnummer: "+car.getRegNr()+" Ägs av: "+ car.getOwner().getName());
        }
    }
}