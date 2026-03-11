package 영화표예매하기;
// Movie_ticket class를 사용하여 객체 생성
//

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // Movie_ticket class를 사용하여 객체 생성
        Movie_ticket Mticket = new Movie_ticket();
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 메뉴 기능 구현을 위해 무한 반복문
        while (true)
        {
            System.out.println("=== 영화표 예매 시스템 ===");
            System.out.println("[1] 예매하기");
            System.out.println("[2] 취소하기");
            System.out.println("[3] 종료하기");
            System.out.print("메뉴 선택: ");
            int select_menu = sc.nextInt();
            switch (select_menu){
                case 1:{
                    Mticket.Printseat();
                    System.out.print("예매할 좌석 번호(1 ~ 10) : ");
                    int select_seat = sc.nextInt();
                    System.out.println(Mticket.seat);
                    break;
                }
                case 2:{
                    Mticket.Printseat();
                    System.out.print("취소할 좌석 번호(1 ~ 10) : ");
                    int select_seat = sc.nextInt();
                    System.out.println(Mticket.seat);
                    break;

                }
                case 3:{
                    System.out.println("총 판매 금액 : " + Mticket.total);
                    break;
                }
            }
        }
        // 메뉴 이름 출력
        // 메뉴 선택하기
        // 선택된 메뉴 실행
    }
}
