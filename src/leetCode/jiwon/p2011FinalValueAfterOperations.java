package leetCode.jiwon;

public class p2011FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};

        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.contains("++")) {
                x++;
            } else if (operation.contains("--")) {
                x--;
            }
        }
        return x;
    }

}