package 스위치_실습1;
// 좌변 정수, 연산자, 우변값을, 입력 받아 산술 연산을 수행하는 스위치문 만들기
// 입력 : 23 + 45
// 출력 : 68


import java.util.Scanner;

public class Switch_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("게산 할 숫자와 연산자를 입력하세요 \nex) 23 + 43 :");

        int a = sc.nextInt();
        char cal = sc.next().charAt(0);
        int b = sc.nextInt();
        int rst;

        switch (cal)
        {
            case '+':
                System.out.println("결과는 " + (a + b) + "입니다");
                break;
            case '-':
                System.out.println("결과는 " + (a - b) + "입니다");
                break;
            case '*':
                System.out.println("결과는 " + a * b + "입니다");
                break;
            case '/':
                System.out.println("결과는 " + a / b + "입니다");
                break;
            case '%':
                System.out.println("결과는 " + a % b + "입니다");
                break;
            default:
                System.out.println("입력이 잘못되었습니다.");
                break;
        }

    }
}
