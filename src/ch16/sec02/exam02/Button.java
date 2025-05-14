package ch16.sec02.exam02;

public class Button {
    // static member interface
    @FunctionalInterface // 함수형 인터페이스
    public static interface ClickListener {
        // abstract method
        void onClick();
    }

    // field
    private ClickListener clickListener;

    // method
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
