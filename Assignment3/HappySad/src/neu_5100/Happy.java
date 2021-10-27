package neu_5100;

public class Happy extends Moody{
    @Override
    String getMood() {
        return "I feel happy today";
    }

    @Override
    void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString(){
        return "Subject laughs a lot";
    }
}
