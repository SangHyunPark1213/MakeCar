package 스위치문;
// Switch문 : 조건값으로 분기
// 분기된 조건을 실행 후 break문을 통해서 switch문을 벗어나야 함

import java.util.Scanner;

public class SwitchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("좋아하는 계절을 입력하세요 : ");
        String season = sc.next().toUpperCase(); // 문자열을 대문자 변경해서 대입받음
        switch (season){
            case "SPRING": // 세미콜론이 아니고 콜론이 와야함
            case "봄":
                System.out.println("꽃이 피는 봄이 좋아요~~~");
                break;
            case "SUMMER":
            case "여름":
                System.out.println("여름 휴가가 있는 여름이 좋아요");
                break;
            case "AUTUMN":
            case "가을":
            case "FALL": // or 조건과 동일
                System.out.println("선선한 가을이 좋아요");
                break;
            case "WINTER":
            case "겨울":
                System.out.println("눈 내리는 겨울이 좋아요");
                break;
            default:
                System.out.println("계절 입력이 잘못되었습니다.");
        }
    }
}
