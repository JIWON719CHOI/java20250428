package ch19.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class App02Server {
    public static void main(String[] args) throws Exception {
        String file = "images/bee.jpg";

        // server : client 기다림
        ServerSocket serverSocket = new ServerSocket(9876);
        Socket socket = serverSocket.accept();

        try (socket; serverSocket) {

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

        }

    }
}