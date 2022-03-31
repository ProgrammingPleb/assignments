package Exercises.Lab3_2;

import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Assignment Mark : ");
        double mark = input.nextDouble() / 10;
        System.out.println("My Assignment score is : " + mark);
        if (mark > 6)
            System.out.println("Well Done!");
        else
            System.out.println("Don't be sad, do your best in your next assessment");
        input.close();
    }
}
