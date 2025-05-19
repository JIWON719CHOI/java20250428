package leetCode.Minwoo;

public class p485FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    //485
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCnt = 0;
        int currentCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCnt++;
            } else {
                if (currentCnt > maxCnt) maxCnt = currentCnt;
                currentCnt = 0;
            }
        }

        maxCnt = Math.max(currentCnt, maxCnt);

        return maxCnt;
    }
}
