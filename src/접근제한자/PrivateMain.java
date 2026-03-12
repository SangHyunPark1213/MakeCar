package 접근제한자;
// 접근제한자 : 데이터 은닉을 위해서 사용 (내부의 필드 값이 잘못 변경되는 것을 방지 하기 위해서 사용)
// 게터와 세터 메서드 : 은닉 된 데이터의 값을 읽고 쓰기 위해서 사용한다.
// public : 접근 제한 없음 (클래스, 필드, 생성자, 메서드)
// protected : 같은 패키지 내에 있거나, 다른 패키지에 있더라도 상속 관계가 있다면 접근 가능 (필드, 생성자, 메서드)
// default(기본값) : 같은 패키지 내에서만 접근 가능
// private : 같은 클래스 내부에서만 접근 가능 (필드, 생성자, 메서드)
public class PrivateMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getName());
        System.out.println(child.getAddress());
        System.out.println(child.getMoney());

    }
}
class Child extends Parent{
}
