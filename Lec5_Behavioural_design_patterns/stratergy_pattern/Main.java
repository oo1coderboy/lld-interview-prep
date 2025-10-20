package Lec5_Behavioural_design_patterns.stratergy_pattern;

import Lec5_Behavioural_design_patterns.stratergy_pattern.src.CashPayment;
import Lec5_Behavioural_design_patterns.stratergy_pattern.src.CreditCardPayment;
import Lec5_Behavioural_design_patterns.stratergy_pattern.src.PaymentStratergy;

/**
 * @author Guddu Kumar Yadav
 * @created 20/10/2024 - 08:15 AM
 * @project LLD_Series
 * @description Main class to demonstrate the Strategy Design Pattern.
 */
public class Main {
    public static void main(String[] args) {
        PaymentStratergy pStratergy;

        // Using Cash Payment Strategy
        pStratergy = new CashPayment();
        pStratergy.pay(100.0);

        // Using Credit Card Payment Strategy
        pStratergy = new CreditCardPayment();
        pStratergy.pay(349.90);
    }
}
