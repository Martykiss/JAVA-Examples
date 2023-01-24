//Program Circle bude od používateľa vyžadovať vstupnú hodnotu a to polomer kruhu, ktorý bude v centimetroch. Výsledkom bude obsah a obvod kruhu, ktorý vypíše používateľovi do “konzoly”. Program pôjde dovtedy, kým nezadáme slovo: koniec.
//Hint:
//Vzorec na výpočet obsahu kruhu je nasledujúci:
//S = π.r²
//Vzorec na výpočet obvodu kruhu je:
//o = 2.p.r
//Bonusová úloha: vytvorte metódy z daných vzorcoch.


package basicexamples.exercises;

import java.util.Scanner;

public class Circle {

    public static double getAreaOfCircle(double r) {
        double areaOfCircle = Math.PI * Math.pow(r, 2);
        return areaOfCircle;


    }


    public static double getCircumferenceOfCircle(double r) {
        double circumferenceOfCircle = 2 * Math.PI * r;
        return circumferenceOfCircle;

    }


    public static void printText(String str) {
        System.out.println(str);
        System.out.println();
    }

    public static void main(String[] args) {
        double r, circumferenceOfCircle, areaOfCircle;  // polomer,obvod,obsah.


        Scanner scn = new Scanner(System.in);  // inicializacia skeneru,potrebneho pre vstup.

        while (true) {
            System.out.println("Zadaj polomer (r)");
            r = scn.nextDouble();
            if (r <= 0) {  // podmienky IF možu vyzerat pri cislach nasledovne : ==  < ...
                printText("Koniec");
                return;  // ak polomer bude -1 tak ukonči cyklus s podmienkou, cize uz sa program nebude opakovat.
            }


            areaOfCircle = getAreaOfCircle(r);  // vypočet obsahu kruhu.
            circumferenceOfCircle = 2 * Math.PI * r;  // vypočet obvodu kruhu.


            printText("Zadaný polomer je : " + r);
            printText("Obsah kruhu je : " + areaOfCircle);
            printText("Obvod kruhu je : " + circumferenceOfCircle);

        }
    }
}
