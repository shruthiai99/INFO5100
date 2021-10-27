package neu_5100;

public abstract class Moody {
    abstract String getMood();

    abstract void expressFeelings();

    public void queryMood(Moody moody){
        System.out.println(moody);
    }
}
