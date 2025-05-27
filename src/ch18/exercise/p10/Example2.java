package ch18.exercise.p10;

import java.io.*;

public class Example2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:/Temp/dir2");
        File origin = new File("./images/shark.jpg");
        File target = new File("C:/Temp/dir2/shark.jpg");

        if (!f1.exists()) {
            System.out.println("⚠️원본 파일이 존재하지 않습니다!");
            f1.mkdirs();
            try (
                    InputStream is = new BufferedInputStream(new FileInputStream(origin));
                    OutputStream os = new BufferedOutputStream(new FileOutputStream(target));
            ) {
                byte[] buffer = new byte[8192];
                int length;

                while ((length = is.read(buffer)) != -1) {
                    os.write(buffer, 0, length);
                }
                os.flush();

                System.out.println("원본 파일 경로: " + origin);
                System.out.println("복사 파일 경로: " + target);
                System.out.println("✅복사가 성공되었습니다!");
            }
        } else if (f1.exists() && target.exists()) {
            System.out.println("원본 파일 경로: " + origin);
            System.out.println("복사 파일 경로: " + target);
            System.out.println("⚠️복사 파일이 이미 존재합니다!");
        }
    }
}