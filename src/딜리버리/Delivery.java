package 딜리버리;

public class Delivery {
    void deliver() {
        System.out.print("배송을 시작합니다. ");
    }
}

class Parcel extends Delivery{
    @Override
    void deliver() {
        System.out.println("택배 배송을 시작합니다. 2~3일 소요됩니다.");
    }
}
class Quick extends Delivery{
    @Override
    void deliver() {
        System.out.println("퀵 배송을 시작합니다. 당일 도착 예정입니다.");
    }
}
class Air extends Delivery{
    @Override
    void deliver() {
        System.out.println("항공 배송을 시작합니다. 해외로 출발합니다.");
    }
}
class Manager {
    String company;
    public Manager(String company) {
        this.company = company;
    }
    void send(Delivery delivery) {
        System.out.print(company + "회사가 배송을 진행합니다. ");
        delivery.deliver();
    }
}