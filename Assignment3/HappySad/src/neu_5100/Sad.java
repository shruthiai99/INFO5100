package neu_5100;

public class Sad extends  Moody{

    @Override
    String getMood() {
        return "I feel sad today";
    }

    @Override
    void expressFeelings() {
        System.out.println("'waah'  'boo hoo'  'weep' 'sob'");
    }

    public String toString(){
        return "Subject cries a lot";
    }
}
