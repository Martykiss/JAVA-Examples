/*
 Trieda vypíše nasledujúci text do konzoly, pričom hodnoty ako dátum, známka, rok a aktuálny dátum môže použivateľ meniť cez premenné.
 Text bude vyzerať nasledovne:
 Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
 V Bratislave dňa 18.06.2022
 */

package basicexamples.remind;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class VariablesExample {
    public static void main(String[] args) {
       String text1 = "Študent Jozef Mrkvička sa narodil ";
       String date = "03.03.2000 ";
       String text2  = "z maturitnej skúšky má známku ";
       float grade = 1.5f ;
       String gradeWithComma  = String.format("%.1f",grade); //Reformat grade to slovak format
       String text6 = " Dnes " ;
       String text4 = "nastúpi do nového zamestnania ako Java programátor. %n ";
       String  text5 = "V Bratislave dna ";
       String today= DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDate.now());


        String wholeText  = text1 + date + text2 + gradeWithComma  + text6  + text4 + text5  + today;

        System.out.printf(wholeText);


    }
}
