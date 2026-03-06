package 연산자실습;

import java.util.Scanner;

public class OperatorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. [윤년의 조건]
        //
        //- 연도가 4로 나누어 떨어 진다.
        //- 100으로 나누어 떨어지면 연도는 윤년이 아니다.
        //- 400으로 나누어 떨어지면 윤년이다.
        // 나머지 연산자, 비교연산자, 논리연산자 사용하여 윤년 판별하기

        // 2. 100의 자리 정수를 입력 받아서 3개의 변수에 나누어 대입 하기

        System.out.print("년도를 입력하세요 ex)2015 : ");
        int year = sc.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("윤년입니다");
        } else {
            System.out.println("윤년이 아닙니다");
        }

        System.out.print("3자리 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int num3 = num / 100;
        int num2 = num % 100 / 10;
        int num1 = num % 10;
        System.out.printf("백의자리 수는 %d 십의자리 수는 %d 일의자리 수는 %d \n", num3, num2, num1);


        // 연산자 우선 순위 확인
        int val1 = 5, val2 = 5, val3 = 5;
        int rst = val1 + val2 * val3;
        int rst2 = (val1 + val2) * val3; // () 작은 괄호는 연산자 우선 순위가 가장 높음
        int rst3 = val1 + (++val2) * val3; // 값 증가 후 곱셈 후 덧셈
        System.out.println(rst); // 30
        System.out.println(rst2); // 50
        System.out.println(rst3); // 35  ... 우선순위를 높일때는 ()로 묶어주자.



    }

}
