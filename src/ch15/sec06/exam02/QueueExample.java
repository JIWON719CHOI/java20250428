package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue Collection
        Queue<Message> messageQueue = new LinkedList<>();

        // message
        messageQueue.offer(new Message("sendMail", "HONG"));
        messageQueue.offer(new Message("sendSMS", "SHIN"));
        messageQueue.offer(new Message("sendKakao", "KIM"));

        // 메세지를 하나씩 꺼내여 처리 .. 비어있지 않다면 반복
        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "📨");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "📱");
                    break;
                case "sendKakao":
                    System.out.println(message.to + "🥭");
                    break;
            }
        }
    }
}
