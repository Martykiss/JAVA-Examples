package basicexamples;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {


        int [] values = {8,  7,  3, 2};
        System.out.println(values[3]); // odkazujeme sa na poziciu pola zapisuje nazovPola, pričom poziciu zacina vzdy 0 a konci poctom prvkov -1.

        System.out.println();

        for (int i = 0; i <=3 ; i++) {
            System.out.println(values[i]); // vypiseme obsah pola prostredníctvom kombinacie nazovPola [i].
            
        }


     //  naplnime kazdy prvok pola nahodnou hodnotou od 1 do 100.
        int [] array = new int[10];

        array[0] = ((int)(Math.random()*100+1));
        array[1] = ((int)(Math.random()*100+1));
        array[2] = ((int)(Math.random()*100+1));
        array[3] = ((int)(Math.random()*100+1));
        array[4] = ((int)(Math.random()*100+1));
        array[5] = ((int)(Math.random()*100+1));
        array[6] = ((int)(Math.random()*100+1));
        array[7] = ((int)(Math.random()*100+1));
        array[8] = ((int)(Math.random()*100+1));
        array[9] = ((int)(Math.random()*100+1));

        System.out.println(array[0] +" " + array[1] +" " + array[2] +" " + array[3]
                +" " + array[4] +" " + array[5]+" " + array[6]+" " + array[7]+" "
                + array[8]+" " + array[9] );



        Arrays.sort(array);  // zoradi pole of najmenšieho po najvacsie.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[1]);
        }


        System.out.println("Max číslo : "  + array[array.length -1]);

        System.out.println("Min číslo : "  +  array[0]);



        String cars[] ={"Honda", "Audi", "Skoda", "Nissan", "Mazda", "Tesla" };
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }


        System.out.println("Další spôsob vypisovania hodnôt z pola");
        for (String car:cars) {
            System.out.println(car); //cize naplname premennu car kazdym prvkom pola v tomto cykle.
        }





    }
}
