package calculator;

public class Variables {
    public static void main(String[] args) {

        // System.out.println vypise text alebo cislo
        // Text musi byt napisany v uvodzovkach ale cislo moze byt aj bez
        System.out.println("HelloWorld");
        System.out.println("Slovensko");
        System.out.println(5 + 5);
        System.out.println(2022);


        //Definovanie premennych
        String name = "Martin";


        String surname = "Kišš";


        int myNum;
        myNum = 51;


        final double conversionRate = 30.126; // konstantu definujeme klucovym slovom final  a je nemenna


        float myFloatNum = 5.99f;


        char myLetter = 'D';


        boolean myBool = true;


        //Scita meno a priezvysko v premennych,cize vysledok bude meno a priezvysko
        String firstName = "John";
        String lastName = "Dos";
        String fullName = firstName + lastName;


        //Scita hodnoty v premennych x a y,cize vysledok bude 10
        int x = 5;
        int y = 5;
        int result = x + y;


        int a = 15;
        int b = 26;
        int c = 158;


        String meno = "Ján";
        String priezvysko = "Mrkvička";



        /* System.out.println vypise text alebo cislo  text musi byt napisany v uvodzovkach ale cislo moze byt aj bez. */
        System.out.println("Moje meno je : " + name);

        System.out.println("Moje priezvysko je : " + surname);

        System.out.println("Konverzný kurz Eur/CZ je : " + conversionRate + " ku dňu  21.12.2022.");

        System.out.println("Moje čislo je : " + myNum);

        System.out.println(myFloatNum);

        System.out.println(myLetter);

        System.out.println(myBool);

        System.out.println("Celé meno: " + fullName);

        System.out.println("Vysledok sučtu je :" + result);

        System.out.println("Výsledok sčítania 3 premennych (a=" + a + ", b=" + b + ", c=" + c + ") je:" + (a + b + c));

        System.out.println("Meno  zamestnanca je: " + meno + " " + priezvysko);


    }
}
