package 영화표예매하기t;

import java.util.Scanner;

public class MovieTMain {
    public static void main(String[] args) {
        // MovieTicketT class에 대한 ticketT 참조 변수에 MovieTicket() 객체의 주소를 대입
        MovieTicketT ticketT = new MovieTicketT(12000);
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("=== 영화표 예매 시스템 ===");
            System.out.println("[1] 예매하기");
            System.out.println("[2] 취소하기");
            System.out.println("[3] 종료하기");
            System.out.print("메뉴 선택: ");
            int selectmenu = sc.nextInt();

            switch (selectmenu){
                case 1: ticketT.SelectSeat(); break;
                case 2: ticketT.CancelSeat(); break;
                case 3:
                    System.out.println("총 판매 금액 : " + ticketT.getTotalPrice());
                    return;
                default:
                    System.out.println("메뉴 선택이 옳바르지 않습니다.");
            }
        }


    }
}
