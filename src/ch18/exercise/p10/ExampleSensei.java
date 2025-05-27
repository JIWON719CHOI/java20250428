package ch18.exercise.p10;

import java.io.*;
import java.util.Scanner;

public class ExampleSensei {
    public static void main(String[] args) throws IOException {

        /// 🖋️ 사용자 입력 부분
        /// 사용자로부터 입력받을 파일 경로(원본, 복사 대상)를 저장할 변수 선언
        String originFileName = null;
        String targetFileName = null;

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("원본 파일 경로:");
        originFileName = scanner.nextLine();
        System.out.print("복사 파일 경로:");
        targetFileName = scanner.nextLine();
         */

        /// 표준 입력(System.in)을 문자로 읽을 수 있도록 InputStreamReader 사용
        /// → 여기에 BufferedReader를 덧붙여 한 줄씩 읽기 가능하게 함
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        /// 사용자에게 원본 파일 경로 입력 요청 → 한 줄 읽어 originFileName에 저장
        System.out.print("원본 파일 경로:");
        originFileName = br.readLine();

        /// 사용자에게 복사할 대상 경로 입력 요청 → 한 줄 읽어 targetFileName에 저장
        System.out.print("복사 파일 경로:");
        targetFileName = br.readLine();

        /// BufferedReader, InputStreamReader를 자동으로 닫도록 설정 (try-with-resources 사용)
        try (br; isr) {
            /// 🗂️ 파일 경로 및 디렉토리 준비
            /// 입력된 원본 경로로 File 객체 생성
            File originalFile = new File(originFileName);

            /// 원본 파일이 실제로 존재하는지 확인
            if (originalFile.exists()) {

                /// 복사 경로에서 마지막 슬래시(디렉토리 구분자) 위치 확인 → 디렉토리 부분 추출하기 위함
                int lastSlashIndex = targetFileName.lastIndexOf("/");

                /// 복사 대상 파일의 디렉토리만 추출하여 File 객체 생성
                File directory = new File(targetFileName.substring(0, lastSlashIndex));

                /// 복사 대상 디렉토리가 존재하지 않으면 생성 (mkdirs()는 중간 디렉토리까지 생성 가능)
                if (!directory.exists()) directory.mkdirs();

                /// 📦 파일 복사 준비 및 실행
                /// 바이트 기반 입력/출력 스트림 생성 (원본 → 대상)
                InputStream is = new FileInputStream(originalFile);
                OutputStream os = new FileOutputStream(targetFileName);

                /// 성능 향상을 위한 보조 스트림으로 감쌈 (버퍼를 사용)
                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                /// 4개의 스트림 모두 try-with-resources로 자동 닫기 설정
                try (bos; bis; os; is;) {

                    /// 1KB 버퍼 생성 / 읽어올 데이터 길이 변수 선언
                    byte[] data = new byte[1024];
                    int len = 0;

                    /// 파일에서 데이터를 읽어오고, 읽은 만큼 복사 대상에 기록
                    while ((len = bis.read(data)) != -1) {
                        bos.write(data, 0, len);
                    }

                    /// BufferedOutputStream에 남아 있는 데이터 강제로 파일에 씀 (중요)
                    bos.flush();
                }

                /// 복사가 정상적으로 완료되었음을 알림
                System.out.println("복사가 성공되었습니다.");
            } else {
                /// ❌ 예외 처리 및 실패 케이스 원본 파일이 없을 경우 사용자에게 알림
                System.out.println("원본 파일이 존재하지 않습니다.");
            }
        }
    }
}