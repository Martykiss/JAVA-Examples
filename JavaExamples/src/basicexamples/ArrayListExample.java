package basicexamples;

import java.util.ArrayList;

// ArrayListExample bude služit na pridavanie lubovolneho poctu kníh a ich vypis.
public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList <String>  poleKnih = new ArrayList<String>(); //vytvorili sme dynamicke pole s nazvom poleKnih.

        String kniha1  = "Hobbit";
        String kniha2 = "Portrét Doriana Greya";
        String kniha3  = "Učebnica jazku JAVA";

        poleKnih.add(kniha1);
        poleKnih.add(kniha2);
        poleKnih.add(kniha3);

        poleKnih.get(0); //vypiseme knihu v poradi  prvu,cize s indexom 0.
        System.out.println(poleKnih.get(0));


        // vypiseme knihu v poradi prvu, cize s indexom 0
        System.out.println("Prvá kniha v zozname");
        System.out.println("--------------------");
        System.out.println(poleKnih.get(0));

        System.out.println("\n\nVšetky vypísané poleKnih :");
        System.out.println("---------------------");


        // prechadzame vsetkymi prvkami dynamickeho pola poleKnih
        for (int i = 0; i < poleKnih.size(); i++) {
            System.out.println(poleKnih.get(i) + "."); // pridal som zaroven bodku (.)
            //System.out.println(poleKnih);
        }


        System.out.println("\n\nVšetky vypísané poleKnih, spôsob  číslo  2 :");
        System.out.println("---------------------");

        for (String kniha:poleKnih)  {
            System.out.println(kniha);
        }


        System.out.println();

        ArrayList <Integer> poleCiselNoh = new ArrayList <Integer> ();

        Integer cisloNohy1 = 40;
        Integer cisloNohy2 = 41;
        Integer cisloNohy3  = 45;

        poleCiselNoh.add(cisloNohy1);
        poleCiselNoh.add(cisloNohy2);
        poleCiselNoh.add(cisloNohy3);


        System.out.println("\n\nVšetky čísla nôh : ");
        System.out.println("---------------------");

        // vypiseme vsetky cisal noh
        for (Integer  i = 0; i < poleCiselNoh.size(); i++) {
            System.out.println("Zadane číslo nohy  : "  + poleCiselNoh.get(i));

        }


        System.out.println("\n\nVšetky vypísané čisla nôh, spôsob  2 :");
        System.out.println("---------------------");
        // vypiseme vsetky cisal noh,sposob 2.
        for (Integer cisloNohy:poleCiselNoh) {
            System.out.println(cisloNohy);
        }




    }
}

