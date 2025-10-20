package Lec5_Behavioural_design_patterns.stratergy_pattern.src;

/**
 * @author Guddu Kumar Yadav
 * @created 20/10/2024 - 08:22 AM
 * @project LLD_Series
 * @description Concrete strategy class for UPI payment.
 */
public class UpiPayment implements PaymentStratergy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}
