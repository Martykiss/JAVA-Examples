package basicexamples.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Rectangle {

    public static double getPerimeter(double a, double b) {

        return 2 * (a + b);
    }

    public static double getArea(double a, double b) {

        return a * b;
    }

    public static void main(String[] args) {
        double a;
        double b;
        String odpoved;


        while (true) {
            Scanner scn = new Scanner(System.in);

            System.out.println("Zadaj : ");
            System.out.println("(s) pre vstup hodnôt na výpočet obvodu a obsahu odľžníka");
            System.out.println("(q) pre ukončenie programu");

            odpoved = scn.nextLine();  // premenna odpoved bude obsahovat písmeno (moznost), ktore zadal pouzivatel.

            if (odpoved.equals("s")) {
                System.out.println("Zadaj hodnotu strany a: ");
                a =  scn.nextDouble();


            System.out.println("Zadaj hodnotu strany b: ");
            b = scn.nextDouble();




            double obvod = getPerimeter(a, b);
            double obsah = getArea(a, b);
            System.out.println("Obvod obdlžnika je : " + obvod);
            System.out.println("Obsah obdlžnika je : " + obsah);
            } else if (odpoved.equals("q")) {
                System.out.println("Koniec programu");
                break;
            } else
                System.out.println("Zadali ste nesprávnu možnost. Zopakujte výber.");


        }


    }


    @Nested
    @DisplayName("Tests for my method")
    class MyMethodUseCases {
        @Test
        public void testGetPerimeter() {
            assertEquals(10, getPerimeter(2, 3));
            assertEquals(13, getPerimeter(2.5, 4));
        }

        @Test
        public void testGetArea() {
            assertEquals(6, getArea(2, 3));
            assertEquals(10, getArea(2.5, 4));
            assertEquals(5, getArea(1, 5));
        }
    }

}






