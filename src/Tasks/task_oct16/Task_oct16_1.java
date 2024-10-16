package Tasks.task_oct16;

import java.util.Scanner;

public class Task_oct16_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name->");
        String Name=scanner.next();

        System.out.println("Enter the Age->");
        int Age=scanner.nextInt();

        System.out.println("Enter the Salary->");
        Double Salary=scanner.nextDouble();

       System.out.println("Name: " +Name);
        System.out.println("Age: " +Age);
        System.out.println("Salary: " +Salary);
        scanner.close();



    }
}
