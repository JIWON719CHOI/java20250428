package ch13.lecture.p00generic;

import ch07.exercise.p12.B;
import ch13.sec01.Box;

public class App07 {
    public static void main(String[] args) {
        Box07<Number> b1 = new Box07<>();
        b1.setItem(3.14); // Double
        b1.setItem(99); // Integer

        //
        Integer b = 3;
        Number a = b; // ok

        Box07<Integer> b3 = new Box07<>();

//        Box07<Number> b2 = b3; // x
//        b2.setItem(88); // ok
//        b2.setItem(3.14); // ok

        // ? : wildcard
        Box07<Integer> b5 = new Box07<Integer>();
        Box07<Double> b6 = new Box07<Double>();
        Box07<Number> b7 = new Box07<Number>();
        Box07<Object> b8 = new Box07<>();
        Box07<? extends Number> b4 = b5;
        b4 = b6;
        b4 = b7;
//        b4 = b8;//x

        // Number 타입으로 안전하게 꺼낼 수 있음(get)
        // (box 입장에서 produce)
        Number item = b4.getItem();
        item.intValue();

        Box07<Number> b10 = new Box07<Number>();
        Box07<Object> b11 = new Box07<Object>();
        Box07<? super Number> b9;
        b9 = b10;
        b9 = b11;

        // 안전하게 set 할 수 있음
        // (box 입장에서 consume)
        b9.setItem(9);
        b9.setItem(3.14);

        // ?
        Box07<Object> b13 = new Box07<>();
        Box07<Number> b14 = new Box07<>();
        Box07<Integer> b15 = new Box07<>();
        Box07<Double> b16 = new Box07<>();
        Box07<Boolean> b17 = new Box07<>();
        Box07<?> b12;

        b12 = b13;
        b12 = b14;
        b12 = b15;
        b12 = b16;
        b12 = b17;
    }
}

class Box07<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}