package 조건문_실습;
// 시간과 분을 입력 받아 45분 일찍 시간이 설정되도록 구현
// 23 45 -> 23 00
// 0 30 -> 23 45

import java.util.Scanner;

public class Condition_EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 스캐너 객체 생셩
        // 시간 / 분 입력 받기
        // 계산 편의를 위해 전부 분으로 환산
        // 환산된 분이 45 미만이면 하루치 시간을 더해줌
        // 환산된 시간에서 45를 빼줌
        // 다시 시간과 분으로 환산 후 결과 출력

        System.out.print("시간을 입력하세요 \n ex) 10 23 : ");
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int totalmin = hour * 60 + minute;
        if(totalmin < 45)
        {
            totalmin = totalmin + 1440 - 45;
            hour = totalmin / 60;
            minute = totalmin % 60;
        }
        else if(totalmin >= 45)
        {
            totalmin = totalmin - 45;
            hour = totalmin / 60;
            minute = totalmin % 60;
        }
        else
        {
            System.out.println("잘못된 입력");
            return;
        }
        System.out.println(hour + "시 " + minute + "분 ");
    }
}
