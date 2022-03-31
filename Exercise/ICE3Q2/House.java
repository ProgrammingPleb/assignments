package Exercise.ICE3Q2;
import java.lang.String;

public class House extends Property implements Insurable {
    public House(String buyDate, double price, String location) {
        super(buyDate, price);
        this.location = location;
    }

    public String riskLevel = "";
    public String location = "";

    public void description() {
        System.out.format("Buying date is on %s\n", this.buyingDate);
        System.out.format("The price is RM%.2f\n", this.buyingPrice);
        System.out.format("The location is at %s\n", this.location);
    }

    public String setRisk(String level) {
        this.riskLevel = level;
        return level;
    }
}
