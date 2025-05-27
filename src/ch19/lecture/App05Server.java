package ch19.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class App05Server {
    public static void main(String[] args) {
        // client 가 보낸 파일 받기
        try (ServerSocket serverSocket = new ServerSocket(9876);) {

            for (int i = 0; i < 100; i++) {
                try {
                    String fileName = "C:/Temp/download/download" + (i + 1) + ".jpg";
                    Socket socket = serverSocket.accept();
                    int count = i + 1;

                    Thread thread = new Thread(() -> {
                        try {
                            InputStream is = socket.getInputStream();
                            BufferedInputStream bis = new BufferedInputStream(is);
                            OutputStream os = new FileOutputStream(fileName);
                            BufferedOutputStream bos = new BufferedOutputStream(os);

                            try (is; bis; os; bos) {
                                byte[] data = new byte[1024];
                                int len = 0;

                                while ((len = bis.read(data)) != -1) {
                                    bos.write(data, 0, len);
                                }
                                bos.flush();

                            }
                            System.out.println(count + "번 째 파일 받음");

                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                socket.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    thread.start();

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}