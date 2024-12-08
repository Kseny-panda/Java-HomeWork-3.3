import CreditPaymentService.CreditPaymentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Кредит: " + 1_000_000 + " рублей. Ставка: " + 9.99 + "%. Срок: " + 12 + " месяцев");
        System.out.println("Ежемесячный платёж: " + service.calculate(1_000_000, 9.99, 12));

        System.out.println();
        System.out.println("Кредит: " + 1_000_000 + " рублей. Ставка: " + 9.99 + "%. Срок: " + 12 + " месяцев");
        System.out.println("Ежемесячный платёж: " + service.calculate(1_000_000, 9.99, 24));

        System.out.println();
        System.out.println("Кредит: " + 1_000_000 + " рублей. Ставка: " + 9.99 + "%. Срок: " + 12 + " месяцев");
        System.out.println("Ежемесячный платёж: " + service.calculate(1_000_000, 9.99, 36));
    }
}