package 은행만들기;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank("농협", 0);

        bank.Printacc();

        // 은행에 대한 입금, 출금, 잔액 조회 메뉴 만들어보기
        // 계좌 생성 개수 확인(?) : count 값 확인
        System.out.println("계좌 생성 개수 " + Bank.getCount());
        while (true){
            System.out.println("[1] 입금 [2] 출금 [3] 잔액 조회 [4] 종료");
            int M_select = sc.nextInt();

            switch (M_select){
                case 1:
                    System.out.println("입금 할 금액을 입력해주세요 : ");
                    int dep_M = sc.nextInt();
                    Bank.Deposit(dep_M, bank.getAccount());
                    break;

                case 2:
                    System.out.println("출금 할 금액을 입력해주세요 : ");
                    int wtd_M = sc.nextInt();
                    Bank.WithDrawal(wtd_M, bank.getAccount());
                    break;
                case 3:
                    bank.Printacc();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("메뉴 선택이 옳바르지 않습니다.");
                    break;
            }
        }


    }
}
