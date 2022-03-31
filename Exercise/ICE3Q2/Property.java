package Exercise.ICE3Q2;
import java.lang.String;

public abstract class Property {
    public Property(String buyDate, double price) {
        this.buyingDate = buyDate;
        this.buyingPrice = price;
    }

    protected String buyingDate = "";
    protected double buyingPrice = 0;

    public abstract void description();
}
