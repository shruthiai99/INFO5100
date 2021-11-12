package neu_5100;

public class Main {

    public static void main(String[] args) {
        Moody happy = new Happy();
        Moody sad = new Sad();
        Psychiatrist psychiatrist = new Psychiatrist();

        psychiatrist.examine(happy);
        psychiatrist.observe(happy);
        System.out.println(happy);
        System.out.println();

        psychiatrist.examine(sad);
        psychiatrist.observe(sad);
        System.out.println(sad);
    }
}
