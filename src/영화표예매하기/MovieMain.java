package 영화표예매하기;

//

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // MovieTicket class를 사용해 객체 생성
        MovieTicket mt = new MovieTicket(12000);
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        // 메뉴 기능 구현을 위해 무한 반복문
        // 메뉴 이름 출력
        // 메뉴 선택하기
        // 선택된 메뉴 실행
        while(true) {
            System.out.println("====== 영화표 예매 메뉴 =======");
            System.out.println("1. 좌석 예매");
            System.out.println("2. 예매 취소");
            System.out.println("3. 종료하기");
            System.out.print("메뉴를 선택해주세요 : ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    mt.selectSeat();
                    break;
                case 2:
                    mt.cancelSeat();
                    break;
                case 3:
                    System.out.printf("총 판매 금액 : %d원\n", mt.totalAmount());
                    return;
            }
        }
    }
}

// 예시 답안
//package 영화표예매;
//
//import java.util.Scanner;
//
//public class MovieMain {
//    public static void main(String[] args) {
//        // TODO: 좌석당 가격을 생성자로 전달 (예: 12000)
//        MovieTicket movieTicket = new MovieTicket(/* TODO: price */ 12000);
//
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("\n=== 영화표 예매 시스템 ===");
//            System.out.println("[1] 예매하기");
//            System.out.println("[2] 취소하기");
//            System.out.println("[3] 종료하기");
//            System.out.print("메뉴 선택: ");
//
//            // TODO: 정수 입력 받기
//            int select = sc.nextInt();
//
//            if (select == 1) {
//                // TODO: 예매
//                movieTicket.selectSeat();
//            } else if (select == 2) {
//                // TODO: 취소
//                movieTicket.cancelSeat();
//            } else if (select == 3) {
//                // TODO: 총 판매 금액 출력 후 종료
//                System.out.println("총 판매 금액: " + movieTicket.totalAmount() + "원");
//                break;
//            } else {
//                System.out.println("메뉴 선택이 잘못되었습니다. 다시 입력하세요.");
//            }
//        }
//    }
//}
