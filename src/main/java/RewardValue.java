public class RewardValue {

    // Conversion rate from miles to cash
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Variable to store either cash or miles converted to cash
    private final double cashValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor that accepts miles and converts it to cash
    public RewardValue(int milesValue) {
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Method to return the cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to return the miles value (convert cash back to miles)
    public int getMilesValue() {
        return (int) (this.cashValue / MILES_TO_CASH_RATE);
    }
}
