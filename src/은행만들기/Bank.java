package 은행만들기;
// 정적 멤버(필드) : static 키워드 사용 클래스 생성시 생성되며, 객체 생성시 생성되지 않음
// 정적 메서드 : static 키워드 사용

public class Bank {
    private static int count = 0; // 정적 필드, Bank 클래스 생성시 1번만 생성됨
    private int account; // 잔액을 누적하기 위한 인스턴스 필드 객체 생성시 객체마다 1개씩 만들어짐
    private  String bank; // 은행 이름, 인스턴스 필드



    public Bank(String bank, int account){
        this.bank = bank;
        this.account = account;
        count++; // 생성자 호출 시 값을 증가시킴.
        System.out.println(bank + "은행에 게좌를 개설합니다.\n" + "잔액은 " + account + "원 입니다.");
    }

    public static void setCount(int count) {
        Bank.count = count;
    }

    public int getAccount() {
        return account;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public static int getCount(){ // 정적 메서드, 클래스 생성시 한번만 생성 됨.
        return count;
    }

    // 예금 기능 구현 : 매개변수로 값을 전달 받아 acc에 누적
    public static void Deposit(final int Deposit_M, int account){
        account += Deposit_M;
        System.out.println("현재 잔액은 : " + account + "원 입니다");
    }

    // 출금 기능 구현 : 매개변수로 값을 전달 받아 acc에서 차감
    public static void WithDrawal(final int Wthdrw_M, int account){
        if (account >= Wthdrw_M){
            account -= Wthdrw_M;
            System.out.println("현재 잔액은 : " + account + "원 입니다");
        }
        else {
            account -= Wthdrw_M;
            System.out.println("현재 잔액은 : " + account + "원 입니다");
        }
    }

    // 잔액 보기 기능 구현 (은행 이름과, 현재의 잔액을 보여줌)
    public  void Printacc(){
        System.out.println("은행 이름은 : " + getBank() + "\n현재 잔액은 " + getAccount() + "원 입니다");
    }

}
