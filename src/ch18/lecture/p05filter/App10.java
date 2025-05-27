package ch18.lecture.p05filter;

import java.io.*;

public class App10 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 직렬화 가능한 객체만
        // ObjectInputStream, ObjectOutputStream  으로
        // 역직렬화, 직렬화 가능.

        Book10 book = new Book10("java", 3000);

        String file = "C:/Temp/filter10.txt";

        // 객체를 직렬화로 파일에 쓰기
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);

        try (oos; os) {
            oos.writeObject(book);
            oos.flush();
        }

        // 파일에 있는 데이터를 읽어서 역직렬화해서 객체로 얻기
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);

        try (ois; is) {
            Object o = ois.readObject();
            if (o instanceof Book10 b) {
                System.out.println("b = " + b);
            }
        }

    }
}

// Serializable: 인터페이스를 구현한 클래스의 객체만 직열화(또는 역직렬화) 가능

class Book10 implements Serializable {
    private String title;
    private Integer price;

    public Book10(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book10{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}