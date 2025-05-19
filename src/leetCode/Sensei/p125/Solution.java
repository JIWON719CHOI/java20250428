package leetCode.Sensei.p125;

class Solution {
    public boolean isPalindrome(String s) {
        boolean result = true;

        // s = "A man, a plan, a canal: Panama"
        // s = "a man, a plan, a canal: panama"
        // s = "race a car"

        String t = s.toLowerCase();

        int red = 0;
        int blue = t.length() - 1;

        while (red < blue) {
            while (red < t.length() && !(('a' <= t.charAt(red) && t.charAt(red) <= 'z')
                    || ('0' <= t.charAt(red) && t.charAt(red) <= '9'))) {
                red++;
            }
            while (blue > 0 && !(('a' <= t.charAt(blue) && t.charAt(blue) <= 'z')
                    || ('0' <= t.charAt(blue) && t.charAt(blue) <= '9'))) {
                blue--;
            }

            if (!(red < t.length() && blue > 0)) {
                break;
            }

            // 펠린드롬인지 검사
            // 아니면 result = false;
            if (t.charAt(red) != t.charAt(blue)) {
                result = false;
            }


            red++;
            blue--;
        }

        return result;
    }
}
