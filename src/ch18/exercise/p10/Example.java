package ch18.exercise.p10;

import java.io.*;

public class Example {
    public static void main(String[] args) {
        String origin = "./images/eagle.jpg";
        String target = "C:/Temp/eagle.jpg";

        // try-with-resources 에서 기반 스트림까지 한 번에 닫기
        try (
                InputStream is = new BufferedInputStream(new FileInputStream(origin));
                OutputStream os = new BufferedOutputStream(new FileOutputStream(target));
        ) {
            // 좀 더 일반적인 버퍼 크기 (8192 = 8KB)
            byte[] buffer = new byte[8192];
            int length;

            while ((length = is.read(buffer)) != -1) {
                os.write(buffer, 0, length);
            }

            // 명시적 flush (BufferedOutputStream 이니까 확실히 밀어주는 게 안전)
            os.flush();

            System.out.println("DONE!");
        } catch (IOException e) {
            System.err.println("파일 복사 중 오류 발생: " + e.getMessage());
        }
    }
}
