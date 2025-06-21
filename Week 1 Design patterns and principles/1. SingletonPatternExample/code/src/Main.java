
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Thread-safe Singleton Message.");

        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same (thread-safe) instance.");
        }
    }
}
