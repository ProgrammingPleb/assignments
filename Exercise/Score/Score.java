package Exercise.Score;
import java.util.*;

public class Score {
    // Properties
    public int student = 0; //to store no of stud
    public int gradeA = 0; //to store no of stud in grade A
    public int gradeB = 0; //to store no of stud in grade B
    public int gradeC = 0; //to store no of stud in grade C
    public int gradeD = 0; //to store no of stud in grade D
    public int gradeF = 0; //to store no of stud in grade F
    
    Scanner sc = new Scanner(System.in);
    
    public double [] GetInputScore()
    {
        System.out.print("Enter number of student :");
        student = sc.nextInt();
        double [] score = new double[student];
        for(int index = 0; index<student; index ++)
        {
            System.out.print("Enter score :");
            score[index] = sc.nextDouble();
        }

        return score;
    }
    
    public void AssignGrade(double [] score)
    {
        for(int index = 0; index<score.length;index++)
        {
                if(score[index]>=90 && score[index]<=100)
                {
                    gradeA = gradeA + 1;
                }
                else if(score[index]>=80 && score[index]<=89)
                {
                    gradeB = gradeB + 1;
                }
                else if(score[index]>=70 && score[index]<=79)
                {
                    gradeC = gradeC + 1;
                }
                else if(score[index]>=60 && score[index]<=69)
                {
                    gradeD = gradeD + 1;
                }
                else
                {
                    gradeF = gradeF + 1;
                }
        }
        System.out.print("\nNumber of score in grade A is "+gradeA);
        System.out.print("\nNumber of score in grade B is "+gradeB);
        System.out.print("\nNumber of score in grade C is "+gradeC);
        System.out.print("\nNumber of score in grade D is "+gradeD);
        System.out.print("\nNumber of score in grade F is "+gradeF);
    }
    
    
}
