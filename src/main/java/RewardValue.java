
import java.util.Scanner;
public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertToCash(milesValue);
        } else {
            throw new IllegalArgumentException("Invalid constructor usage. Use the constructor with isMiles parameter.");
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    private double convertToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    private double convertToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}
