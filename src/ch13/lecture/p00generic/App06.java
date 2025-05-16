package ch13.lecture;

public class App06 {
}

// bounded type parameter
class Box062<T extends String> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void action() {
        // Object의 메소드 사용가능
//        String o = (String) item;
//        o.toUpperCase();

        // bounded type parameter로 특정 타입의 메소드 안전하게 사용 가능
        item.toUpperCase();
    }
}

class Box061<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void some() {
        // item의 메소드는 Object의 것만 사용 가능
        System.out.println(item.hashCode());
        System.out.println(item.toString());
        System.out.println(item.equals(null));
    }
}