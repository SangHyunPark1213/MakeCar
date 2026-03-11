package 영화표예매하기t;

import 시스템_출력.SystemOut;

import java.util.Scanner;

public class MovieTicketT {

    // 인스턴스 필드로 좌석 10개 저장
    private final int[] seat; // 10개 좌석에 대한 배열의 참조 변수 생성
    private int price;
    private Scanner sc;

    // 생성자를 통해서 가격을 전달 받음.
    MovieTicketT(int price) {
        seat = new int[10]; // 참조 변수에 생성된 배열의 주소를 대입
        this.price = price;
        new Scanner(System.in);
    }
    // 좌석 상태 출력
    public void PrintSeat(){
        for (int e : seat){
            System.out.print(e == 0 ? "[ ]" : "[V]"); //0이면 비어있음, 1이면 예매 됨
        }
        System.out.println();
    }

    // 입력 받은 좌석 번호 유효성 체크 : 1 ~ 10 사이인가 확인
    private boolean isVaildseatNum(int seatPosition){
        return seatPosition >= 1 && seatPosition <= 10;
    }
    // 좌석 예매 기능
    public void SelectSeat(){
        PrintSeat(); // 현재 좌석 상태 확인
        System.out.print("예매 할 좌석 번호 (1 ~ 10) : ");
        int Seatnum = sc.nextInt();
        if (!isVaildseatNum(Seatnum)){
            System.out.println("좌석 번호가 옳바르지 않습니다.");
            return;
        }
        if (seat[Seatnum - 1] == 0) {
            seat[Seatnum - 1] = 1; // 예매하기
            System.out.println(Seatnum + "번 좌석 예매 완료");
            PrintSeat(); // 예매 완료 후 좌석 변경 상태 확인
        }
        else {
            System.out.println("이미 예약된 좌석입니다. 다른 좌석을 예매하세요.");
        }
    }
    // 좌석 취소 하기
    public void CancelSeat(){
        PrintSeat(); // 현재 좌석 상태 확인
        System.out.print("취소 할 좌석 번호 (1 ~ 10) : ");
        int Seatnum = sc.nextInt();
        if (!isVaildseatNum(Seatnum)){
            System.out.println("좌석 번호가 옳바르지 않습니다.");
            return;
        }
        if (seat[Seatnum - 1] == 1) {
            seat[Seatnum - 1] = 0; // 예매하기
            System.out.println(Seatnum + "빈 좌석 취소 완료");
            PrintSeat(); // 예매 완료 후 좌석 변경 상태 확인
        }
        else {
            System.out.println("해당 좌석은 예매되어 있지 않습니다.");
        }
    }


    // 총 판매 금액 반환
    public int getTotalPrice(){
        int cnt = 0;
        for (int e : seat){
            if(e == 1){
                cnt++;
            }
        }
        return cnt * price;
    }
}
