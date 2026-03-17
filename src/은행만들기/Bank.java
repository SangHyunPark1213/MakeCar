package 은행만들기;
// 정적멤버(필드) : static 키워드 사용, 클래스 생성시 생성되며, 객체 생성시 생성되지않음
// 정적메서드 : static 키워드 사용

public class Bank {
    private static int count = 0; // 정적필드, Bank 클래스 생성시 생성되는 값
    private int account; // 잔액을 누적하기 위한 인스턴스 필드(객체 생성시 만들어짐)
    private String bank; // 은행 이름, 인스턴스 필드

    public  Bank(String bank, int account) {
        this.bank = bank;
        this.account = account;
        count++; // 생성자 호출시 값을 증가시킴
        System.out.println(bank + "은행에 계좌를 개설합니다. " + "잔액은 " +account + "입니다.");
    }

    public static int getCount() { // 정적 메서드, 클래스 생성시 생성됨
        return count;
    }
    // 예금 기능 구현 : 매개변수로 값을 전달받아 account에 누적
    public void depositMoney(final int deposit) {
        account += deposit;
        System.out.println(deposit + "원이 계좌에 입금되었습니다.");
    }
    // 출금 기능 구현 : 매개변수로 값을 전달받아 account의 값을 차감하는 기능 구현(출금 금액이 예금 금액보다 높을 수 없음)
    public void withdrawalMoney(final int withdrawal) {
        if (account >= withdrawal) {
            account -= withdrawal;
            System.out.println("계좌에서 " + withdrawal + "원이 출금되었습니다.");
        }
        else System.out.println("잔액이 부족합니다.");
    }
    // 잔액 보기 기능 구현(은행 이름과 현재의 잔액을 보여줌)
    void printAccount() {
        System.out.println(bank + "은행의 현재 잔액 : " + account);
    }
}
