package 딜리버리;

import 다형성2번.*;

import java.util.Scanner;

public class DeliveryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("택배 회사 이름을 입력해주세요 : ");
        String company = sc.next();
        Manager d = new Manager(company);
        System.out.println("=====배송 선택=====");
        System.out.println("1. 택배 배송");
        System.out.println("2. 퀵 배송");
        System.out.println("3. 항공 배송");
        System.out.print("배송 형태를 선택해주세요 : ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                d.send(new Parcel());
                break;
            case 2:
                d.send(new Quick());
                break;
            case 3:
                d.send(new Air());
                break;
            default:
                System.out.println("잘못된 번호입니다.");
                break;
        }
    }
}
