package Exercises.Lab3_2;

import java.util.Scanner;

public class ExerciseQ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed of the vehicle: ");
        int speed = input.nextInt();
        int fine;
        if (speed >= 110) {
            if (speed < 120)
                fine = 120;
            else if (speed < 130)
                fine = 150;
            else
                fine = 300;
        } else
            fine = 0;
        System.out.println("The fine is: RM" + fine);
        input.close();
    }
}
