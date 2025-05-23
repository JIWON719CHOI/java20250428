package ch11.lecture;

public class App11 {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String3");
            System.out.println("...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
