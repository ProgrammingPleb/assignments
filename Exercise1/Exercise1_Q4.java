package Exercise1;
/*
    Exercise 1 - Question 4

    Question:
    4The electrical resistance, r, of a metal wire in ohms is given
    by the formula r=(ml)/a where m is the resistivity of the metal;
    l is the length of the wire, in feet; and a is the cross-sectional
    area of the wire, in circular mils. Calculate the resistance of a wire. 

    By: Emeirul Ezzuddean bin Jefri (52101121420)

    Analysis Table: https://img.pleb.moe/2021/0824/10-50-41.png
    Pseudocode: https://github.com/ProgrammingPleb/fp-assignments/blob/master/Exercise1/Pseudocode/Exercise1_Q4.txt
    Flowchart: https://img.pleb.moe/2021/0824/12-01-47.png
    Live Version: https://replit.com/@programmingpleb/Exercise-1-Question-4
*/
import java.util.*;

public class Exercise1_Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the resistivivity of the metal: ");
        double m = input.nextDouble();
        System.out.print("Enter the length of the wire (in feet): ");
        double l = input.nextDouble();
        System.out.print("Enter the cross-sectional area of the wire: ");
        double a = input.nextDouble();
        double r = (m * l) / a;
        System.out.println("The resistance of the wire is " + r + " ohms.");
        input.close();
    }
}
