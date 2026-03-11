package 필드와_메서드;

import 시스템_출력.SystemOut;

import java.util.Scanner;

// 필드 :  객체의 속성 값을 저장하는 것 (인스턴스 필드 / 지역 필드(지역변수) / 전역 필드(전역변수)
// 메서드 : 기능 / 동작을 구현하는 것, 자바는 클래스 기반의 언어이므로 모든 함수는 클래스 내부에 정의 되어야 함.
// 인스턴스 메서드 / 클래스 메서드
// 매서드 구성요소
// 1. 접근 제한자 : public, default
// 2. 반환 타입 : 반환값의 타입을 지정 (void는 반환값이 없음을 의미)
// 3. 매서드 이름 : camel case 로 작성 ()작은 괄호가 반드시 포함 됨. ()안에는 매개변수가 들어있거나 비어있음.
// 매개변수 : 외부에서 해당 메서드에 전달 하는 값 (없을 수 있음)
// 구현분 : 실제 기능을 구현하는 부분 { } 블럭으로 표시함.
public class MethodMain {
    public static void main(String[] args) {
        Sample sa = new Sample();
        System.out.println(sa.sum(10, 20));
        sa.hello();
        System.out.println(sa.rtnHello());
        System.out.println(sa.rtnNum());
        calc ca = new calc();
        // 뺄셈, 곱셈, 나눗셈을 하는 메서드를 만들고 호출 후 결과를 반환받아 출력하기
        System.out.println("계산 결과 " + ca.dec(10, 5));

        // 오버로딩(Overloading) : 동일한 이름의 메서드를 매개변수의 타입이나 개수로 구분하여 호출하는 것
        // 대표적으로 println printf
        // 정수 값이 3개인 경우 합을 구하기
        System.out.println(ca.dec(10, 2, 1));



        // 문자열 1개와 정수값 1개 실수값 1개를 더하는 함수
        Scanner sc = new Scanner(System.in);

        // 문자열 3개를 입력받아 문자열 연결하는 함수
        String x, y, z;
        x = sc.next();
        y = sc.next();
        z = sc.next();
        System.out.println(ca.sum(x, y, z));

        // 실수값 1개와 정수 1개를 입력 받아 더하는 함수
        System.out.println(ca.sum(1.1, 2));

        // 문자열 1개와 정수값 1개 실수값 1개를 더하는 함수
        System.out.println(ca.sum("안녕하세요", 17, 1.5));

        // 매개변수의 개수를 모르는 경우
        System.out.println(ca.sum(1, 2, 3, 4, 5, 6));

        // 입력 받은 수가 소수인지 아닌지 판별하는 메서드
        Pnum pn = new Pnum();

        pn.Pnum(sc.nextInt());


    }
}

class Pnum{
    void Pnum(int x){
        if (x < 2){
            System.out.println("소수가 아닙니다.");
        } else if (x == 2) {
            System.out.println("소수입니다");

        } else if (x == 3) {
            System.out.println("소수입니다");
        }
        else if ((x % 2) == 0 || (x % 3) == 0) {
            System.out.println("소수가 아닙니다");
        }
        else System.out.println("소수입니다");
    }
}

class calc {
    String sum(String x, String y, String z){
        return x + y + z;
    }

    // 매개 변수의 개수를 가변적으로 받기 ... : 스프레드 연산자
    int sum(int...nums){
        int sum = 0;
        for (int num : nums){ // 이터러블 객체
            sum += num;
        }
        return sum;
    }


    int sum(int x, int y, int z){

        return x + y + z;
    }
    double sum(double x, int y){
        return x + y;
    }
    String sum(String x, int y, double z){
        return x + (y + z);
    }

    int dec(int x, int y){
        System.out.println("첫번째 숫자 " + x);
        System.out.println("두번째 숫자 " + y);
        return x - y;
    }
    int dec(int x, int y, int z){
        System.out.println("첫번째 숫자 " + x);
        System.out.println("두번째 숫자 " + y);
        System.out.println("세번째 숫자 " + z);
        return x - y - z;
    }
    int mul(int x, int y){
        System.out.println("첫번째 숫자 " + x);
        System.out.println("두번째 숫자 " + y);
        return x * y;
    }
    int div(int x, int y){
        System.out.println("첫번째 숫자 " + x);
        System.out.println("두번째 숫자 " + y);
        return x / y;
    }
}





class Sample {
    int x = 100; // 인스턴스 필드 : 클래스 내부에 있는 변수, 객체 생성시 함께 생성되는 값, 생성된 객체 소멸시 함께 소멸
    int y = 200;
    static int z = 300; // 정적 필드 : 클래스 생성 시 static 영역에 한번만 생성됨.
    // 프로그램 종료시까지 살아있음.

    // 매개변수(x, y)가 있고, 결과를 정수 값으로 되돌려 주는 반환 타입이 있음.
    // 접근 제한자가 없으면 default
    int sum (int x, int y) {
        int tmp = 1000; // 지역변수 스택영역에 생성됬다가 메서드와 함께 소멸 (블록스코프를 따름)
        return x + y;
    }

    // 반환 값이 없음. 매개변수도 없음. 그래서 프린트 문에 들어갈 수 없음(반환값이 없기때문에)
    void hello() {
        System.out.println("안녕하세요!");
    }
    // 문자열을 반환하는 메서드
    String rtnHello(){
        return "안녕하세요~";
    }

    // 정수값을 반환
    int rtnNum(){
        return x + y;
    }
}