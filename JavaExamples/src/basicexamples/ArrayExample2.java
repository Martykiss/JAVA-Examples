package basicexamples;

import java.util.Arrays;

/*
Vytvorte triedu s názvom ExcelBasicFormulas, v ktorej budú 2 základné funkcie SUM a AVERAGE, ktoré budú počítať súčet (getSum), resp. priemer hodnôt (getAverage).
        Vstup hodnôt bude cez premenné, napr. value1 a value2.
*/
public class ArrayExample2 {



    public static double getSum(double[] values) {
        // tu musi byt logika vypoctu
      double sum = 0;
        for (int i = 0; i < values.length; i++) { // cyklus s pevnym poctom opakovani, i nadobuda hodnoty od 0 do 3
            sum = sum + values[i]; // Java interpretuje tento riadok najprv tak, ze zoberie alebo vypocita to, co je napravo od =
        }
        return sum;
    }



    public static double getMax (double [] values) {
        Arrays.sort(values); // pole values je zoradene
        double max = values[values.length - 1];
        return max;
    }



    public static double getMin (double [] values) {
        Arrays.sort(values); // pole values je zoradene
        double min = values[0];
        return min;
    }



    public static double getAverage(double sum, int count) {
        double average = sum / count;
        return average;
    }




    public static int getCount(double [] values) {
        int count = values.length;
        return count;
    }



    public static void main(String[] args) {
        double[] values = {1000, 20, 100, 999}; // naplname pole s nazvom values hodnotami.

        // Chceme vypisat vysledky nasledujucich Excel funkcii v poradi: SUM, AVERAGE, COUNT, MAX, MIN
        double sum = getSum(values); // volame metodu getSum, ktora vracia sucet hodnot pola values

        int count = values.length;

        double average = getAverage(sum,count);


        // V premennej sum zostanem posledny sucet
        System.out.println("SUM " + sum);
        System.out.println("AVERAGE " + average);
        System.out.println("COUNT " + getCount(values));
        System.out.println("Max :"  + getMax(values));
        System.out.println("Min :"  + getMin(values));


    }


}