package creditPaymentService;

public class creditPaymentService {

    public int calculate (double credit, double procent, int years) {

        double one = (procent / 12 / 100);
        double Two = (1 + one);
        double three = Math.pow(Two, years);
        double payment =  credit * one * three / (three - 1);

        return  (int) payment;

    }
}
