package Exercises.Repetition_ControlStructure;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        char loopControl;
        do {
            System.out.print("Select the mode of calculation (1: Sum, 2: Product, 3: Quotient): ");
            int selectCode = in.nextInt();
            if (selectCode == 1)
                System.out.println("The sum is: " + (num1 + num2));
            else if (selectCode == 2)
                System.out.println("The product is: " + (num1 * num2));
            else if (selectCode == 3)
                System.out.println("The quotient is: " + (num1 / num2));
            System.out.print("Do you wish to continue? [Y/N]");
            loopControl = in.next().charAt(0);
        } while (loopControl == 'Y' || loopControl == 'y');
        in.close();
    }
}
