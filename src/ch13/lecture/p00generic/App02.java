package ch13.lecture.p00generic;

public class App02 {
    public static void main(String[] args) {
        Box02 b = new Box02();
        b.setItem(3.14);
        Number item = b.getItem();
        System.out.println("item = " + item);

        b.setItem(99);
        Number item1 = b.getItem();
        System.out.println("item1 = " + item1);
    }
}

class Box02 {
    private Number item;

    public Number getItem() {
        return item;
    }

    public void setItem(Number item) {
        this.item = item;
    }
}