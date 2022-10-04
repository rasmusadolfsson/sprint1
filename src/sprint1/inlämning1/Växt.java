package sprint1.inlämning1;

public abstract class Växt implements Vatten {
    private String name;  // inkapsling
    private double length;
    public WaterType water;

    Växt(String name, double length, WaterType water){
        this.name = name;
        this.length = length;
        this.water = water;
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

    public WaterType getWater() {
        return water;
    }
}
