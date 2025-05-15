package ch12.lecture.p01object;

public class App03 {
    public static void main(String[] args) {
        Book03 a = new Book03();
        Book03 b = new Book03();
        a.setTitle("이것이 자바다");
        b.setTitle("이것이 자바다");

        // 같은 참조값인가?
        System.out.println(a == b); // false

        // equals : 내용물이 같은가
        System.out.println(a.equals(b)); //
    }
}

class Book03 {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // 필요하면 equals 메소드 재정의 해야 함
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book03) {
            Book03 o = (Book03) obj;
            return this.title.equals(o.getTitle());
        }
        return false;
    }
}