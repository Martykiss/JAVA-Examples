package calculator;

import java.util.Scanner;

public class Premenne {

    public static void main(String[] args) {
        char operator;
        double num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Zadajte hodnotu (+,-,*,/ ) ");
        operator = input.next().charAt(0);

        System.out.println("Zadajte hocijake čislo");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        input.close();

        switch (operator) {
            case '+':
                System.out.println("Vysledok sčítania : ");
                System.out.printf("%.2f + %.2f  = %.2f", num1, num2, (num1 + num2));

                break;

            case '-':
                System.out.println("Vysledok odčitania : ");
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
                break;

            case '*':
                System.out.println("Vysledok nasobenia : ");
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                break;

            case '/':
                System.out.println("Vysledok delenia : ");
                if (num2 != 0)
                    System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                else
                    System.out.println("Divide by zero Situation");
                break;

            default:
                System.out.printf("%c is an invalid operator", operator);


        }


    }


}
