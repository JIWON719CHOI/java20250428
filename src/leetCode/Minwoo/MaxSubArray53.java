package leetCode.Minwoo;

public class MaxSubArray53 {

    public static void main(String[] args) {
        int[] arr = {-2, -1};
        System.out.println(maxSubArray(arr));
    }

    //53
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // 지금 수 하나만 쓸지, 누적합에 더할지 선택
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // 최대값 갱신
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
