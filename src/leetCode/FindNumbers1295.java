package leetCode;

public class FindNumbers1295 {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(arr));
    }

    //1295
    public static int findNumbers(int[] nums) {
        int cnt = 0;
        for (int num : nums) {
            int numDigit = String.valueOf(num).length();
            if (numDigit % 2 == 0) cnt++;
        }

        return cnt;
    }
}
