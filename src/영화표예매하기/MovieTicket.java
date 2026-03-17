package 영화표예매하기;

// 좌석은 10개 (배열 사용)
// 빈 좌석은 [ ], 예매된 좌석 [V]
// 영화표 가격은 생성자에서 매개변수로 전달받음
// 생성자
// 좌석 상태 출력 메서드


import java.util.Arrays;
import java.util.Scanner;

public class MovieTicket {
    // 좌석은 10개 (배열 사용)
    private final String[] seat; // 10개 좌석에 대한 참조 변수 생성

    // 좌석 가격에 대한 인스턴스 필드 생성
    // 입력을 받기 위한 스캐너 생성
    Scanner sc = new Scanner(System.in);
    // 생성자를 만드는데 매개변수로 가격을 전달받음
    private int Price;
    // 생성자를 통해서 가격을 전달받음
    MovieTicket(int Price) {
        this.Price = Price;
        seat = new String[10]; // 참조 변수에 생성된 배열의 주소를 대입
        Arrays.fill(seat, "");
    }
    // 좌석 상태 출력 메서드
    public void printSeat(){
        for (String s : seat) {
            System.out.printf("[ %s ]", s);
        }
        System.out.println();
    }
    // 예매 기능 수행 메서드
    void selectSeat() {
        printSeat();
        System.out.print("예매할 좌석 번호(1~10) : ");
        int s = sc.nextInt();
        switch (s) {
            case 1:
                if (seat[0].equals("V")) {
                    System.out.println("이미 선택된 좌석입니다.");
                    break;
                } else {
                    System.out.println("1번 좌석 예매 완료.");
                    seat[0] = "V";
                    printSeat();
                    break;
                }
            case 2:
                if (seat[1].equals("V")) {
                    System.out.println("이미 선택된 좌석입니다.");
                    break;
                } else {
                    System.out.println("2번 좌석 예매 완료.");
                    seat[1] = "V";
                    printSeat();
                    break;
                }
            case 3:
                if (seat[2].equals("V")) {
                    System.out.println("이미 선택된 좌석입니다.");
                    break;
                } else {
                    System.out.println("3번 좌석 예매 완료.");
                    seat[2] = "V";
                    printSeat();
                    break;
                }
            case 4:
                if (seat[3].equals("V")) {
                    System.out.println("이미 선택된 좌석입니다.");
                    break;
                } else {
                    System.out.println("4번 좌석 예매 완료.");
                    seat[3] = "V";
                    printSeat();
                    break;
                }
            case 5:
                if (seat[4].equals("V")) {
                    System.out.println("이미 선택된 좌석입니다.");
                    break;
                } else {
                    System.out.println("5번 좌석 예매 완료.");
                    seat[4] = "V";
                    printSeat();
                    break;
                }
            case 6:
                if (seat[5].equals("V")) {
                    System.out.println("이미 선택된 좌석입니다.");
                    break;
                } else {
                    System.out.println("6번 좌석 예매 완료.");
                    seat[5] = "V";
                    printSeat();
                    break;
                }
            case 7:
                if (seat[6].equals("V")) {
                    System.out.println("이미 선택된 좌석입니다.");
                    break;
                } else {
                    System.out.println("7번 좌석 예매 완료.");
                    seat[6] = "V";
                    printSeat();
                    break;
                }
            case 8:
                if (seat[7].equals("V")) {
                    System.out.println("이미 선택된 좌석입니다.");
                    break;
                } else {
                    System.out.println("8번 좌석 예매 완료.");
                    seat[7] = "V";
                    printSeat();
                    break;
                }
            case 9:
                if (seat[8].equals("V")) {
                    System.out.println("이미 선택된 좌석입니다.");
                    break;
                } else {
                    System.out.println("9번 좌석 예매 완료.");
                    seat[8] = "V";
                    printSeat();
                    break;
                }
            case 10:
                if (seat[9].equals("V")) {
                    System.out.println("이미 선택된 좌석입니다.");
                    break;
                } else {
                    System.out.println("10번 좌석 예매 완료.");
                    seat[9] = "V";
                    printSeat();
                    break;
                }
            default:
                System.out.println("잘못된 좌석입니다.");

        }
    }
    // 취소 기능 수행 메서드
    void cancelSeat(){
        printSeat();
        System.out.print("취소할 좌석 번호(1~10) : ");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                if (seat[0].equals("")) {
                    System.out.println("취소가 불가능한 좌석입니다.");
                    break;
                } else {
                    seat[0] = "";
                    break;
                }
            case 2:
                if (seat[1].equals("")) {
                    System.out.println("취소가 불가능한 좌석입니다.");
                    break;
                } else {
                    seat[1] = "";
                    break;
                }
            case 3:
                if (seat[2].equals("")) {
                    System.out.println("취소가 불가능한 좌석입니다.");
                    break;
                } else {
                    seat[2] = "";
                    break;
                }
            case 4:
                if (seat[3].equals("")) {
                    System.out.println("취소가 불가능한 좌석입니다.");
                    break;
                } else {
                    seat[3] = "";
                    break;
                }
            case 5:
                if (seat[4].equals("")) {
                    System.out.println("취소가 불가능한 좌석입니다.");
                    break;
                } else {
                    seat[4] = "";
                    break;
                }
            case 6:
                if (seat[5].equals("")) {
                    System.out.println("취소가 불가능한 좌석입니다.");
                    break;
                } else {
                    seat[5] = "";
                    break;
                }
            case 7:
                if (seat[6].equals("")) {
                    System.out.println("취소가 불가능한 좌석입니다.");
                    break;
                } else {
                    seat[6] = "";
                    break;
                }
            case 8:
                if (seat[7].equals("")) {
                    System.out.println("취소가 불가능한 좌석입니다.");
                    break;
                } else {
                    seat[7] = "";
                    break;
                }
            case 9:
                if (seat[8].equals("")) {
                    System.out.println("취소가 불가능한 좌석입니다.");
                    break;
                } else {
                    seat[8] = "";
                    break;
                }
            case 10:
                if (seat[9].equals("")) {
                    System.out.println("취소가 불가능한 좌석입니다.");
                    break;
                } else {
                    seat[9] = "";
                    break;
                }
            default:
                System.out.println("잘못된 좌석입니다.");

        }
    }
    // 총 판매 금액 반환
    int totalAmount(){
        int total = 0;
        for(int i = 0; i < seat.length; i++){
            if(seat[i].equals("V")){
                total += Price;
            }
        }
        return total;
    }

}

