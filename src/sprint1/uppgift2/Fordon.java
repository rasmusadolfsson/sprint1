package sprint1.uppgift2;

public abstract class Fordon {
    int speed;
    int weigth;

    public void changeSpeed(int newSpeed){
        speed = newSpeed;
    }
    Fordon(int speed, int weigth){
        this.speed = speed;
        this.weigth = weigth;
    }

    //public abstract void printMe();
}
