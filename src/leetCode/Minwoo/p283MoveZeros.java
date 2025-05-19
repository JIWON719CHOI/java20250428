package leetCode.Minwoo;

import java.util.Arrays;

public class p283MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    //283
    public static void moveZeroes(int[] nums) {
        int idx = 0; // 0이 아닌 숫자를 넣을 위치
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx] = nums[i]; // 0 이 아니면 앞으로 땡김
                idx++; // 다음 자리로 이동
            }
        }

        for (int j = idx; j < nums.length; j++) { // 남은 자리에 전부 0 넣기
            nums[j] = 0;
        }
    }
}
