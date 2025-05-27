package ch19.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App04ServerOptimized {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10); // 스레드풀: 최대 10개의 클라이언트 동시 처리

        try (ServerSocket serverSocket = new ServerSocket(9876)) {
            System.out.println("서버 시작됨 (포트 9876)");

            while (true) { // 클라이언트 무제한 수용
                Socket socket = serverSocket.accept(); // 연결 대기
                String client = socket.getRemoteSocketAddress().toString();

                executor.execute(() -> {
                    try (socket; // Java 9 이상 가능: 자원 자동 닫기
                         InputStream is = socket.getInputStream();
                         InputStreamReader isr = new InputStreamReader(is);
                         BufferedReader br = new BufferedReader(isr)) {

                        String message;
                        while ((message = br.readLine()) != null) {
                            System.out.println("[" + client + "] " + message);
                        }
                    } catch (IOException e) {
                        System.err.println("[" + client + "] 통신 중 오류 발생: " + e.getMessage());
                    }
                });
            }
        } catch (IOException e) {
            System.err.println("서버 소켓 오류: " + e.getMessage());
        } finally {
            executor.shutdown(); // 서버 종료 시 스레드풀도 종료
        }
    }
}
