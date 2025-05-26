package ch18.lecture.p05filter;

import java.io.*;

public class App04 {
    public static void main(String[] args) {
        String filePath = "C:/Temp/filter41.data";

        long start, end, diff;

        // 1. BufferedOutputStream 성능 측정
        start = System.nanoTime();
        writeWithBufferedOutputStream(filePath);
        end = System.nanoTime();
        diff = end - start;
        System.out.println("BufferedOutputStream = " + diff);

        // 2. BufferedInputStream 성능 측정
        start = System.nanoTime();
        readWithBufferedInputStream(filePath);
        end = System.nanoTime();
        diff = end - start;
        System.out.println("BufferedInputStream = " + diff);

        // 3. 일반 OutputStream 성능 측정
        start = System.nanoTime();
        writeWithOutputStream(filePath);
        end = System.nanoTime();
        diff = end - start;
        System.out.println("OutputStream = " + diff);

        // 4. 일반 InputStream 성능 측정
        start = System.nanoTime();
        readWithInputStream(filePath);
        end = System.nanoTime();
        diff = end - start;
        System.out.println("InputStream = " + diff);
    }

    // ✅ 버퍼 출력 스트림
    private static void writeWithBufferedOutputStream(String file) {
        try (OutputStream os = new FileOutputStream(file);
             BufferedOutputStream bos = new BufferedOutputStream(os)) {

            byte[] data = new byte[1024];
            for (int i = 0; i < 100 * 1024; i++) {
                bos.write(data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // ✅ 버퍼 입력 스트림
    private static void readWithBufferedInputStream(String file) {
        try (InputStream is = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(is)) {

            byte[] data = new byte[1024];
            while (bis.read(data) != -1) {
                // 읽기만 함
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // ✅ 일반 출력 스트림
    private static void writeWithOutputStream(String file) {
        try (OutputStream os = new FileOutputStream(file)) {

            byte[] data = new byte[1024];
            for (int i = 0; i < 100 * 1024; i++) {
                os.write(data);
            }
            os.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // ✅ 일반 입력 스트림
    private static void readWithInputStream(String file) {
        try (InputStream is = new FileInputStream(file)) {

            byte[] data = new byte[1024];
            while (is.read(data) != -1) {
                // 읽기만 함
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
