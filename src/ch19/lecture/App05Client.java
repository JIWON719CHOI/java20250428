package ch19.lecture;

import java.io.*;
import java.net.Socket;

public class App05Client {
    public static void main(String[] args) {
        // server 에게 파일 보내기
        // 192.168.0.5 , 9876

        String file = "images/Jujutsu.png";


        try (Socket socket = new Socket("192.168.0.5", 9876);) {
            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);
            // os로 파일 보내기
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);

            try (bis; fis; bos; os) {
                byte[] data = new byte[1024];
                int len = 0;

                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
