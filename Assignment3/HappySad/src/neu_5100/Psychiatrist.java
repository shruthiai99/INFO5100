package neu_5100;

public class Psychiatrist {
    public void examine(Moody moody){
        System.out.println("How are you feeling today?");
        System.out.println(moody.getMood());
    }

    public void observe(Moody moody){
        moody.expressFeelings();
    }

    public String toString(){
        return "";
    }
}
