package ch19.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class App03Server {
    public static void main(String[] args) throws Exception {
        String file = "images/bee.jpg";

        // server : client 기다림
        ServerSocket serverSocket = new ServerSocket(9876);

        try (serverSocket) {
            for (int i = 0; i < 20; i++) {
                Socket socket = serverSocket.accept();

                Thread t = new Thread(() -> {
                    try (socket) {

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
                });
                t.start();

                System.out.println((i + 1) + "명이 다운로드 함");
            }
        }

    }
}