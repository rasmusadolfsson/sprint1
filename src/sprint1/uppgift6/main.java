package sprint1.uppgift6;

import java.util.ArrayList;
import java.util.List;

public class main {
    main(){
        List<Djur> djur = new ArrayList<>();
        Fågel fågel1 = new Blåmes();
        Fågel fågel2 = new Fiskmås();
        Däggdjur ddjur1 = new Hund();
        Däggdjur ddjur2 = new Ko();
        Fisk fisk1 = new Abborre();
        Fisk fisk2 = new Gädda();

        djur.add(fågel1);
        djur.add(fågel2);
        djur.add(ddjur1);
        djur.add(ddjur2);
        djur.add(fisk1);
        djur.add(fisk2);

        printSound(djur);
    }
    public static void main(String[] args){
        main m = new main();
    }
    public void printSound(List<Djur> lista){
        for(Djur d: lista){
            d.makeSound();
        }
    }
}
