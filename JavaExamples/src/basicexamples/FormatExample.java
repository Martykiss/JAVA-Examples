package basicexamples;

public class FormatExample {

    public static void main(String[] args) {
        String name = "martin";
        String sf1 = String.format("name is %s", name);
        String sf2 = String.format("value is %f", 32.33434);
        String sf3 = String.format("value is %12.20f", 12.33434);//returns 12 char fractional part filling with 0


        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);


        System.out.println(); // empty line in console
        String str1 = String.format("Decimal number is %d", 101); // Integer value
        String str2 = String.format("%s", "Amar Singh"); // String value
        String str3 = String.format("%f", 101.00);       // Float value
        String str4 = String.format("%x", 101);          // Hexadecimal value
        String str5 = String.format("%c", 'c');          // Char value


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);


        int number1 = 0;
        System.out.println(++number1);

        int number2 = 0;
        System.out.println(--number2);

        int x = 10;
        x += 5; // is same as x = x + 5;
        System.out.println(x);

        System.out.println();

        double number3 = 8, number4 = 4, modulus, division;
        modulus = number3 % number4;
        division = 1.0;

        System.out.println("Prvé číslo je " + number3);
        System.out.println("Druhé číslo je " + number4);

        System.out.println("Zvyšok po delení je " + modulus);
        System.out.println("Delenie je " + division);

        if (modulus == 0) {
            System.out.println("Číslo je párne");
        } else {
            System.out.println("Číslo je nepárne");
        }


        String greeting = "Hello";
        System.out.println(greeting);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        int number = 10;
        System.out.println("The length of the number is: " + number); // is not possible to get lenght of number in same way as in String

        String txt2 = "locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7


        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);


        String firstName2 = "Jan ";
        String lastName2 = "Zitniak";
        System.out.println(firstName2.concat(lastName2));


    }
}



