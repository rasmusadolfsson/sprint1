package sprint1.uppgift2;

public class uppgift2a {
    public static void main(String[] args){
        Bil car = new Bil(50, 2300, 6, 4);
        Båt boat = new Båt(27, 9800, 2000);
        Tåg train = new Tåg(270, 12400, 5);
        Cykel bike = new Cykel(13, 32, 14, 11);

        /*car.printMe();
        boat.printMe();
        train.printMe();
        bike.printMe();*/

        System.out.println();
        Printable car2 = new Bil(40, 1900, 5, 3);
        car2.printMe();

        Hjulburen bike2 = new Cykel(9, 27, 8, 6);
        numOfWheels(bike2);

        Printable bike3 = new Cykel(10, 15, 5,4);
        bike3.printMe();


    }
    public static void numOfWheels(Hjulburen hjulburen){

        System.out.println("Antal hjul: "+hjulburen.getAntalHjul());
    }
}
