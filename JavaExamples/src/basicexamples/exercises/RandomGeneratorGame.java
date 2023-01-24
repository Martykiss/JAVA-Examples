//Vytvorte program, kde Java vygeneruje náhodné číslo od 1 do 10.
// Používateľ musí uhádnuť číslo.
// Ak uhádne menšie, tak mu Java vypíše  Neuhádol si, moje číslo je menšie,
// analogicky neuhádol si, moje číslo je väčšie a pri úspešnom uhádnutí
// BINGO! Uhádol si!

package basicexamples.exercises;

import java.util.Scanner;

public class RandomGeneratorGame {
    public static void main(String[] args) {

        //Generator náhodných čísiel od min do max (1 do 10).
        int min = 1;
        int max = 10;
        int range = (max - min) + 1;
        int randomNum = (int) (Math.random() * range + min);
        //Koniec generátora náhodných čísiel.
        System.out.println("Toto je náhodne vygenerovane číslo " + randomNum);


        System.out.println("Ahoj ja som AI , myslím na číslo od 1 do 10. Skus ho uhádnut");
        System.out.println("Zadaj číslo : ");

        int inputNumber = 0;
        //Start cyklus s podmienkou
        while (inputNumber != randomNum) {
            Scanner scn = new Scanner(System.in); //Trieda Scanner služi na uzivatelsky vstup. System .in priamo na vstup z konzoly.
            inputNumber = scn.nextInt(); //Priamy uzivatelský vstup,  vyzaduje cele číslo.

            if (inputNumber > randomNum) {
                System.out.println("Neuhadol si. Moje číslo je mnešie.");
            } else if (inputNumber < randomNum) {
                System.out.println("Neuhádol si. Moje číslo je väčšie");
            } else {
                System.out.println("Bingo  Uhádol si ");
            }

        }
        //END cyklus s podmienkou


    }
}
