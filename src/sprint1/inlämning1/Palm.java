package sprint1.inlämning1;

public class Palm extends Växt { //ännu mer arv

    public Palm(String name, double length, WaterType water) {
        super(name, length, water);
    }

    @Override
    public double HowMuchWater() {
        return 0.5 * getLength();
    }  //polymorfism

}
