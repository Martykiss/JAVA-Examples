package basicexamples;

import java.util.ArrayList;
import java.util.Scanner;

public class InputValuesIntoDynamicArray {


    /*
    Vytvorte dynamicke pole (prostredníctvom ArrayList), ktorý od používateľa bude žiadať zadanie číselných hodnôt, ktoré budeme do dynamického poľa pridávať. Tento vstup bude “nekonečný”, kým nezadáme záporné číslo.
            Výstupom bude výpis všetkých čísel, ktoré sme v konzole (ArrayListe) zadali.
            Dodatočná úloha: Sčítanie všetkých hodnôt, ktoré používateľ v konzole zadal.
    */

    public static void main(String[] args) {
        int hodnota = 0;


        ArrayList zadaneHodnoty = new ArrayList<>(); // vytvaram dynamicke pole, ktore je prázdne.


        Scanner scn = new Scanner(System.in);

        System.out.println("Zadaj akékoľvek kladné číslo. Pri zadaní záporneho ( napr. -1 ) aplikácia skončí.");


        // Chceme, aby aplikacia od pouzivatela ziadala zadavanie "nekonecneho" mnozstva hodnota, kym nezada zaporne cislo
        while (hodnota >= 0) {
            hodnota = scn.nextInt();
            zadaneHodnoty.add(hodnota);

        }


        for (int i = 0; i < zadaneHodnoty.size()-1; i++) {
            System.out.println(zadaneHodnoty.get(i));

        }


        int sum  = 0;
        for (int i = 0; i <zadaneHodnoty.size()-1 ; i++) {
            sum  =  sum  + (int) zadaneHodnoty.get(i);

        }

        System.out.println("Sumár všetkých hodnôt je : " + sum);




    }
}

