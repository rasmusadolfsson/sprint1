package sprint1.inlämning1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class inlämning1 {

    inlämning1(){
        List<Växt> växter = new ArrayList<>();
        Växt Igge = new Kaktus("Igge", 0.2, WaterType.MINERALVATTEN);
        Växt Laura = new Palm("Laura", 5, WaterType.KRANVATTEN);
        Växt Meatloaf = new Köttätande("Meatloaf", 0.7, WaterType.PROTEINDRYCK);
        Växt Putte = new Palm("Putte", 1, WaterType.KRANVATTEN);

        växter.add(Igge);
        växter.add(Laura);
        växter.add(Meatloaf);
        växter.add(Putte);

        boolean found = false;
        while(!found) {
            String input = JOptionPane.showInputDialog("Vilken växt ska få vätska? ");

            for (Växt v: växter) {
                if (Objects.equals(input, v.getName())) {
                    JOptionPane.showMessageDialog(null, "Växten " + v.getName() + " behöver " + v.HowMuchWater() + " liter " + v.getWater().water + " per dag!");
                    found = true;
                    break;
                }
            }
            if(input == null){
                break;
            }
            if (!found) {
                System.out.println("Växten: " + input + " finns inte i systemet.");
            }
        }
    }
    public static void main(String[] args){
        inlämning1 m = new inlämning1();
    }
}