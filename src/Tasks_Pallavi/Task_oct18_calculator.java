package Tasks_Pallavi;

import java.util.Scanner;

public class Task_oct18_calculator {

    public static void main(String[] args) {

        Scanner SC = new Scanner( System.in);

        System.out.println(" Enter Number1: ");
        double Num1 = SC.nextDouble();

        System.out.println(" Enter Number2: ");
        double Num2 = SC.nextDouble();

        System.out.println(" Enter Operator: ");
        char operator = SC.next().charAt(0);

        double Result;

        switch(operator)
        {
            case '+':
                 Result = Num1 + Num2;
                System.out.println("Num1 + Num2="+ Result);
                break;

            case '-':
                 Result = Num1 - Num2;
                System.out.println("Num1 - Num2="+ Result);
                break;

            case '*':
                 Result = Num1 * Num2;
                System.out.println("Num1 * Num2="+ Result);
                break;

            case '/':
                 Result = Num1 / Num2;
                System.out.println("Num1 / Num2="+ Result);
                break;

            case '%':
                 Result = Num1 % Num2;
                System.out.println("Num1 % Num2="+ Result);
                break;

                default:
            System.out.println("Enter valid operator");
                break;


        }


    }
}
