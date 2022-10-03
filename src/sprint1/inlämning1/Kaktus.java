package sprint1.inlämning1;

public class Kaktus extends Växt { //arv
    public Kaktus(String name, double length) {
        super(name, length);
    }

    @Override
    public double HowMuchWater() {
        return 0.02;
    }
    @Override
    public String Watertype() {
        return "mineralvatten";
    }
}
