package 싱글톤;

public class SingleTon {
    String name;
    int id;

    // static을 붙인 이유, 객체가 프로그램 종료시까지 소멸되지 않도록 하기 위해.
    private static SingleTon singleTon = new SingleTon();

    // 외부에서 객제 생성을 제한하기 위해 private 접근제한자를 붙인다.
    private SingleTon(){
        name = "김현중";
        id = 101;
    }

    // 해당 메서드 호출시 싱글톤 주소를 반환.
    static SingleTon getSingleTon(){
        return singleTon;
    }
}
