package neu_psa;

public class PaypalStrategy implements PaymentStrategy {

    private String email;
    public PaypalStrategy(String email){
        this.email = email;
    }
    @Override
    public void pay(int val) {
        System.out.println("Paypal : $"+val);
    }
}
