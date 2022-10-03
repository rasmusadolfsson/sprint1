package sprint1.hederligeharry;

public class huvudprogram {
    huvudprogram(){
        BilAnnons ba1 = new BilAnnons(24000,"Fräsig", "Går bra!", "Volvo v70", 2012, 23000, "Svart", false, true);
        BilAnnons ba2 = new BilAnnons(36700,"Sportig", "Går som bara den!", "Saab 95", 2004, 14500, "Röd", false, false);

        HusvagnsAnnons ha1 = new HusvagnsAnnons(167000, "Lyxig", "Hem på hjul", "McDonalds",2018 , 9230, true, 7);

        MotorCykelAnnons mca1 = new MotorCykelAnnons(65000, "Livsfarlig", "Dö inom 1 år", "yamaha", 2020, 560, "1200 cm3", "kedja");

//        System.out.println(ba1.GetAnnonsText());
//        System.out.println(ba2.GetAnnonsText());
//        System.out.println(ha1.GetAnnonsText());
//        System.out.println(mca1.GetAnnonsText());


        ba1.PrintHeader();
        ba2.PrintHeader();
        ha1.PrintHeader();
        mca1.PrintHeader();
        ba1.PrintCompleteAd();

        System.out.println(ba1.calcuateRevenue() + " " +  mca1.calcuateRevenue());

    }
    public static void main(String[] args) {
        huvudprogram h = new huvudprogram();

    }
}
