package Tasks_Pallavi;

import java.util.Scanner;
public class Task_oct17_Grade {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Score:");

        int Score = Sc.nextInt();

        if(Score >=90 && Score<=100)
        {
            System.out.println("Grade is A!");
        }
        else if (Score >=80 && Score<=89)
        {
            System.out.println("Grade is B!");
        }
        else if (Score >=70 && Score<=79)
        {
            System.out.println("Grade is C!");
        }
        else if (Score >=60 && Score<=69)
        {
            System.out.println("Grade is D!");
        }
        else if (Score >=60 && Score<=69)
        {
            System.out.println("Grade is D!");
        }
        else if (Score >=0 && Score<=59)
        {
            System.out.println("Grade is F!");
        }
        else
            System.out.println("Invalid Score!!");



    }
}
