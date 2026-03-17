package 조건문실습;
// 시간과 분을 입력 받아 45분 일찍 시간이 설정되도록 구현
// 23 45 => 23 00
// 0 30 => 23 45
// 0 45 => 0 0
// 13 40 => 12 55

import java.util.Scanner;

public class ConditionEx {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        // 시간 / 분 입력 받기
        // 계산 편의를 위해서 전부 분으로 환산
        // 환산된 분이 45 미만이면 하루치 시간을 더해줌
        // 환산된 시간에서 45를 빼줌
        // 다시 시간과 분으로 환산 후 결과 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("시간/분을 입력하세요 (띄어쓰기로 구분) : ");
        int H = sc.nextInt();
        int M = sc.nextInt();

        int tmp_M = H;
        int tmp_H = M - 45;

        if (M - 45 < 0){
            tmp_M = 60 + (M - 45);
            tmp_H = H - 1;
            if (tmp_H < 0){
                tmp_H = 23;
            }
        }
        System.out.println("설정된 시간 : " + tmp_H + "시 " + tmp_M + "분");

//        int calc = H * 60 + M;
//        if (calc < 45){
//            calc = 24 * 60 + M;
//        }
//        calc -= 45;
//        System.out.printf("%d %d", calc / 60 , calc % 60);
    }
}
