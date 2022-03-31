package Exercise1;
/*
    Exercise 1 - Question 3

    Question:
    Display the measurement in Fahrenheit for a given Celsius.
    (Fahrenheit = 9/5*Celsius + 32)

    By: Emeirul Ezzuddean bin Jefri (52101121420)

    Analysis Table: https://img.pleb.moe/2021/0824/10-44-36.png
    Pseudocode: https://github.com/ProgrammingPleb/fp-assignments/blob/master/Exercise1/Pseudocode/Exercise1_Q3.txt
    Flowchart: https://img.pleb.moe/2021/0824/12-03-04.png
    Live Version: https://replit.com/@programmingpleb/Exercise-1-Question-3
*/
import java.util.*;

public class Exercise1_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Celcius: ");
        double celcius = input.nextDouble();
        double fahrenheit = (9.0/5.0) * celcius + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        input.close();
    }
}
