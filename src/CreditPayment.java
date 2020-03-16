public class CreditPayment {
    public double calculate(double credit, double percent, int amount) {
        return (credit * ((percent / 12 / 100) * Math.pow((1 + (percent / 12 / 100)), amount)) / (Math.pow((1 + (percent / 12 / 100)), amount) - 1));
    }
}
