package sprint1.inlämning1;

public class Palm extends Växt { //ännu mer arv
    public Palm(String name, double length) {

        super(name, length);
    }

    @Override
    public double HowMuchWater() {
        return 0.5 * getLength();
    }  //polymorfism
    @Override
    public String Watertype() {
        return "kranvatten";
    }
}
