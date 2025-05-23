package ch14.ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap((new HashMap<>()));

        // 작업 스레드 객체 생성
        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    map.put(i, "CONTENT: " + i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    map.put(i, "CONTENT: " + i);
                }
            }
        };

        threadA.start();
        threadB.start();

        // 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {

        }
        // 저장된 총 객체 수 얻기
        int size = map.size();
        System.out.println("TOTAL: " + size);
        System.out.println();
    }

}