// 예시 답안
//package 영화표예매;
//
//import java.util.Scanner;
//
//public class MovieTicket {
//    // 좌석 10개 (0: 빈 좌석, 1: 예매됨)
//    private final int[] seat = new int[10];
//
//    // 좌석당 가격
//    private final int price;
//
//    // 입력용 스캐너
//    private final Scanner sc = new Scanner(System.in);
//
//    // TODO: 생성자에서 price 주입
//    public MovieTicket(int price) {
//        this.price = price;
//    }
//
//    // 좌석 상태 출력: [ ][V]...
//    public void printSeat() {
//        for (int e : seat) {
//            System.out.print(e == 0 ? "[ ]" : "[V]");
//        }
//        System.out.println();
//    }
//
//    // 좌석 번호 유효성 체크 (1~10)
//    private boolean isValidPos(int seatPos) {
//        return seatPos >= 1 && seatPos <= seat.length;
//    }
//
//    // 예매
//    public void selectSeat() {
//        printSeat();
//        System.out.print("예매할 좌석 번호(1~10): ");
//
//        int seatPos = sc.nextInt();
//
//        // TODO: 유효성 검사
//        if (!isValidPos(seatPos)) {
//            System.out.println("좌석 번호는 1~10 사이로 입력하세요.");
//            return;
//        }
//
//        // TODO: 예매 가능 여부 확인
//        if (seat[seatPos - 1] == 0) {
//            seat[seatPos - 1] = 1;
//            System.out.println(seatPos + "번 좌석 예매 완료.");
//            printSeat();
//        } else {
//            System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
//        }
//    }
//
//    // 취소
//    public void cancelSeat() {
//        printSeat();
//        System.out.print("취소할 좌석 번호(1~10): ");
//
//        int seatPos = sc.nextInt();
//
//        // TODO: 유효성 검사
//        if (!isValidPos(seatPos)) {
//            System.out.println("좌석 번호는 1~10 사이로 입력하세요.");
//            return;
//        }
//
//        // TODO: 취소 가능 여부 확인
//        if (seat[seatPos - 1] == 1) {
//            seat[seatPos - 1] = 0;
//            System.out.println(seatPos + "번 좌석 예매 취소 완료.");
//            printSeat();
//        } else {
//            System.out.println("해당 좌석은 예약되어 있지 않습니다.");
//        }
//    }
//
//    // 총 판매 금액 반환 = (예매된 좌석 수) * price
//    public int totalAmount() {
//        int cnt = 0;
//        for (int e : seat) {
//            if (e == 1) cnt++;
//        }
//        return cnt * price;
//    }
//}



