/*
 Trieda vypíše nasledujúci text do konzoly, pričom hodnoty ako dátum, známka, rok a aktuálny dátum môže použivateľ meniť cez premenné.
 Text bude vyzerať nasledovne:
 Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
 V Bratislave dňa 18.06.2022
 */

package basicexamples.remind;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class VariablesExampleUserInput {
    public static void main(String[] args) {
        String text1 = " Študent Jozef Mrkvička sa narodil ";
        String date = "";
        String text2 = " z maturitnej skúšky má známku ";
       // float grade = 1.5f;
        int year = 2022;
        String text4 = " nastúpi do nového zamestnania ako Java programátor. %n ";
        String text5 = " V Bratislave dna ";

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj dátum: ");
        date = scn.nextLine();

        System.out.println(" Zadaj známku : ");
        float  grade = scn.nextFloat();
        String gradeWithComma = String.format("%.1f", grade);

        System.out.println(" Zadaj rok : ");
        year = scn.nextInt();


        String today = DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDate.now());


        String wholeText = text1 + date + text2 + gradeWithComma  + text4 + text5 + today;


        System.out.println(wholeText);

        if (grade<= 1.5f) {
            System.out.println("JE PRIJATY");
            System.out.println("SUPER");
        }
        
        else {
            System.out.println("NIE JE PRIJATY");
            System.out.println("TO JE SKODA");
        }


    }
}
