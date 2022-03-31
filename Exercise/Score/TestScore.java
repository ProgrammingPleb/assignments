package Exercise.Score;

public class TestScore {
    public static void main(String[] args) {
        Score myScore = new Score();
        
        double [] newScore = myScore.GetInputScore();
        myScore.AssignGrade(newScore);
    }
}
