package 연산자;

import java.util.Scanner;

// 연산자 : 프로그램에서 사용하는 값을 연산해야 하는 경우에 사용
// 산술 연산자 : 기본적인 사칙연산, 나머지 연산(+, -, *, /, %(나머지) )
// 대입 연산자 : 값을 변수에 대입할 때 사용 ( =, +=, -=, *=, /=, %=)
// 증감 연산자 : ++, -- (단항연산자라고도 불림, 변수의 값을 1 증가 혹은 1 감소 시키는 연산자)
// 비교 연산자 : ==, >, <, >=, <=, != (좌변과 우변의 값을 비교하여 결과를 참과 거짓으로 판별)
// 논리 연산자 : &&(and, 좌항과 우항의 조건을 모두 만족해야 참), ||(or, 좌항과 우항의 조건중 하나만 만족해도 참), !(not, 현재의 상태를 부정 참이면 거짓 거짓이면 참)
// 삼항 연산자 : 참과 거짓만 있는 조건문을 만들 수 있음, 항이 3개인 연산자 ex) (age > 19) ? true : false;
// 비트 연산자 : 비트 단위의 연산을 수행
public class OperatorMain {
    public static void main(String[] args) {
        int x = 10, y = 4;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y); // 몫을 구하는 연산 나머지는 날아감
        System.out.println((double) x / y); // 명시적 형변환을 통해 일반적인 나눗셈을 연산할 수 있음
        System.out.println(x % y); // 나머지 연산자, 알고리즘에서는 산술연산자 중 나머지 연산자가 가장 많이 사용됨.

        // 대입연산자
        int num1 = 10; // 대입 연산자, 정수타입 num1에 10을 저장
        System.out.println(num1 += 2); // 정수타입 num1에 2를 더하고 값을 저장 num1의 값은 12
        System.out.println(num1 -= 2); // num1 = 12 - 2
        System.out.println(num1 *= 2); // num1 (10) = 10 * 2
        System.out.println(num1 /= 2); // 10
        System.out.println(num1 %= 2); // 0

        // 증감 연산자
        int num2 = 10;
        System.out.println(++num2); // ++num2 : (전위) 먼저 증가하고 대입한다
        System.out.println(num2++); // ++num2 : (전위) 먼저 대입하고 증가한다
        System.out.println(num2);

        System.out.println(num2--); // 대입 후 감소
        System.out.println(--num2); // 감소 후 대입

        //비교 연산자
        int num3 = 10, num4 = 20;
        System.out.println(num3 == num4); //false 값이 같다
        System.out.println(num3 != num4); // true 값이 같지 않다
        System.out.println(num3 > num4); // false
        System.out.println(num3 < num4); // true
        System.out.println(num3 >= num4); // false
        System.out.println(num3 <= num4); // true

        //논리 연산자
        int num5 = 10, num6 = 20;
        System.out.println(num5 > 0 && num5 > num6); // 산술연산자가 논리 연산자 보다 우선 순위가 높다
        System.out.println(num5 > 0 || num5 > num6); // true 좌변이 참이기에
        System.out.println(!(num5 > 0 || num5 > num6)); // 참이었으나 !이 들어가서 false

        // 3항 연산자 : 참과 거짓만 있는 조건문 대체 .. 프론트엔드 개발시 조건문보다 많이 쓰임
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
//        if (age >= 20){
//            System.out.println("성인입니다");
//        }
//        else {
//            System.out.println("당신은 미성년자입니다.");
//       }
        // 기본적으로 연산자 취급이기에 프린트 문에 넣을 수 있어 프론트엔드 개발에 매우 큰 도움
        System.out.println("당신은 " + (age >= 18 ? "성인입니다" : "미성년자입니다"));



    }
}
