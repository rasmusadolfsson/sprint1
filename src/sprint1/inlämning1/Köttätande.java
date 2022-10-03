package sprint1.inlämning1;

public class Köttätande extends Växt { // mer arv
    public Köttätande(String name, double length) {
        super(name, length);
    }

    @Override
    public double HowMuchWater() {
        return 0.1 + 0.2 * getLength();
    }
    @Override
    public String Watertype() {
        return "proteindryck";
    }
}
