package 영화표예매하기;

// 죄석 10개 : 배열
// 빈 좌석은 [ ], 예매 됨은 [V]
// 영화표 가격은 생성자 매게변수로 전달 받음.
// 필요한 것
// 생성자
// 좌석 상태 보기 출력 메서드
// 예매 기능 수행하는 메서드
// 취소 기능 수행하는 메서드
// 총 판매 금액을 반환하는 메서드

import java.util.Scanner;

public class Movie_ticket {
    // 죄석 10개 : 배열
    int seat[] = new int[10];

    // 좌석 가격에 대한 인스턴스 필드 생성
    int price;
    char sold;
    int total;

    // 입력을 받기 위한 스캐너 생성
    Scanner sc = new Scanner(System.in);

    // 생성자를 만드는데 매개변수로 가격을 전달 받음.
    Movie_ticket(){
        price = 12000;
    }

    // 좌석 상태 출력 메서드
    void Printseat(){
        for (int i = 0; i < seat.length; i++){
            System.out.printf("[ ]");
        }
        System.out.println();
    }

    // 예매 기능 수행하는 메서드

    // 취소 기능 수행하는 메서드

    // 총 판매 금액을 반환하는 메서드
    int getTotal(){
        // 예약된 좌석 * price
        total = price;
        return total;
    }
}
