package October.ex_18102024;

import java.util.Scanner;

public class Lab69_switch {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int Number = Sc.nextInt();

        switch(Number)
        {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Enter valid number");
            break;


        }


  System.out.println("Out of the loop");
        Sc.close();
    }
}
