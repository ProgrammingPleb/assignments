package Exercise1;
/*
    Exercise 1 - Question 2

    Question:
    Write an algorithm that calculates the Over Time(OT) rate of an
    employee, if the number of hours that he worked and the rate of
    each hour are given.

    By: Emeirul Ezzuddean bin Jefri (52101121420)

    Analysis Table: https://img.pleb.moe/2021/0823/17-32-24.png
    Pseudocode: https://github.com/ProgrammingPleb/fp-assignments/blob/master/Exercise1/Pseudocode/Exercise1_Q2.txt
    Flowchart: https://img.pleb.moe/2021/0824/12-03-57.png
    Live Version: https://replit.com/@programmingpleb/Exercise-1-Question-2
*/
import java.util.*;

public class Exercise1_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of hours worked: ");
        int hours = input.nextInt();
        System.out.print("Enter the rate of each hour: ");
        int rate = input.nextInt();
        System.out.println("The Over Time rate of the employee is: " + (hours * rate));
        input.close();
    }
}
