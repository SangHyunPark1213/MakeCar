package 자판기;

// 메뉴 선택이 잘못되는 경우 재 입력 요구 하도록 수정

import java.util.Scanner;

public class Vending_machine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("투입 금액 : ");
        int income = sc.nextInt();
        System.out.printf("당신의 투입 금액은 : %,d원입니다 \n", income);

        int price = 0;

        System.out.println("번호\t상품명     가격\n" +
                " 1\t 콜라\t1,500원\n" +
                " 2\t 사이다\t1,500원\n" +
                " 3\t 커피  \t1,000원\n" +
                " 4\t 생수      500원");
        System.out.print("상품 번호를 입력하세요 : ");
        int Pct_num = sc.nextInt();

        while (Pct_num < 1 || Pct_num > 4) // 조건이 true라면 무한 반복
        {
            System.out.print("상품 번호가 잘못되었습니다 상품 번호를 다시 입력해주세요 : ");
            Pct_num = sc.nextInt();
        }

        while (!sc.hasNextInt())
        {
            System.out.println("숫자만 입력하세요 : ");
        }

        switch (Pct_num) {
            case 1:
                price = 1500;
                break;
            case 2:
                price = 1500;
                break;
            case 3:
                price = 1000;
                break;
            case 4:
                price = 500;
                break;
            default:
                System.out.println("없는 메뉴입니다");
        }
        if(price > income)
        {
            System.out.println("입력한 상품 번호 : " + Pct_num);
            System.out.println("잔액이 부족합니다");
            System.out.printf("투입 금액 : %,d\n", income);
            System.out.printf("상품 금액 : %,d\n", price);
            System.out.printf("부족 금액 : %,d\n", ((income - price) * -1));
        }
        else
        {
            int charge = income - price;
            System.out.println("입력한 상품 번호 : " + Pct_num);
            System.out.printf("투입 금액 : %,d\n", income);
            System.out.printf("상품 금액 : %,d\n", price);
            System.out.printf("거스름돈 : %,d\n", charge);
        }

    }
}
