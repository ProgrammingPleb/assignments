package Exercises.Lab_Repetition;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int payrollTotal = 0;
        while (payrollTotal < 999) {
            System.out.print("Enter Payroll Amount: ");
            int payrollAmount = in.nextInt();
            payrollTotal += payrollAmount;
        }
        System.out.println("Total Payroll: " + payrollTotal);
        in.close();
    }
}
