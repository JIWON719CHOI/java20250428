package ch19.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class App06Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9876);
        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        // request message
        // first line : METHOD PATH VERSION
        String line1 = br.readLine();
        System.out.println(line1);

        // 2번째 줄 부터 빈 줄까지.. : header
        String header = "";
        while (!(header = br.readLine()).isBlank()) {
            System.out.println(header);
        }

        // 빈 줄

        // 요청 본문 시작
        ///  //////////// ///
        /// /// 응답 /// ///
        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        PrintWriter pw = new PrintWriter(osw);

        String htmlCode = """
                <!doctype html>
                <html>
                    <body>
                        <h1> FIRST MEET PROGRAMMING ☝️</h1>
                        <p> 개어려워 🐶</p>
                    </body>
                </html>
                """;

        // first line
        // VERSION CODE STATUS
        pw.println("HTTP/1.1 200 OK");

        // second line ~ empty line
        // respond header
        pw.println("Content-Type: text/html; charset=UTF-8");
        pw.println("Content-Length: " + htmlCode.getBytes().length);

        // empty line
        pw.println();

        // 응답 본문
        pw.println(htmlCode);

        pw.flush();

    }
}
