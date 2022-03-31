package Exercises.Lab2_Methods;

import java.util.Scanner;
import java.lang.Character;

public class Aquatic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lessonID = GetLesson(in);
        char skillID = GetSkill(in);

        in.close();
        CalculateFees(lessonID, skillID);
    }

    static int GetLesson(Scanner in) {
        System.out.println("Lessons:\n1. Swim\n2. Snorkel\n3. Dive");
        System.out.print("Choose a lesson: ");
        int lessonID = in.nextInt();
        
        return lessonID;
    }

    static char GetSkill(Scanner in) {
        System.out.println("Skill:\nB. Basic\nI. Intermediate\nA. Advanced");
        System.out.print("Choose your current skill: ");
        char skillID = Character.toUpperCase(in.next().charAt(0));

        return skillID;
    }

    static void CalculateFees(int lessonID, char skillID) {
        int lessonFees = 0;
        
        if (lessonID == 1)
            lessonFees = 50;
        else if (lessonID == 2)
            lessonFees = 25;
        else if (lessonID == 3)
            lessonFees = 100;
        else {
            System.out.println("Invalid lesson ID! Please enter a valid lesson ID.");
            return;
        }
        
        if (skillID == 'B')
            lessonFees += 10;
        else if (skillID == 'I')
            lessonFees += 0;
        else if (skillID == 'A')
            lessonFees -= 15;
        else {
            System.out.println("Invalid skill ID! Please enter a valid skill ID.");
            return;
        }
        
        System.out.println("Your fee for each lesson is: " + lessonFees);
        return;
    }
}
