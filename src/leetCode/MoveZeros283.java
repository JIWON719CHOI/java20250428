package leetCode;

import java.util.Arrays;

public class MoveZeros283 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    //283
    public static void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        for (int j = idx; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
