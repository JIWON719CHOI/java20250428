package leetCode;

public class JewelsAndStones771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
    }

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int j = 0; j < stones.length(); j++) {
            char stone = stones.charAt(j);
            for (int i = 0; i < jewels.length(); i++) {
                if (jewels.charAt(i) == stone) {
                    count++;
                }
            }
        }
        return count;
    }
}

