package ch11.exercise.p06;

public class App {
    public static void main(String[] args) {
        String[] strArray = {"10", "2a"};
        int value= 0;
        for (int i=0; i<= 2; i++){
            try {
                value = Integer.parseInt(strArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("OutOfIndex");
            } catch (NumberFormatException e){
                System.out.println("NumberFormat X");
            } finally {
                System.out.println(value);
            }
        }
    }
}
