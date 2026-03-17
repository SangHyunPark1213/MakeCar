package 딜리버리예시;

public class Del {
    String company; // 배송회사 이름

    // 생성자는 클래스 이름과 동일, 반환 타입이 없음, 객체 생성시 호출, 오버로딩 가능
    // 접근제한자가 public이 없으면 다른 패키지에 있는 클래스는 생성할 수 없음
    public Del(String company) {
        this.company = company;
    }

    public void deliver() {
        System.out.println("배송을 시작합니다.");
    }

    public String getCompany(){
        return company;
    }
}

// Del 상속받아 ParcelDel 클래스 생성
class ParcelDel extends Del {
    public ParcelDel(String company){
        super(company);
    }
    @Override // 오버라이딩 관계가 성립하는지 문법적으로 체크해주는 역할
    // 오버라이딩 하기 위해서는 변수명, 반환타입 외에도 접근제한자를 동일하거나 더 넓은 범위로 설정해야함
    public void deliver(){
        System.out.println("택배 배송을 시작합니다. 2~3일 소요됩니다.");
    }
}

class QuickDel extends Del {
    public QuickDel(String company){
        super(company); // 부모의 생성자를 호출함
    }
    @Override
    public void deliver(){
        System.out.println("퀵 배송을 시작합니다. 당일 도착 예정입니다.");
    }
}

class AirDel extends Del {
    public AirDel(String company) {
        super(company);
    }
    @Override
    public void deliver(){
        System.out.println("항공 배송을 시작합니다. 해외로 출발합니다.");
    }
}