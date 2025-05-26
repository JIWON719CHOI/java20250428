package ch18.lecture.p05filter;

import java.io.*;

public class App03 {
    public static void main(String[] args) throws IOException {
        buffered();

        notBuffered();
    }

    private static void notBuffered() throws IOException {
        long start = System.nanoTime();
        String file = "C:/Temp/filter03.txt";

        Writer writer = new FileWriter(file);


        try (writer) {
            for (int i = 0; i < 1_000_000; i++) {
                writer.write("this is java");
                writer.write("\n");
            }
            writer.flush();
        }
        long end = System.nanoTime();
        System.out.println("(end - start) = " + (end - start));
    }

    private static void buffered() throws IOException {
        long start = System.nanoTime();
        String file = "C:/Temp/filter03.txt";

        Writer writer = new FileWriter(file);
        BufferedWriter br = new BufferedWriter(writer);


        try (br; writer) {
            for (int i = 0; i < 1_000_000; i++) {
                br.write("this is java");
                br.newLine();
            }
            br.flush();
        }
        long end = System.nanoTime();
        System.out.println("(end - start) = " + (end - start));
    }
}
