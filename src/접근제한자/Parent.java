package 접근제한자;

public class Parent {
     private String name; // 부모님 이름
     private String  address; // 부모님 주소
     private int money; // 부모님 재산

    public Parent(){
        name = "부자 아빠";
        address = "서울시 강남";
        money = 1000000000; // 10억
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

