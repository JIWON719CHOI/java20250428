package ch05.Exercise;

public class Exercise08 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        // 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성.(for 문)

        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                sum2 += array[i][j];
            }
        }
        double avg = (double) sum2 / sum;
        System.out.println(avg);

        // gpt: 네, 전체 합과 평균을 구하는 로직은 맞습니다,
        // 다만 변수 이름이 조금 헷갈릴 수 있어서 가독성을 위해
        // 의미 있는 이름으로 바꾸는 걸 추천드립니다. 예를 들어:

        int totalSum = 0;
        int totalCount = 0;

        for (int i = 0; i < array.length; i++) {
            totalCount += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                totalSum += array[i][j];
            }
        }

        double average = (double) totalSum / totalCount;
        System.out.println("합계: " + totalSum);
        System.out.println("평균: " + average);

    }


}
