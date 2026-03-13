package 택배배송시스템t;

public class Manager {
    String name;
    Manager(String name){
        this.name = name;
    }

    public void send(Del d){
        System.out.println(name + "가" + d.getCompany() + "회사의 배송을 시작합니다.");
        d.deliver();
    }
}
