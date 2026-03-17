package 딜리버리예시;


import java.util.Scanner;

public class DelMain {
    public static void main(String[] args) {
        Manager manager = new Manager("곰돌이");
        Scanner sc = new Scanner(System.in);
        System.out.print("[1] 택배 배송 [2] 퀵 배송 [3] 항공 배송 : ");
        int menu = sc.nextInt();
        switch(menu) {
            case 1: manager.send(new ParcelDel("대한통운")); break;
            case 2: manager.send(new QuickDel("쿠팡로켓배송")); break;
            case 3: manager.send(new AirDel("FedEx")); break;
            default:
                System.out.println("배송 시스템을 잘못 선택하셨습니다.");
        }
    }
}
