package 자판기프로그램;

// 메뉴 선택이 잘못된 경우 재입력 요구

import java.util.Scanner;

public class vendingMachineMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int merch1 = 1500;
        int merch2 = 1500;
        int merch3 = 1000;
        int merch4 = 500;
        int rvsCharge = 0;
            System.out.println("====================");
            System.out.println("        메뉴판       ");
            System.out.printf("%d %5s - %,5d원\n", 1, "콜라", merch1);
            System.out.printf("%d %5s - %,5d원\n", 2, "사이다", merch2);
            System.out.printf("%d %5s - %,5d원\n", 3, "커피", merch3);
            System.out.printf("%d %5s - %,5d원\n", 4, "생수", merch4);
            System.out.println("====================");
            System.out.print("투입 금액을 입력하세요 : ");
            int money = sc.nextInt();
        while (true) {
            System.out.print("메뉴를 선택해주세요 : ");
            int menu = sc.nextInt();
            int change = 0;
            switch(menu) {
                case 1:
                    if (money >= merch1) {
                        change = money - merch1;
                        System.out.println("선택하신 상품 : 콜라");
                        System.out.printf("투입 금액 : %d원\n", money);
                        System.out.printf("상품 금액 : %d원\n", merch1);
                        System.out.printf("거스름돈은 %d원 입니다.\n", change);
                        break;
                    } else {
                        rvsCharge = merch1 - money;
                        System.out.println("투입 금액이 부족합니다.");
                        System.out.printf("투입 금액 : %d원\n", money);
                        System.out.printf("필요 금액 : %d원\n", merch1);
                        System.out.printf("부족 금액 : %d원\n", rvsCharge);
                        break;
                    }
                case 2:
                    if (money >= merch2) {
                        change = money - merch2;
                        System.out.println("선택하신 상품 : 사이다");
                        System.out.printf("투입 금액 : %d원\n", money);
                        System.out.printf("상품 금액 : %d원\n", merch2);
                        System.out.printf("거스름돈은 %d원 입니다.\n", change);
                        break;
                    } else {
                        rvsCharge = merch2 - money;
                        System.out.println("투입 금액이 부족합니다.");
                        System.out.printf("투입 금액 : %d원\n", money);
                        System.out.printf("필요 금액 : %d원\n", merch2);
                        System.out.printf("부족 금액 : %d원\n", rvsCharge);
                        break;
                    }
                case 3:
                    if (money >= merch3) {
                        change = money - merch3;
                        System.out.println("선택하신 상품 : 커피");
                        System.out.printf("투입 금액 : %d원\n", money);
                        System.out.printf("상품 금액 : %d원\n", merch3);
                        System.out.printf("거스름돈은 %d원 입니다.\n", change);
                        break;
                    } else {
                        rvsCharge = merch3 - money;
                        System.out.println("투입 금액이 부족합니다.");
                        System.out.printf("투입 금액 : %d원\n", money);
                        System.out.printf("필요 금액 : %d원\n", merch3);
                        System.out.printf("부족 금액 : %d원\n", rvsCharge);
                        break;
                    }
                case 4:
                    if (money >= merch4) {
                        change = money - merch4;
                        System.out.println("선택하신 상품 : 생수");
                        System.out.printf("투입 금액 : %d원\n", money);
                        System.out.printf("상품 금액 : %d원\n", merch4);
                        System.out.printf("거스름돈은 %d원 입니다.\n", change);
                        break;
                    } else {
                        rvsCharge = merch4 - money;
                        System.out.println("투입 금액이 부족합니다.");
                        System.out.printf("투입 금액 : %d원\n", money);
                        System.out.printf("필요 금액 : %d원\n", merch4);
                        System.out.printf("부족 금액 : %d원\n", rvsCharge);
                        break;
                    }
                default:
                    System.out.println("없는 메뉴입니다.");
                    continue; // 반복문의 조건식으로 이동함
            }
            break;
        }
    }
}
