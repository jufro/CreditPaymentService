public class Main {
    public static void main(String[] args) {
        CreditPayment payment = new CreditPayment();

        int creditForOneYear = (int) payment.calculate(1000000, 9.99, 12);
        System.out.println(creditForOneYear);

        int creditForTwoYears = (int) payment.calculate(1000000, 9.99, 24);
        System.out.println(creditForTwoYears);

        int creditForThreeYears = (int) payment.calculate(1000000, 9.99, 36);
        System.out.println(creditForThreeYears);
    }
}
