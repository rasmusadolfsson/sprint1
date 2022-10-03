package sprint1.inlämning1;

public abstract class Växt implements Vatten {
    private String name;  // inkapsling
    private double length;

    Växt(String name, double length){
        this.name = name;
        this.length = length;
    }

    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public abstract double HowMuchWater();
    public abstract String Watertype();
}
