package ch18.exercise.p07;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch18/exercise/p07/Example.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNum = 0;
        String rowData;
        while (true) {
            rowNum++;
            rowData = br.readLine();
            if (rowData == null) break;
            System.out.println(rowNum + "\t" + rowData);
        }
        br.close();
        fr.close();
    }
}
