package ch18.lecture.p03writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App03 {
    public static void main(String[] args) throws IOException {
        try (Writer writer = new FileWriter("C:/Temp/writer03.txt")) {
            writer.write('a');
            writer.write('힝');
            writer.write("\uD83D\uDC36");
            writer.write('★');
            writer.write(2669);
            writer.write("\uD83E\uDE77");
            writer.write("⭐");
        }


    }
}
