/* Vytvorte program, ktorý na základe textového zadania známky, napr.
výborný, chválitebný, dobrý, dostatočný, nedostatočný vypíše zodpovedajúcu známku.
Hint: Porovnanie textov sa cez IF robí ináč ako porovnanie s číslom.
Nemôžeme použiť.equals.
Hint č. 2: Namiesto IF môžeme použiť SWITCH, CASE.
Bonusová úloha: Program pôjde do “nekonečna”, kým nezadáme príkaz: koniec.
Bonusová úloha č. 2: Skúsme “ošetriť” používateľský vstup tak, aby reagoval na
vstup text bez ohľadu na diakritiku.
*/


package basicexamples.exercises;


import java.text.Normalizer;
import java.util.Scanner;


public class GradeProgram2 {


    public static String stripAccents(String s) {

        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }

    public static void main(String[] args) {

        //štart cyklu
        while (true) {
            Scanner scn = new Scanner(System.in);

            System.out.println("Zadaj výsledok testu ako text výborný,chválitebný,dobrý,dostatocný,nedostatocný : ");
            String gradeText = scn.nextLine();  //program caka od pouzivateľa text.
            System.out.println("Vstupný text známky od použivateľa bol nasledujúci : " + gradeText);
            gradeText = stripAccents(gradeText); //tu menime obsah premennej Grade Text tak ze je bez diakritiky.
            System.out.println("Text bez diakritiky : " + gradeText);

            if (!gradeText.equals("koniec")) System.out.print("Výsledna známka po konverzií z textoveho zadania je : ");

            switch (gradeText) {
                case "vyborny":
                    System.out.println("1");
                case "chavlitebny":
                    System.out.println("2");
                case "dobry":
                    System.out.println("3");
                case "dostatocny":
                    System.out.println("4");
                case "nedostatocny":
                    System.out.println("5");


            }


        }


        //koniec cyklu
    }


}








