package 반복문분기;
// break : 반복문을 탈출할 때 사용
// continue : 반복문 내에서 사용, 반복문의 나머지 부분은 건너뛰고 조건식으로 이동함


import java.util.Scanner;

public class ContMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        // continue를 이용해 짝수만 출력하기
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) continue; // 홀수 일때는 반복문의 나머지 부분을 건너뜀
            System.out.print(i + " ");
        }

        // continue를 이용해 입력 받은 수의 범위 이내의 5의 배수를 1줄에 10개씩 출력하기

        System.out.println();
        System.out.print("정수 입력 : ");
        int num1 = sc.nextInt();
        int count = 0;
        for (int i=1; i<=num1; i++){
            if (i % 5 != 0) continue; // 5의 배수가 아니면 반복문의 나머지 부분은 건너뜀
            System.out.printf("%3d ", i);
            count++; // 출력 횟수 누적
            if (count == 10) {
                System.out.println();
                count = 0;
            }
            // if (count % 10 == 0) System.out.println(); 도 가능

        }
    }
}
