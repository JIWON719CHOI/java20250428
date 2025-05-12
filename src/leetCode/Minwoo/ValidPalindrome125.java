package leetCode.Minwoo;

public class ValidPalindrome125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(
                s.replaceAll("[^A-Za-z0-9]", "")
                        .toLowerCase()
                        .equals(new StringBuilder(s.replaceAll("[^A-Za-z0-9]", "")
                                .toLowerCase())
                                .reverse()
                                .toString())
        );  // true 출력
    }

    public boolean isPalindrome(String s) {
        /// 문자열의 양쪽 끝 인덱스를 나타냄 : left는 왼쪽에서 시작, right는 오른쪽 끝에서 시작
        int left = 0;
        int right = s.length() - 1;

        /// 왼쪽이 오른쪽보다 앞에 있을 때까지만 반복 : 글자를 비교하면서 안쪽으로 좁혀옴
        while (left < right) {
            /// left 위치에 영어/숫자가 아니면 → 넘김 : 예) 공백, 쉼표, 느낌표 같은 건 무시
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            /// 오른쪽도 마찬가지 : 영어/숫자 아닌 건 스킵
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            /// 왼쪽 글자와 오른쪽 글자를 소문자로 바꿔서 비교 : 다르면 → 회문이 아님 → false 리턴
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            /// 양쪽을 한 칸씩 안쪽으로 이동 : 다음 글자 비교하러 감
            left++;
            right--;
        }
        /// 끝까지 다 같았으면 → 회문임 → true 리턴
        return true;
    }
}
