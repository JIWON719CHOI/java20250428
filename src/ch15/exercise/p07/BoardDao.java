package ch15.exercise.p07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<>();

        list.add(new Board("TITLE1", "CONTENT1"));
        list.add(new Board("TITLE2", "CONTENT2"));
        list.add(new Board("TITLE3", "CONTENT3"));

        return list;
    }
}
