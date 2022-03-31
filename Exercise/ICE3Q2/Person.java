package Exercise.ICE3Q2;
import java.lang.String;

public class Person implements Insurable {
    public Person(String name) {
        this.name = name;
    }

    public String riskLevel = "";
    public String name = "";

    public String setRisk(String level) {
        this.riskLevel = level;
        return level;
    }
}
