package Lectures;

import java.util.Scanner;

public class LectureW5 {
    public static void main(String[] args) {
        char gender;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your gender: ");
        gender = input.next().charAt(0);

        if (gender == 'm' || gender == 'm')
            System.out.println("Male");
        else
            System.out.println("Female");
        
        input.close();
    }
}
