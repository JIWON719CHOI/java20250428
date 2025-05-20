package ch15.lecture.p05queue;

import java.util.LinkedList;
import java.util.Queue;

public class App01 {
    public static void main(String[] args) {
        // queue(FIFO, First In First Out)
        // 먼저 들어간 객체가 먼저 출력됨

        Queue<String> queue = new LinkedList<>();

        // offer : 객체 넣기
        queue.offer("java");
        queue.offer("html");
        queue.offer("css");
        queue.offer("java");
        queue.offer("react");
        System.out.println("queue = " + queue);

        // poll : 객체 꺼내기
        String v1 = queue.poll();
        System.out.println("v1 = " + v1);
        System.out.println(queue);
        String v2 = queue.poll();
        System.out.println("v2 = " + v2);
        System.out.println(queue);

        // peek : 꺼낼 객체 살펴보기
        String v3 = queue.peek();
        System.out.println("v3 = " + v3);
        System.out.println(queue);

    }
}