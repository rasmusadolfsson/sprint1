package sprint1.uppgift9;

public class enums {


    public enum Romannumerals{ I(1), V(5), X(10), L(50), C(100), D(500),M(1000);
        public final int number;

        Romannumerals(int i){
            number = i;
        }
    }

    public static void main(String[] args) {
        for(Romannumerals   r: Romannumerals.values()){
            System.out.println(r.name() + " = " + r.number);
        }

    }
}
