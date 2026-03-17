package 은행ArrayList;

// ArrayList 활용 예제
public class NewBank {
    private static int count;
    private int id; // 계좌 식별용 번호
    private int account; // 잔액
    private String bank; // 은행 이름
    private String name; // 예금주명

    public NewBank(String bank, String name, int account) {
        this.bank = bank;
        this.name = name;
        this.account = account;
        count++; // 계좌 생성 개수
        id = count+10000; // 계좌 식별용 번호는 자동 생성 (계좌번호)
    }

    public int getId() {
        return id;
    }

    public static int getCount() { // 계좌 생성 개수, 클래스 메서드
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
        System.out.println("은행명 : " + bank);
        System.out.println("예금주 : " + name);
        System.out.println("계좌번호 : " + id);
        System.out.println("잔액 : " + account);
    }
}
