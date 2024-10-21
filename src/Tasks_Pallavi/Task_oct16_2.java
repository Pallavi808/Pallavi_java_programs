package Tasks_Pallavi;

import java.util.Scanner;

public class Task_oct16_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number a : ");
        int a= scanner.nextInt();

        System.out.println("Enter first number b : ");
        int b= scanner.nextInt();

      int Largest=(a>b)? a :b;
        System.out.println("The largest number is:" +Largest) ;
        scanner.close();

    }

}
