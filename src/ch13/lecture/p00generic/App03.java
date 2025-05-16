package ch13.lecture.p00generic;

public class App03 {
    public static void main(String[] args) {
        Box03 b = new Box03();
        b.setItem(3.14);
        Object item1 = b.getItem();
        System.out.println("item1 = " + item1);
        b.setItem(99);
        Object item2 = b.getItem();
        System.out.println("item2 = " + item2);
        if (item2 instanceof String) {
            String x = (String) item2; // ClassCastException
            x.toUpperCase();
        }

        b.setItem("java");
        Object item3 = b.getItem();
        System.out.println("item3 = " + item3);

        if (item3 instanceof String) {
            String item = (String) item3;
            String u = item.toUpperCase();
            System.out.println("u = " + u);
        }
    }
}

class Box03 {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}