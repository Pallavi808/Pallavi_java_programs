package Tasks.task_oct16;

import java.util.Scanner;

public class Task_oct18_km_to_miles {

    public static void main(String[] args) {

        System.out.println("Choose a conversion option:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Miles to Kilometers ");
        System.out.println("4. Fahrenheit to Celsius");

        Scanner SC = new Scanner(System.in);
        int choice = SC.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Enter the distance in kilometers:");
                double km = SC.nextDouble();
                double miles = km * 0.621371;
                System.out.println("Mile= "+miles);
                break;
            case 2:
                System.out.println("Enter the temperature in Celsius: ");
                double Celsius = SC.nextDouble();
                double fahrenheit = (Celsius * 9/5) + 32;
                System.out.println("fahrenheit= "+fahrenheit);
                break;
            case 3:
                System.out.println("Enter the distance in miles:");
                double mile = SC.nextDouble();
                double km1 = mile / 0.621371;
                System.out.println("Km= "+km1);
                break;
            case 4:
                System.out.println("Enter the temperature in fahrenheit: ");
                double fahrenheit1 = SC.nextDouble();
                double cel = (fahrenheit1 - 32) * 5/9;
                System.out.println("Celsius= "+cel);
                break;
            default:
                System.out.println("Invalid input");
                break;

        }
   SC.close();

    }
}
