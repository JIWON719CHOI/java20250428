package ch09.sec06.exam03;

public class Button {
    // static member interface
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
        this.clickListener.onClick(); // Button 이 클릭되면 실행하는 메소드 선언
    }
}
