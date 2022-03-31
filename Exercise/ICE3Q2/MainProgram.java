package Exercise.ICE3Q2;

public class MainProgram {
    public static void main(String[] args) {
        Person person1 = new Person("Qusainie");
        person1.setRisk("high");

        House house1 = new House("3 Feb 2022", 560000, "Sungai Buloh");
        house1.description();
        String level = house1.setRisk("high");
        System.out.format("The level of risk is %s\n", level);
    }
}
