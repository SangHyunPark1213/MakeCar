package 더블for문;
// 2중 for문은 반복문 내에 반복문이 존재하는 것

import java.util.Scanner;

public class DoubleMain {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); // 키보드를 통해 입력받기 위해 스캐너 객체 생성
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        // 입력받은 정수 * 정수만큼의 별 찍기
        for (int i = 0; i < num; i++){ // 행을 의미
            System.out.printf("|i=%2d|", i); // i 값의 변화를 확인하기 위한 출력
            for(int j = 0; j < num; j++){
                System.out.print("* "); // 별을 찍고 공백을 줌
            }
            System.out.println(); // 한 줄을 출력 후 줄바꿈
        }

        // 구구단 출력하기 :

        for (int i = 2; i <= 9; i++){ // 단
            System.out.printf("[ %d단 ]\n", i);
            for (int j = 1; j <= 9; j++){
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
            System.out.println("-".repeat(32));
        }
    }
}
