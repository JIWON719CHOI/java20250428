package ch05.Exercise;

import java.util.Arrays;

public class Exercise07 {
    public static void main(String[] args) {
        // 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요.(for문 이용)
        int[] arrays = {1, 5, 3, 8, 2};

        int max = arrays[0]; // 첫 번째 값을 기준으로 시작

        for (int i = 1; i < arrays.length; i++) { // i = 1 로 하는 이유: 이미 max 에서 0번째 시작하고
            if (arrays[i] > max) {                // 그래서 i는 그 다음 값 1 부터 해야 함.
                // 0부터 하면 자기 자신과 비교하는 의미없는 짓.
                System.out.println("max가 " + max + "에서 " + arrays[i] + "로 바뀜");
                max = arrays[i]; // 더 큰 값이 나오면 max를 바꿈
            }
        }
        System.out.println("최종 최대값: " + max);

        // sort
        System.out.println("------ sort ------");
        Arrays.sort(arrays);
        System.out.println("array[array.length - 1] = " + arrays[arrays.length - 1]);

        System.out.println("----------문제풀이---------------");
        int[] nums2 = {1, 2, 3, 4};
        int run = nums2[0];

        for (int i = 1; i < nums2.length; i++) {
            run = nums2[i] + run;
        }
        System.out.println(run);
    }

    public int[] runningSum(int[] nums) {
        int[] r = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            r[i] = sum;
        }
        return r;
    }
}

