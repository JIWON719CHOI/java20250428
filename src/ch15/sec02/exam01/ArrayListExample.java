package ch15.sec02.exam01;

import ch07.exercise.p12.B;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList Collection
        List<Board> list = new ArrayList<>();

        // Object
        list.add(new Board("Sub1", "Con1", "Wri1"));
        list.add(new Board("Sub2", "Con2", "Wri2"));
        list.add(new Board("Sub3", "Con3", "Wri3"));
        list.add(new Board("Sub4", "Con4", "Wri4"));
        list.add(new Board("Sub5", "Con5", "Wri5"));

        // 저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        // 특정 인덱스의 객체 가져오기
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();

        // 모든 객체를 하나씩 가져오기
        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();

        // 객체 삭제 .. 2번 인덱스를 삭제하면 3번 인덱스가 2번 인덱스로 변경되므로 다시 2번 인덱스 제거 가능
        list.remove(2);
        list.remove(2);

        // 향상된 for 문으로 모든 객체를 하나씩 가져오기
        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
    }
}
