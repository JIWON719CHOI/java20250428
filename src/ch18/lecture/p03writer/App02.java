package ch18.lecture.p03writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App02 {
    public static void main(String[] args) throws IOException {
        // byte 단위
        // inputStream, outputStream 으로
        // 문자 (ascii 코드 외) 를 읽고 쓰는게 넘나 불편한것..

        // 문자(Character) 단위 _ 영문 이외..
        // reader, writer 가 추가됨

        // writer : 문자 단위 출력 스트림

        String fileName = "C:/Temp/writer02.txt";
        try (Writer writer = new FileWriter(fileName)) {
            writer.write('a');
            writer.write(97);
            writer.write('걸');
            writer.write(44152);
            writer.flush();
        }
        System.out.println("DONE!");
    }
}
