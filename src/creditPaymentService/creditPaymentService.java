package CreditPaymentService;

public class CreditPaymentService {

    public int calculate (double credit, double procent, int years) {

        double quarterlyInterestRate = (procent / 12 / 100);
        double onePlusInterestRate = (1 + quarterlyInterestRate);
        double monthlyInterestFactor = Math.pow(onePlusInterestRate, years);
        double payment =  credit * quarterlyInterestRate * monthlyInterestFactor / (monthlyInterestFactor - 1);

        return  (int) payment;

    }
}
