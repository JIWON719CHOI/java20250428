package leetCode;

public class ValidPalindrome125LongVersion {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s)); // true 출력
    }

    public static boolean isPalindrome(String s) {
        String cleaned = "";

        // 1. 영어/숫자만 남기고 소문자로 바꾸기
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleaned += Character.toLowerCase(c);
            }
        }

        // 2. 뒤집은 문자열 만들기
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // 3. 같은지 비교
        return cleaned.equals(reversed);
    }
}
