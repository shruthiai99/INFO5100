package neu_5100;

public class Printer {
    private Printer() {
    }

    private static Printer _instance;
    private static Object obj = new Object();
    public String response = "Your printer is working";
    public static Printer getInstance() {
        if (_instance == null) {
            synchronized (obj) {
                _instance = new Printer();
            }
        }
        return _instance;
    }
}
