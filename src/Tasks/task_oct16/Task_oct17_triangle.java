package Tasks.task_oct16;

import java.util.Scanner;
public class Task_oct17_triangle {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter length of Side1: ");
        int side1 = SC.nextInt();

        System.out.println("Enter length of Side2: ");
        int side2 = SC.nextInt();

        System.out.println("Enter length of Side3: ");
        int side3 = SC.nextInt();

        if(side1==side2 && side2==side3)
        {
            System.out.println("It is an Equilateral triangle");
        }
        else if(side1==side2 || side2==side1)
        {
            System.out.println("It is an Isoceles triangle");
        }
        else
        {
            System.out.println("It is a Scalene triangle");
        }

    }
}
