package 추상클래스;
// 추상 클래스
// - 객체를 만들 수 없는 클래스
// - 일반 메서드와 추상메서드가 함께 있을 수 있음.
// 사용 목적 - 공통 기능을 묶고, 자식 클래스가 반드시 구현해야 할 것을 강제할때
//

public class AbstractMain {
    public static void main(String[] args) {
        AndroidPhone phone = new AndroidPhone("Samsung", true);
        phone.call();
        phone.setMode(true);

        Iphone iphone = new Iphone("iPhone", true);
        iphone.call();
        iphone.setMode(true);

    }
}
