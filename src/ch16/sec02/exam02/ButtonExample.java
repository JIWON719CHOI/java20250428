package ch16.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        // Ok button object
        Button btnOk = new Button();

        // Ok button object Lambda(ClickListener Anonymous Object 주입)
        btnOk.setClickListener(() -> {
            System.out.println("Button Click!"); // 매개값으로 람다식 대입
        });

        // Ok button Click!
        btnOk.click();

        // Cancel button
        Button btnCancel = new Button();

        // Cancel button object Lambda(ClickListener Anonymous Object 주입)
        btnCancel.setClickListener(() -> {
            System.out.println("Button Cancel!"); // 매개값으로 람다식 대입
        });

        // Cancel button Click!
        btnCancel.click();
    }
}
