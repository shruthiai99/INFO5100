package neu_psa;

public class CreditCardStrategy implements PaymentStrategy {

    private String cardNumber;

    public CreditCardStrategy(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int val) {
        System.out.println("Credit card : $"+val);
    }
}
