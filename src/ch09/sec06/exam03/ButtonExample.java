package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        // Ok Button 생성
        Button btnOk = new Button();

        // OK Button 클릭 이벤트를 처리할 ClickListener 구현 클래스 (local class)
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("CLICK🖱️");
            }
        }

        // Ok Button object 에 ClickListener 구현 객체 주입 (위에 있는 거.)
        btnOk.setClickListener(new OkListener());

        // Ok Button Click!
        btnOk.click();

        //=========================================================================

        // Cancel Button!
        Button btnCancel = new Button();

        // Cancel Button 클릭 이벤트를 처리할 ClickListener 구현 클래스 local class
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("CANCEL🖲️");
            }
        }

        // Cancel Button object에 ClickListener 구현 객체 삽입 바로 위에 거.
        btnCancel.setClickListener(new CancelListener());

        // Cancel Button Click!
        btnCancel.click();
    }
}
