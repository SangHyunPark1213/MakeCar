package 반복문분기;

import java.util.Scanner;

// break : 반복문을 탈출 할 때 사용
// continue : 반복문 내에서 사용, 반복문 나머지 부분을 건너뛰고 조건식으로 이동 함.
public class ContMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
//        // continue를 이용하요 짝수만 출력하기
//        for (int i = 1; i <= num; i++)
//        {
//            if (i % 2 != 0) continue;
//            System.out.print(i + " ");
//        }
        // continue 를 이용하여 입력 받은 수의 범위 이내의 5의 배수를 한 줄에 10개씩 출력
        int cnt = 0;
        for (int i = 1; i <= num; i++)
        {
            if (i % 5 != 0) continue; // 5의 배수가 아니면 반복문의 나머지를 건너 뜀.
            System.out.printf("%5d ",i);
            cnt++; // 출력 횟수 누적
            if (cnt == 10)
            {
                System.out.println();
                cnt = 0;
            }
        }

    }
}
