package ch13.lecture.p00generic;

public class App05 {
    public static void main(String[] args) {

    }
}

// 타입파라미터는 여러개 정의 가능
class Container<T, U> {
    private T item1;
    private U item2;


    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public U getItem2() {
        return item2;
    }

    public void setItem2(U item2) {
        this.item2 = item2;
    }
}