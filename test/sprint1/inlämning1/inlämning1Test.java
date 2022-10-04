package sprint1.inlämning1;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class inlämning1Test {
    public Växt v1 = new Kaktus("Morgan", 2, WaterType.MINERALVATTEN);
    public Växt v2 = new Palm("Ola", 12, WaterType.KRANVATTEN);
    public Växt v3 = new Köttätande("Konny", 0.6, WaterType.PROTEINDRYCK);


    @Test
    void main() {
    }
    @Test
    public final void getterTest(){
        assert(v1.getName() == "Morgan");
        assert(v2.getName() == "Ola");
        assert(v3.getName() != "Conny");
        assert(v1.getLength() == 2);
        assert(v2.getLength() != 1.2);
        assert(v3.getLength() == 0.60);
    }
    @Test
    public final void setterTest(){
        assert(v1.getName() == "Morgan");
        v1.setName("Bert");
        assert(v1.getName() == "Bert" && v1.getName() != "Morgan");
    }
    @Test
    public final void waterAmountTest(){
        assert(v1.HowMuchWater() == 0.02);
        assert(v2.HowMuchWater() == 6);
        assert(v3.HowMuchWater() == 0.22);
    }
}