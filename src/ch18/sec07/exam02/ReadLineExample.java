package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        // FileReader에 BufferedReader 보조 스트림 연결
        BufferedReader br = new BufferedReader(new FileReader("src/ch18/sec07/exam02/ReadLineExample.java"));

        int lineNo = 1;
        while (true) {
            String str = br.readLine(); // 1행을 읽음
            if (str == null) break; // 더이상 읽을 내용이 없으면 while문 종료
            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }

        br.close(); // BufferedReader 를 닫으면 연결된 FileReader 도 닫힘
    }
}
