package Lec5_Behavioural_design_patterns.stratergy_pattern.src;

/**
 * @author Guddu Kumar Yadav
 * @created 20/10/2024 - 08:18 AM
 * @project LLD_Series
 * @description Concrete strategy class for cash payment.
 */
public class CashPayment implements PaymentStratergy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash.");
    }
}
