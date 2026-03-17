package 은행만들기;


import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhan = new Bank("신한", 1000);
        while(true) {
            System.out.println("은행을 선택해주세요 : ");
            System.out.print("[1] 카카오 [2] 신한 [3] 계좌 수 확인 [4] 종료하기 : ");
            int bankName = sc.nextInt();
            switch (bankName) {
                case 1:
                    System.out.print("[1] 예금 [2] 출금 [3] 잔액 보기 ");
                    int menu1 = sc.nextInt();
                    switch(menu1) {
                        case 1:
                            System.out.print("예금하실 금액을 입력해주세요 : ");
                            int deposit = sc.nextInt();
                            kakao.depositMoney(deposit);
                            break;
                        case 2:
                            System.out.print("출금하실 금액을 입력해주세요 : ");
                            int withdrawal = sc.nextInt();
                            kakao.withdrawalMoney(withdrawal);
                            break;
                        case 3:
                            kakao.printAccount();
                            break;
                        default:
                            System.out.println("은행 메뉴를 잘못 선택하셨습니다.");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("[1] 예금 [2] 출금 [3] 잔액 보기 [4] 종료하기 : ");
                    int menu2 = sc.nextInt();
                    switch(menu2) {
                        case 1:
                            System.out.print("예금하실 금액을 입력해주세요 : ");
                            int deposit = sc.nextInt();
                            shinhan.depositMoney(deposit);
                            break;
                        case 2:
                            System.out.print("출금하실 금액을 입력해주세요 : ");
                            int withdrawal = sc.nextInt();
                            shinhan.withdrawalMoney(withdrawal);
                            break;
                        case 3:
                            shinhan.printAccount();
                            break;
                        case 4:
                            return;
                        default:
                            System.out.println("은행 메뉴를 잘못 선택하셨습니다.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("등록된 계좌 수는 " + Bank.getCount() + "개 입니다.");
                case 4:
                    return;
                default:
                    System.out.println("메뉴를 잘못 선택하셨습니다.");
            }
        }
    }
}
