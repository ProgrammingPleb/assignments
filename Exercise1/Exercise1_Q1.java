package Exercise1;
/*
    Exercise 1 - Question 1

    Question:
    You require an algorithm that will receive two integer items from a
    terminal operator, and display to the screen their sum, difference,
    product and quotient.

    By: Emeirul Ezzuddean bin Jefri (52101121420)

    Analysis Table: https://img.pleb.moe/2021/0824/10-10-02.png
    Pseudocode: https://github.com/ProgrammingPleb/fp-assignments/blob/master/Exercise1/Pseudocode/Exercise1_Q1.txt
    Flowchart: https://img.pleb.moe/2021/0824/12-04-24.png
    Live Version: https://replit.com/@programmingpleb/Exercise-1-Question-1
*/
import java.util.*;

public class Exercise1_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("The sum is: " + (num1 + num2));
        System.out.println("The difference is: " + (num1 - num2));
        System.out.println("The product is: " + (num1 * num2));
        System.out.println("The quotient is: " + (num1 / num2));
        input.close();
    }
}
