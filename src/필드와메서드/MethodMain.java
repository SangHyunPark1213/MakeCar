package 필드와메서드;
// 필드 : 객체의 속성 값을 저장하는 것 (인스턴스 필드 / 지역 필드 / 전역 필드)
// 메서드 : 기능/동작을 구현하는 것, 자바는 클래스 기반의 언어이므로 모든 함수는 메서드 형태로 클래스 내부에 정의되어야함. (인스턴스 메서드 / 클래스 메서드)
// - 접근 제한자 : 일반적으로 public, default만 사용
// - 반환타입 : 해당 메서드 수행 이후 결과를 되돌려주는 타입을 지정(void의 경우 반환값이 없음을 의미)
// - 메서드 이름 : camel case로 작성 ()작은 괄호가 반드시 포함됨, (매개변수가 들어가거나 매개변수가 없으면 비어있음)
// - 매개변수 : 외부에서 해당 메서드에 전달하는 값 (없을 수도 있음)
// - 구현부 : 실제 기능 구현하는 부분 { } 중괄호 블럭으로 표시

import java.util.Scanner;

public class MethodMain {
    public static void main(String[] args) {
        Sample sample = new Sample(); // Sample 클래스로 sample 객체 생성
        System.out.println(sample.sum(10, 20)); // 객체이름.메서드이름 으로 호출함
        sample.hello();
        System.out.println(sample.rtnHello());
        System.out.println(sample.rtnNum());

        // 뺄셈, 곱셈, 나눗셈을 하는 메서드를 만들고 호출 후 결과를 반환받아 출력하기
        System.out.println(sample.subtraction(30, 20));
        System.out.println(sample.multiplication(10, 20));
        System.out.println(sample.division(5, 3));

        // 오버로딩(overloading) : 동일한 이름의 메서드를 매개변수의 타입이나 개수로 구분해서 호출하는 것
        // 정수값이 3개인 경우에 대한 합을 구하기
        System.out.println(sample.sum(100, 200, 300));
        // 문자열 3개를 입력받아 문자열 연결하는 함수
        System.out.println(sample.sum("안녕", "하세요 ", "반갑습니다"));
        // 실수값 1개와 정수값 1개를 입력받아 더하는 함수
        System.out.println(sample.sum(100.5, 20));
        // 문자열 1개와 정수값 1개 실수값 1개를 더하는 함수
        System.out.println(sample.sum("더하기 ", 200, 30.55));

        // 매개변수의 개수를 모르는 경우
        System.out.println(sample.sum(1,2,3,4,5,6,7,8,9,10));
        int k;
        {
            k = 100;
            System.out.println(k);
        }
        System.out.println(k);

        // 입력받은 수가 소수인지 아닌지 판별하는 메서드 만들기
        // 1과 자기 자신 이외의 수로는 나누어지지 않는 수
        Scanner sc = new Scanner(System.in);
        System.out.print("소수 판별 정수 입력 : ");
        int num = sc.nextInt();
        System.out.printf("입력받은 %d는 %s.\n", num, sample.isPrime(num) ? "소수입니다" : "소수가 아닙니다");
    }
}

class Sample {
    int x = 100; // 인스턴스 필드 : 클래스 내부에 있는 변수, 객체 생성시 함께 생성되는 값, 객체 소멸시 사라짐
    int y = 200;
    static int z = 300; // 정적 필드 : 클래스 생성시 한 번만 생성됨, 프로그램 종료시까지 살아있음
    // 매개변수(x, y)가 있고, 결과를 정수값으로 되돌려주는 반환타입이 있음
    // 접근 제한자가 없으면 default를 의미함
//    void isPrime(int x) {
//        boolean Prime = true;
//        if (x <= 1) Prime = false;
//        for (int i = 2; i < x; i++) {
//            if (x % i == 0) Prime = false;
//        }
//        if (Prime == false) {
//            System.out.printf("%d는 소수가 아닙니다.", x);
//        } else System.out.printf("%d는 소수입니다.", x);
//    }
    boolean isPrime(int num){
        if (num <= 1) return false; // 1은 소수가 아님
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false; // 1과 자기자신 이외의 수로 나누어지면 소수가 아님
        }
        return true; // 나누어지지 않은 경우이기 때문에 소수
    }

    int sum (int x, int y) {
        return x + y;
    }
    int sum (int x, int y, int z) {
        int tmp = 1000; // 지역변수, 생성과 소멸이 블록 스코프를 따름(자동)
        return x + y + z;
    }
    String sum (String a, String b, String c) {
        return a + b + c;
    }
    double sum (double x, int y) {
        return x + y;
    }
    String sum(String a, int x, double y) {
        return a + (x + y);
    }

    // 매개변수의 개수를 가변적으로 받기
    int sum(int... nums){
        int sum = 0;
        for (int num : nums) { // 이터러블 객체를 향상된 for문으로 자동순회
            sum += num;
        }
        return sum;
    }

    // 반환값도 없고, 매개변수도 없는 메서드
    void hello() {
        System.out.println("안녕하세요~~~~");
    }
    // 문자열을 반환하는 메서드
    String rtnHello() {
        return "안녕하세요!!!!";
    }
    // 정수값을 반환, 매개변수가 주어지지 않으려면 초기값이 존재해야함
    int rtnNum() {
        return x + y;
    }
    int subtraction(int x, int y) {
        return x - y;
    }
    int multiplication(int x, int y) {
        return x * y;
    }
    double division(int x, int y) {
        return (double) x / y;
    }
}