package 상속기본;
// 상속 : 부모 클래스의 유산(필드, 메서드)을 자식 클래스에게 물려주는 것
// 상속을 하는 목적
// 1. 재사용성 : 기존 클래스를 재사용, 새로운 클래스를 작성할 수 있음.
// 상속 받은 기능을 변경하면 오버라이딩 (다형성)
// - extends : 상속 받을 때 사용하는 키워드
// 자식 클래스는 부모 클래스의 모든 내용을 포함하고 있기 때문에 같거나 크다.


public class InheritanceBasic {
    public static void main(String[] args) {
        HouseDog dog = new HouseDog(); // Dog 클래스 dog 객체 생성
        dog.setName("댕댕");
        System.out.println(dog.getName());
        dog.sleep();
    }
}

class Animal {
    String name;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
}

// Animal 클래스로부터 상속 받음
class Dog extends Animal{
    void sleep(){
        System.out.println(this.name + "이가 zzzz");
    }
}

class HouseDog extends Dog{
    @Override // 오버라이딩 관계 성립 여부 확인하는 어노테이션
    // 자바에선 오버라이딩 관계가 성립되면 무조건 자식의 메서드가 불림.
    void sleep(){
        System.out.println(name + "이가 집에서 zzz");
    }

    // 오버 로딩
    void sleep(int hour){
        System.out.println(name + "이가 집에서 " + hour + "시간 동안 잠을 잡니다.");
    }
}