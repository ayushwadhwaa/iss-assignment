// Cash Payment implementation of Payment interface
class CashPayment implements PaymentInt{
    // method implementation according to cash payment functionality
    public void payment(double amount) {
        System.out.println("Cash Payment of amount " + amount);
    }
}
//Cheque Payment implementation of Payment interface
class ChequePayment implements PaymentInt{
    // method implementation according to cheque payment functionality
    public void payment(double amount) {
        System.out.println("Cheque Payment of amount " + amount);  
    }
}
//CreditCard Payment implementation of Payment interface
class CreditCardPayment implements PaymentInt{
    // method implementation according to credit card payment functionality
    public void payment(double amount) {
        System.out.println("CreditCard Payment of amount " + amount);
    }
}
public class PaymentDemo {
public static void main(String[] args) {
    // Payment interface reference holding the CashPayment obj
    PaymentInt paymentInt = new CashPayment();
    paymentInt.payment(134.67);
    // Payment interface reference holding the CreditCardPayment obj
    paymentInt = new CreditCardPayment();
    paymentInt.payment(2347.89);
    // Payment interface reference holding the ChequePayment obj
    paymentInt = new ChequePayment();
    paymentInt.payment(1567.45);
    }
}