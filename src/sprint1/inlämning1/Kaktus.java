package sprint1.inlämning1;

public class Kaktus extends Växt { //arv
    public Kaktus(String name, double length, WaterType water) {
        super(name, length, water);
    }

    @Override
    public double HowMuchWater() {
        return 0.02;
    } //polymorfism
}
