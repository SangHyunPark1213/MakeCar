package 택배배송시스템t;

public class Del {
    String company;

    // 생성자는 클래스 이름과 동일, 반환 타입이 없음, 객체 생성 시 무조건 호출 없다면 기본 생성자를 컴파일러가 생성
    // 오버로딩 가능.
    // public이 없으면, 다른 패키지에서는 객체를 생성할 수 없음.
    public Del(String company){
        this.company = company;
    }

    public void deliver(){
        System.out.println("배송을 시작합니다.");
    }

    public String getCompany() {
        return company;
    }

}

class ParcelDelivery extends Del{
    public ParcelDelivery(String company){
        super(company);
    }
    @Override
    public void deliver() {
        System.out.println("택배 배송을 시작합니다. 2~3일 소요됩니다.");
    }
}

class QuickDelivery extends Del{
    public QuickDelivery(String company){
        super(company);
    }
    @Override
    public void deliver() {
        System.out.println("퀵 배송을 시작합니다. 당일 도착 예정입니다.");
    }
}

class AirDelivery extends Del{
    public AirDelivery(String company){
        super(company);
    }
    // 명시적으로 사용하는 것을 추천
    @Override // 오버라이딩 관계가 성립하는지 문법적으로 체크 ... 없어도 되긴 함
    public void deliver() {
        System.out.println("항공 배송을 시작합니다. 해외로 출발합니다.");
    }

}
