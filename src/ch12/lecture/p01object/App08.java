package ch12.lecture.p01object;

public class App08 {
    public static void main(String[] args) {
        Book08 b1 = new Book08("java", 5000);
        Book08 b2 = new Book08("git", 7000);

        System.out.println(b1.toString());
        System.out.println(b2.toString());

    }
}

class Book08 {
    private String title;
    private int price;

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    // toString: 이 객체를 설명하는 텍스트 리턴

    @Override
    public String toString() {
        String text = "제목: " + title + ", 가격: " + price;
        return text;
    }

    public Book08(String title, int price) {
        this.title = title;
        this.price = price;
    }
}
