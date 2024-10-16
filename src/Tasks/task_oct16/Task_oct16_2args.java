package Tasks.task_oct16;

public class Task_oct16_2args {

    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int Largest=(a>b)? a :b;

        System.out.println("The largest number is:" +Largest) ;
    }
}
