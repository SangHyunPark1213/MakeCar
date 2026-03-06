package 변수와_자료형;


import java.sql.SQLOutput;
import java.util.Scanner;

// 클래스 이름은 대문자로 시작 해야 합니다.
public class DataTypeMain { // 클래스 이름의 시작은 대문자 : 파스칼 표기법
    public static void main(String[] args) {
        int num; // 정수 타입의 값을 저장하기 위한 변수 생성, 4byte 메모리 공간을 할당 받음.

        // 변수 : 메모리 공간을 확보하고 이름을 붙이는 것
        // 자바에서는 JVM이 메모리 할당을 담당

        // 변수 이름 규칙
        // 1. 영문자, 숫자, _, $ 사용 가능, 한글 가능
        int age_$;

        // 2. 숫자가 먼저 나오면 안 됨
        // int 1age; X

        // 3. 자바의 키워드 사용하면 안 됨
        // int int; X

        // 4. 카멜 표기법(camel case) 준수
        int memberInfo;
        int member_info; //snake case (C언어 Python) 에서 사용되는 표기법

        // 5. 가장 중요한 것 : 사용 목적에 맞게 이름을 지어야 함.

        // 나이, 이름, 주소, 전화번호, 성인 여부 확인하는 변수 이름 작성하기
        int age = 23; // 4byte 정수 타입 변수에 23을 대입
        String name = "김현중"; // 문자열 타입의 변수를 생성하고 "김현중"을 문자열의 주소를 대입
        String phone = "010-1111-1111";
        boolean isAdult = true; // 참과 거짓으로 값을 판별

        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phone);
        System.out.println("성인 여부: " + isAdult);


        // 자료형(Data Type) : 저장 할 데이터의 형태를 결정, 기본 자료형과, 참조 자료형이 있음.
        boolean isTrue; // 1 byte, true/false
        char gender = '가'; // 문자를 저장, 2byte, 부호가 없음(양수만 있음)
        // 내부적으로는 정수값이 사용 됨. char 은 ''만 사용 문자열은 ""
        System.out.println((int) gender); // 내부적으로 M의 정수값은 77
        // 문자열은 참조 타입(실제 값이 저장되는 것이 아니고 주소가 저장됨), "문자열"은 리터럴 상수로 취급되며 RAM의 전역부분에 할당 됨
        String addr = "경기도";
        // Number 타입은 정수형과 실수형으로 나누어 짐.
        // 정수형 : byte(1), short(2), int(4), long(8) : 소수점이 없고 부호 O
        byte num1 = 127;

        // 실수형 : float(4), double(8) : 소수점이 있고, 부호 O, switch문에서 비교값으로 사용 X
        float height = 1.7f; // 자정밀도 표현 방식이며 f를 꼭 포함해야함
        double weight = 70.5; // 배정밀도 표현 방식이며 기본타입
        // 실수 표현 방식의 문제점 : 연산 결과의 오차가 발생한다(근사치 게산법)
        double num2 = 0.1;
        System.out.println(num2 + num2 + num2 + num2 + num2 + num2 + num2 + num2 + num2 + num2);

        // 상수(constant) : 변수와 다른 점은 값이 대입된 후 변경 할 수 없음
        final double TAX_RATE = 0.10; // 세율 변수 상수, 값이 대입된 이후 변경 불가, 관례상 상수의 변수명은 대문자료 표기
        Scanner sc = new Scanner(System.in); // 키보드 입력을 받기 위한 스캐너 객체
        System.out.print("수입을 입력 하세요 : "); // print() 는 줄 바꿈을 하지않음.
        int income = sc.nextInt(); // 스캐너 객체로부터 정수값을 입력 받아 income 변수에 저장
        System.out.println("당신이 내야 할 세금은 " + (income * TAX_RATE) + "입니다");

        // 형 변환 : 정해진 타입을 다른 타입으로 변환하는 것
        // 명시적 형 변환 : 개발자가 의도를 가지로 형을 변환하는 것
        // 묵시적 형 변환 : 컴파일러가 자동으로 유리한 방향으로 형을 변환하는 것
        int kor = 99, eng = 66, mat = 77;
        double avg = (kor + eng + mat) / 3.0;
        System.out.printf("%.2f \n", avg); // 소수점 이하 3번째 자리에서 반올림해서 2번째 자리까지 표시

        // 타입 변환 메서드 : 문자열을 정수나, 실수로 변환 할 때 사용하는 메서드
        String val1 = "0100.234";
        System.out.println(300 + Double.parseDouble(val1));
    }
}
