package October.ex_17102024;

import java.util.Scanner;
public class Lab66_if {
    public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
        System.out.println("Enter the age:");

        int Age = SC.nextInt();

        if(Age > 18 )
        {
            System.out.println("Allowed to Vote!");
        }

    }
}
