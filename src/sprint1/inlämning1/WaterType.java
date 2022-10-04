package sprint1.inlämning1;

public enum WaterType {
    KRANVATTEN("kranvatten"),
    PROTEINDRYCK("proteindryck"),
    MINERALVATTEN("mineralvatten");

    final String water;

    WaterType(String water){
        this.water = water;
    }
}
