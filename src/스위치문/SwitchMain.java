package 스위치문;

import java.util.Scanner;

// Switch : 조건값으로 분기
// 분기된 조건을 실행한 후 break문을 통해 Switch문을 벗어나야함.
public class SwitchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("좋아 하는 계절을 입력 하세요: ");
        String season = sc.next().toUpperCase(); // 문자열을 대문자로 변경하여 대입

        switch (season)
        {
            case "SPRING" :
            case "봄":
                System.out.println("꽃이 피는 봄이 좋아요");
                break;
            case "SUMMER" :
            case "여름":
                System.out.println("여름 휴가가 있는 여름이 좋아요");
                break;
            case "FALL" :
            case "AUTIMN" :
            case "가을":
                System.out.println("시원한 가을이 좋아요");
                break;
            case "WINTER" :
            case "겨울":
                System.out.println("눈 내리는 겨울이 좋아요");
                break;
            default:
                System.out.println("입력이 잘못되었습니다");
        }
    }
}
