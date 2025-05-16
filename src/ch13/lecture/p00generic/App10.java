package ch13.lecture.p00generic;

public class App10 {
}

class MyClass10 {
    public <T extends String> void action(T param) {
        param.toUpperCase();
    }
}