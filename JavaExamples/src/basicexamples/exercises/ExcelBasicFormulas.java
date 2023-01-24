package basicexamples.exercises;

public class ExcelBasicFormulas {
    public static void main (String[] args){
        int []values = {10, 20, 30, 40};
       int sum = 0;



        // i++ je identicke ako i=i+1
        for (int i = 0; i < values.length; i++) { // cyklus s pevnym opakovanim, i nadobuda hodnoty od 0 do 4.
            //System.out.println(values[i]);
            sum = sum + values[i];
            // V 1. iteracii bude sum obsahovat hodnotu 10, pretoze 0 + 10
            // V 2. iteracii bude sum obsahovat hodnotu 30, pretoze 10 + 20
            // V 3. iteracii bude sum obsahovat hodnotu 60, pretoze 30 + 30
            // V 4. iteracii bude sum obsahovat hodnotu 100, pretoze 60 + 40

        }
        System.out.println(sum);

        System.out.println();

        int count =  values.length;
        double average = sum / values.length;  //priemer známok.
        System.out.println(average);

        System.out.println("Počet : " + count);





    }
}
