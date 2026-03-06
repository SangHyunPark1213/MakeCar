package 조건문;
// 제어문 : 조건문과 반복문 있음, 프로그램의 순차적인 흐름을 제어하기 위함.
// 조건문 : 주어진 조건식의 조건에 따라 실행
// 반복문 : 주어진 조건이 참인 동안 반복

// 조건문의 종류
// if, if ~ else, if ~ else if, ~else : 조건식을 이용하여 조건 분기, 모든 경우 이용가능
// switch ~ case : 조건값에 의한 분기, 정수 값, 문자, 문자열, 실수값은 안 됨.
// 3항 연산자 : 참과 거짓만 분기 할 때 사용, 연산자이기 때문에 출력 구문(print) 내에서 사용 가능.

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        if (num > 100) {
            System.out.println(num + "은 100보다 큽니다.");
        } else if (num < 100) {
            System.out.println(num + "은 100보다 작습니다.");
        } else {
            System.out.println(num + "100과 같습니다.");
        }

        // 이름, 국어, 영어, 수학 성적을 입력 받기
        // 각각의 성적이 0 ~ 100 사이가 아니면 "성적 입력 오류" 출력 후 종료
        // 성적이 제대로 입력되면 총점과 평균 구하기
        // 평균이 90점 이상이면 A
        // 평균이 80점 이상이면 B
        // 평균이 70점 이상이면 C
        // 평균이 60점 이상이면 D
        // 평균이 60점 미만이면 F


        int kr, en, math, total, avg;

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("국어 성적을 입력하세요 :");
        kr = sc.nextInt();
        if (kr > 100)
        {
            System.out.println("성적 입력 오류");
        }
        else if (kr <= 100)
        {
            System.out.print("영어 성적을 입력하세요 :");
            en = sc.nextInt();
            if (en > 100)
            {
                System.out.println("성적 입력 오류");
            }
            else if (en <= 100)
            {
                System.out.print("수학 성적을 입력하세요 :");
                math = sc.nextInt();
                if (math > 100)
                {
                    System.out.println("성적 입력 오류");
                }
                else if (math <= 100)
                {
                    total = kr + en + math;
                    avg = total / 3;
                    if (avg >= 90)
                    {
                        System.out.println(name + "님의 성적 등급은 A입니다");
                    }
                    else if (avg >= 80)
                    {
                        System.out.println(name + "님의 성적 등급은 B입니다");
                    }
                    else if (avg >= 70)
                    {
                        System.out.println(name + "님의 성적 등급은 C입니다");
                    }
                    else if (avg >= 60)
                    {
                        System.out.println(name + "님의 성적 등급은 D입니다");
                    }
                    else
                    {
                        System.out.println(name + "님의 성적 등급은 F입니다");
                    }
                }
            }
        }
        else
        {
            System.out.println("성적 입력 오류");
        }

    }
}
