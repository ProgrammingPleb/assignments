package Exercises.Lab_Repetition;

public class SquareCubes {
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println("Number: " + x);
            System.out.println("Square of Number: " + (x * x));
            System.out.println("Cube of Number: " + (x * x * x) + "\n");
            x++;
        } while (x <= 20);
    }
}
