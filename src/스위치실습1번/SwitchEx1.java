package 스위치실습1번;
// 좌변 값, 연산자, 우변값을 입력받아 산술 연산(+, -, *, /, %)을 수행하는 스위치문 만들기
// 입력 : 23 + 45
// 출력 : 68

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식 입력 : ");
        int left = sc.nextInt();
        String operator = sc.next();
        int right = sc.nextInt();
        int rst = 0;


            switch (operator) {
                case "+":
                    rst = left + right;
                    break;
                case "-":
                    rst = left - right;
                    break;
                case "*":
                    rst = left * right;
                    break;
                case "/":
                    rst = left / right;
                    break;
                case "%":
                    rst = left % right;
                    break;
                default:
                    System.out.println("연산자 입력이 잘못되었습니다.");
                    break;
            }
            System.out.println("연산결과 : " + rst);
        }

}
