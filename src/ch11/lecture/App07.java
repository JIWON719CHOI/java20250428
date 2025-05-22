package ch11.lecture;

public class App07 {
    public static void main(String[] args) {
        try {
            int[] arr = {5, 0};
            // 아리스.. 인덱스.. 오류
            int c = arr[0] / arr[1];
            System.out.println("c = " + c);
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("⚠️" + e.getMessage());
        }
    }
}
